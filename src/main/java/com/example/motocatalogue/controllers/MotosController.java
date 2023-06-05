package com.example.motocatalogue.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.motocatalogue.bean.Brand;
import com.example.motocatalogue.bean.Motorcycle;

@Controller
public class MotosController {
  
  @RequestMapping("/hello")
  public String hello(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "test";
  }

  @GetMapping("/motos")
  public String motos() {
    // ブランド
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand("01", "Honda"));
    brands.add(new Brand("02", "Kawasaki"));

    // バイク
    List<Motorcycle> motos = new ArrayList<>();
    motos.add(new Motorcycle(1, "GB350", 800, 1, "空冷", 500000, "いい音！", new Brand("01", "Honda"), 1, null, null));
    motos.add(new Motorcycle(2, "Ninja", 800, 2, "水冷", 1000000, "かっこいい！", new Brand("02", "Kawasaki"), 1, null, null));

    return "moto_list";
  }
}
