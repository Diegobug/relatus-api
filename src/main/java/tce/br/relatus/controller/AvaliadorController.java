package tce.br.relatus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tce.br.relatus.model.Avaliador;
import tce.br.relatus.service.AvaliadorService;

import java.util.List;

@RestController
@RequestMapping
public class AvaliadorController {

    AvaliadorService service;

    public AvaliadorController(AvaliadorService service){
        this.service = service;
    }

    @GetMapping
    public List<Avaliador> listAll(){
        return service.listAll();
    }
}
