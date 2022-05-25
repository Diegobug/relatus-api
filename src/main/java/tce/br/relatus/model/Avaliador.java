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
public class Avaliador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)

    private long id;
    private Date removed = null;

    @OneToOne
    @MapsId
    @JoinColumn(name = "colaborador_id")
    Colaborador colaborador;

}
