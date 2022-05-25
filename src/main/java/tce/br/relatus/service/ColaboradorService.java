package tce.br.relatus.service;

import org.springframework.stereotype.Service;
import tce.br.relatus.model.Colaborador;
import tce.br.relatus.repository.ColaboradorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ColaboradorService {

    ColaboradorRepository repository;

    public ColaboradorService(ColaboradorRepository repository){
        this.repository = repository;
    }

    public Colaborador insert(Colaborador c){
        return repository.save(c);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Colaborador> listAll(){
        return repository.findAll();
    }

    public Optional<Colaborador> findById(Long id){
        return repository.findById(id);
    }

    public Colaborador update(Colaborador c){
        return repository.saveAndFlush(c);
    }
}
