package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Random;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        List<String> stringList = List.of(
                "Logic will get you from A to B. Imagination will take you everywhere.",
                "There are 10 kinds of people. Those who know binary and those who don't.",
                "There are two ways of constructing a software design. One way is to make it so simple that there are obviously no deficiencies and the other is to make it so complicated that there are no obvious deficiencies.",
                "It's not that I'm so smart, it's just that I stay with problems longer.",
                "It is pitch dark. You are likely to be eaten by a grue.");
        Random random = new Random();
        int randomNumber = random.nextInt(stringList.size());
        model.addAttribute("dynamicText", stringList.get(randomNumber));
        return "index";
    }

}
