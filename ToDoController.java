package com.example.demo.controller;

import com.example.demo.model.ToDo;
import com.example.demo.model.User;
import com.example.demo.repository.ToDoRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepo;

    // Tampilkan daftar tugas
    @GetMapping
    public String getTodos(@RequestParam(value = "status", required = false) String status,
                           Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        List<ToDo> todos;
        if ("selesai".equalsIgnoreCase(status)) {
            todos = toDoRepo.findByUserAndCompletedTrue(user);
        } else if ("belum".equalsIgnoreCase(status)) {
            todos = toDoRepo.findByUserAndCompletedFalse(user);
        } else {
            todos = toDoRepo.findByUser(user);
        }

        model.addAttribute("todos", todos);
        model.addAttribute("newTodo", new ToDo());
        model.addAttribute("userUsername", user.getUsername()); // dipakai di halaman
        return "index";
    }

    // Tambah tugas baru
    @PostMapping
    public String addTodo(@RequestParam String task, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        ToDo todo = new ToDo();
        todo.setTask(task);
        todo.setUser(user);
        toDoRepo.save(todo);
        return "redirect:/todos";
    }

    // Hapus tugas
    @PostMapping("/delete")
    public String deleteTodo(@RequestParam Long id, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        toDoRepo.findById(id).ifPresent(todo -> {
            if (todo.getUser().getId().equals(user.getId())) {
                toDoRepo.delete(todo);
            }
        });

        return "redirect:/todos";
    }

    // Tandai selesai/belum
    @PostMapping("/update/{id}")
    public String updateTodo(@PathVariable Long id, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        toDoRepo.findById(id).ifPresent(todo -> {
            if (todo.getUser().getId().equals(user.getId())) {
                todo.setCompleted(!todo.isCompleted());
                toDoRepo.save(todo);
            }
        });

        return "redirect:/todos";
    }

    // Edit tugas
    @PostMapping("/edit/{id}")
    public String editTodo(@PathVariable Long id, @RequestParam String task, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) return "redirect:/login";

        toDoRepo.findById(id).ifPresent(todo -> {
            if (todo.getUser().getId().equals(user.getId())) {
                todo.setTask(task);
                toDoRepo.save(todo);
            }
        });

        return "redirect:/todos";
    }

    // Logout
    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }

    // Halaman login
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
