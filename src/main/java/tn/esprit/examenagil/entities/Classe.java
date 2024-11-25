package tn.esprit.examenagil.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import tn.esprit.examenagil.enumeration.Niveau;
import java.util.List;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeClasse;
    private String titre;
    private Niveau niveau;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<CoursClassroom> coursClassrooms;

    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    @JsonIgnore
    private  List <Utilisateur> utilisateurs;
}
