package com.algaworks.algafoodapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Novo teste reload!";
    }
}
