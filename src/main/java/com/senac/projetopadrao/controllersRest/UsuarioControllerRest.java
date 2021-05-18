package com.senac.projetopadrao.controllersRest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioControllerRest {

    @PostMapping("/add")
    public String addUsuario(){

        return "usuario adicionado";
    }
}
