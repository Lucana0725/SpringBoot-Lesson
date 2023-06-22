package com.example.motocatalogue.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.motocatalogue.beans.Brand;
import com.example.motocatalogue.beans.Motorcycle;
import com.example.motocatalogue.services.MotosService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MotosController {

  @Autowired
  MotosService service;

  // ログ部品が使えるようになる(伝統的な書き方)
  // private static final Logger log = LoggerFactory.getLogger(MotosController.class);
  
  @RequestMapping("/hello")
  public String hello(@RequestParam String name, Model model) {
    model.addAttribute("name", name);
    return "test";
  }

  @GetMapping("/motos")
  public String motos(Model model) {
    // ブランド
    List<Brand> brands = new ArrayList<>();
    brands = service.getBrands();

    // バイク
    List<Motorcycle> motos = new ArrayList<>();
    motos = service.getMotos();

    model.addAttribute("brands", brands);
    model.addAttribute("motos", motos);

    log.debug("motos: {}", motos);  // デバッグログ出力をする。@slf4jより。

    return "moto_list";
  }
}
