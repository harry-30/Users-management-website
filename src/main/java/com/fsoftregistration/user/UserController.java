package com.fsoftregistration.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }

    @RequestMapping("/users/new")
    public String shownNewForm(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("pageTitle", "Add New User");

        return "form";
    }

    @RequestMapping(value = "/users/save", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") User user, RedirectAttributes ra){
        service.save(user);
        ra.addFlashAttribute("message", "The user " + user.getName()
                + " has been successfully saved");

        return "redirect:/users";
    }

    @RequestMapping("/users/edit{id}")
    public String showEditForm(@PathVariable("id") Integer id, Model model, RedirectAttributes ra) {
        try {
            User user = service.get(id);
            model.addAttribute("user", user);
            model.addAttribute("pageTitle", "Edit " + user.getName());

            return "form";
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", "Editing failed");

            return "redirect:/users";
        }
    }

    @RequestMapping("/users/delete{id}")
    public String deleteUser(@PathVariable("id") Integer id, RedirectAttributes ra) {
        try {
            User user = service.get(id);
            service.delete(id);
            ra.addFlashAttribute("message", "The user " + user.getName()
                    + " has been successfully deleted");
        } catch (UserNotFoundException e) {
            ra.addFlashAttribute("message", e.getMessage());
        }

        return "redirect:/users";
    }
}
