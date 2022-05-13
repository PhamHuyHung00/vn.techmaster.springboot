package com.example.demo.controller;

import com.example.demo.model.Employer;
import com.example.demo.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;


@Controller
public class EmployerController {
    @Autowired
    EmployerRepository employerRepository;

    @GetMapping("")
    public String index(Model model) {
        List employerList = employerRepository.findAll();
        model.addAttribute("employers", employerList);
        return "index";
    }

    @GetMapping("/employer/create")
    public String create(Model model) {
        model.addAttribute("employer", new Employer());
        return "/create";
    }

    @PostMapping("/employer/save")
    public String save(Employer employer, RedirectAttributes redirect) {
        employer.setId((int) (Math.random() * 10000));
        employerRepository.save(employer);
        redirect.addFlashAttribute("success", "Saved employer successfully!");
        return "redirect:/";
    }

    @GetMapping("/employer/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("employer", employerRepository.findById(id));
        return "/edit";
    }

    @PostMapping("/employer/update")
    public String update(Employer employer, RedirectAttributes redirect) {
        employerRepository.update(employer.getId(), employer);
        redirect.addFlashAttribute("success", "Modified employer successfully!");
        return "redirect:/";
    }

    @GetMapping("/employer/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("employer", employerRepository.findById(id));
        return "/delete";
    }
    @PostMapping("/employer/delete")
    public String delete(Employer employer, RedirectAttributes redirect) {
        employerRepository.remove(employer.getId());
        redirect.addFlashAttribute("success", "Removed employer successfully!");
        return "redirect:/";
    }

}
