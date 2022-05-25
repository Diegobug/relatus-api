package tce.br.relatus.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;
    private String descricao;
    private Date inicio_atividade;
    private Date fim_atitivade;
    private String status_validacao;
    private Boolean atividade_retroativa;
    private Date removed = null;



}
