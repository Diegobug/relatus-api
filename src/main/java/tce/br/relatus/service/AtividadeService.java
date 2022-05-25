package tce.br.relatus.service;

import org.springframework.stereotype.Service;
import tce.br.relatus.model.Atividade;
import tce.br.relatus.repository.AtividadeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    AtividadeRepository repository;

    public AtividadeService(AtividadeRepository repository){
        this.repository = repository;
    }

    public Atividade insert(Atividade a){
        return repository.save(a);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public List<Atividade> listAll(){
        return repository.findAll();
    }

    public Optional<Atividade> findById(Long id){
        return repository.findById(id);
    }

    public Atividade update(Atividade a){
        return repository.saveAndFlush(a);
    }
}
