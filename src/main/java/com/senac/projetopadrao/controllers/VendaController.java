package com.senac.projetopadrao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendas")
public class VendaController {

    @GetMapping("/listar")
    public String listaVendas() {
        System.out.println("vendas");

        return "vendas";
    }

}
