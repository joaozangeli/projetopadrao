package com.senac.projetopadrao.controllers;
/*
import com.senac.projetopadrao.model.Produto;
import com.senac.projetopadrao.model.Satelite;
import com.senac.projetopadrao.repository.SateliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
@RequestMapping("/satelite")
public class SateliteController {
    @Autowired
    SateliteRepository sateliteRepository;

    @GetMapping("/")
    public ModelAndView listaSatelite() {
        ModelAndView mv = new ModelAndView("satelite");
        ArrayList<Produto> satelite = new ArrayList<>();
        satelite = (ArrayList<Satelite>) sateliteRepository.findSateliteByName(String name);
        mv.addObject("satelite", satelite);

        return mv;
    }
}
*/