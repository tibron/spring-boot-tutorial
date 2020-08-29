package com.example.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("level1")
public class OrderController {
    @GetMapping("level2")
    public String showLevel2(Model model){
        log.info("level1/level2 triggered");
        return "redirect:/";
    }
    @GetMapping("nice")
    public String showSurprise(){
        @Controller
         class NestedController{
            @GetMapping("deep")
            public String nController(){
                log.info("We are in nested");
                return "redirect:/design";
            }
        }
        log.info("we are in \"nice\"");
        return "redirect:/";
    }
}
