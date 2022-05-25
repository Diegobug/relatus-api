package tce.br.relatus.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tce.br.relatus.dto.ColaboradorDtoRequest;
import tce.br.relatus.model.Colaborador;
import tce.br.relatus.service.ColaboradorService;

import java.util.List;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    ColaboradorService service;

    public ColaboradorController(ColaboradorService service){
        this.service = service;
    }

    @GetMapping
    public List<Colaborador> listAll(){
        return service.listAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Colaborador> findById(@PathVariable Long id){
        return service
                .findById(id)
                .map( colaborador -> {
                    return ResponseEntity.ok(colaborador);
                }).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Colaborador> insert(@RequestBody ColaboradorDtoRequest dto){
        return ResponseEntity.status(201).body(service.insert(dto.convertToColaborador()));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Colaborador> update(@RequestBody Colaborador c, @PathVariable Long id){
        return service
                .findById(id)
                .map( colaborador -> {
                    service.update(c);
                    return ResponseEntity.ok().body(c);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return service
                .findById(id)
                .map( colaborador -> {
                    service.delete(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());

    }

}
