package com.app.todo.controller;

import com.app.todo.model.Task;
import com.app.todo.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {

        //dependency injection
        private final TaskService taskService;

        //constructor
        public TaskController(TaskService taskService) {
            this.taskService = taskService;
        }

        //get mapping for the root URL
        @GetMapping
        public String getTasks(Model model){
            List<Task> tasks = taskService.getAllTasks();
            model.addAttribute("tasks", tasks);
            return "tasks";
        }

        //post mapping to create a new task
        @PostMapping
        public String createTask(@RequestParam String title){
            taskService.createTask(title);
            return "redirect:/";
        }

        //get mapping to delete a task by id
        @GetMapping("/{id}/delete")
        public String deleteTask(@PathVariable Long id){
            taskService.deleteTask(id);
            return "redirect:/";
        }

        //get mapping to toggle a task's completed status by id
        @GetMapping("/{id}/toggle")
        public String toggleTask(@PathVariable Long id){
            taskService.toggleTask(id);
            return "redirect:/";
        }
}
