package com.projects.devlink.controller;

import com.projects.devlink.domain.User.User;
import com.projects.devlink.domain.User.dto.NewUserData;
import com.projects.devlink.domain.User.repository.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String registerPage() {
        return "register-page";
    }

    @PostMapping
    @Transactional
    public String registerUser(@Valid NewUserData data, Model model, BindingResult result) {
            boolean hasError = false;
            if (result.hasErrors()) {
                return "register-page";
            }
            if (userRepository.findByEmail(data.email()) != null) {
                model.addAttribute("errorEmail", "Esse email já existe.");
                hasError = true;
            }
            if (userRepository.findByNickname(data.nickname()) != null) {
                model.addAttribute("errorNick", "Esse username já existe.");
                hasError = true;
            }
            if (hasError) {
                return "register-page";
            }
            String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
            User newUser = new User(data, encryptedPassword);
            userRepository.save(newUser);
            return "redirect:/login";
    }

}
