package com.senac.projetopadrao.schedulingtasks;

import com.senac.projetopadrao.model.Satelite;
import com.senac.projetopadrao.repository.SateliteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MonitorarSatelite {
    @Autowired
    SateliteRepository sateliteRepository;

    @Scheduled(fixedRate = 5000)
    public void verificarSatelite(){
        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
        restTemplate = restTemplateBuilder.build();

        Satelite satelite =  restTemplate.getForObject(
                "https://api.wheretheiss.at/v1/satellites/25544",
                Satelite.class);
        System.out.println(satelite);

        Satelite sateliteEncontrado = sateliteRepository.findSateliteByName(satelite.getName());
        if(sateliteEncontrado ==null){
            System.out.println("Criando novo satelite");

            sateliteRepository.save(satelite);

        }else {
            System.out.println("satelite encontrado");

            Satelite sateliteAtualizado = sateliteEncontrado.update(satelite);
            //BeanUtils.copyProperties(satelite, sateliteEncontrado);
            sateliteRepository.save(sateliteAtualizado);
        }

    }
}
