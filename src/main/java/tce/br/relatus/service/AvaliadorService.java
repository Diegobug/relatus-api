package tce.br.relatus.service;

import org.springframework.stereotype.Service;
import tce.br.relatus.model.Avaliador;
import tce.br.relatus.repository.AvaliadorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliadorService {

    AvaliadorRepository repository;

    public AvaliadorService(AvaliadorRepository repository){
        this.repository = repository;
    }

    public Avaliador insert(Avaliador a){
        return repository.save(a);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Avaliador>  listAll(){
        return repository.findAll();
    }

    public Optional<Avaliador> findById(Long id){
        return repository.findById(id);
    }

    public Avaliador update(Avaliador a){
        return repository.saveAndFlush(a);
    }
}
