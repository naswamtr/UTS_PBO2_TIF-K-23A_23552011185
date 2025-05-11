

package com.example.demo.repository;

import com.example.demo.model.User;
import com.example.demo.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
    List<ToDo> findByCompleted(boolean completed);
    List<ToDo> findByUser(User user);
    List<ToDo> findByUserAndCompletedTrue(User user);
    List<ToDo> findByUserAndCompletedFalse(User user);

}
