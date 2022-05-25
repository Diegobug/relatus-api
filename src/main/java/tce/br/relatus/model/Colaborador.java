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
public class Colaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long id;

    private String nome;
    private String email;
    private String setor;
    private Long matricula;
    private Date removed = null;

    @OneToOne(mappedBy = "colaborador")
    Avaliador avaliador;

    public Colaborador(String nome, String email, Long matricula) {
    }
}
