package com.example.web;

import com.example.data.Ingredient;
import com.example.data.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignController {
    @GetMapping
    public String showDesignForms(Model model){
    List<Ingredient> ingredients = Arrays.asList(
            new Ingredient("W1","Wrap1",Ingredient.Type.WRAP),
            new Ingredient("W2","Wrap2",Ingredient.Type.WRAP),
            new Ingredient("W3","Wrap3",Ingredient.Type.WRAP),
            new Ingredient("P1","Protein1",Ingredient.Type.PROTEINE),
            new Ingredient("P2","Protein2",Ingredient.Type.PROTEINE),
            new Ingredient("P3","Protein3",Ingredient.Type.PROTEINE),
            new Ingredient("V1","Veggie1",Ingredient.Type.VEGGIES),
            new Ingredient("V2","Veggie2",Ingredient.Type.VEGGIES),
            new Ingredient("V3","Veggie3",Ingredient.Type.VEGGIES),
            new Ingredient("C1","Cheese1",Ingredient.Type.CHEESE),
            new Ingredient("C2","Cheese2",Ingredient.Type.CHEESE),
            new Ingredient("C3","Cheese3",Ingredient.Type.CHEESE),
            new Ingredient("S1","Sauce1",Ingredient.Type.SAUSE),
            new Ingredient("S2","Sauce2",Ingredient.Type.SAUSE),
            new Ingredient("S3","Sauce3",Ingredient.Type.SAUSE)
            );
        Ingredient.Type[] types = Ingredient.Type.values();
        for(Ingredient.Type type:types) {
            List<Ingredient> items = ingredients.stream().filter(item -> type.equals(item.getType())).collect(Collectors.toList());
            model.addAttribute(type.toString().toLowerCase(), items);
            log.warn(type.toString().toLowerCase());
        }
        model.addAttribute("design", new Taco());
        return "design-page";
    }
    @PostMapping
    public String postProcessing(Object design){
        log.info("New order");
        return "redirect:/";
    }
}
