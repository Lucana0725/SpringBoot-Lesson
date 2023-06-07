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

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class MotosController {

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
    brands.add(new Brand("01", "Honda"));
    brands.add(new Brand("02", "Kawasaki"));
    brands.add(new Brand("03", "Yamaha"));
    brands.add(new Brand("04", "Suzuki"));

    // バイク
    List<Motorcycle> motos = new ArrayList<>();
    motos.add(new Motorcycle(1, "GB350", 800, 1, "空冷", 500000, "いい音！", new Brand("01", "Honda"), 1, null, null));
    motos.add(new Motorcycle(2, "Ninja", 800, 2, "水冷", 1000000, "かっこいい！", new Brand("02", "Kawasaki"), 1, null, null));
    motos.add(new Motorcycle(3, "Z900RS", 820, 4, "水冷", 1380000, "音めっちゃかっこいい！", new Brand("02", "Kawasaki"), 1, null, null));

    model.addAttribute("brands", brands);
    model.addAttribute("motos", motos);

    log.debug("motos: {}", motos);  // デバッグログ出力をする。@slf4jより。

    return "moto_list";
  }
}
