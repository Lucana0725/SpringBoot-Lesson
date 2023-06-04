package com.example.motocatalogue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MotosController {
  
  @RequestMapping("/hello")
  public String hello(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "test";
  }

  @GetMapping("/motos")
  public String motos() {
    return "moto_list";
  }
}
