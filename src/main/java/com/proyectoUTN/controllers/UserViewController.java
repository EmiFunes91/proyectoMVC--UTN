package com.proyectoUTN.controllers;

import com.proyectoUTN.models.UserModel;
import com.proyectoUTN.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserViewController {

    @Autowired
    private UserService userService;

    // Método para retornar la vista Thymeleaf con la lista de usuarios
    @GetMapping("/users/view")
    public String viewUsers(Model model) {
        List<UserModel> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users"; // El nombre de la plantilla Thymeleaf (users.html en /templates)
    }
}

