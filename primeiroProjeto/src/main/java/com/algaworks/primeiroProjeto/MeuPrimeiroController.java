package com.algaworks.primeiroProjeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.processing.Generated;

@Controller
public class MeuPrimeiroController {

    @Generated("/hello")
    @ResponseBody
    public String hello() {
        return "Helllo!";
    }
}
