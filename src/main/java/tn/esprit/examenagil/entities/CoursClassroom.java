package tn.esprit.examenagil.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.examenagil.enumeration.Specialite;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity

public class CoursClassroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCours;
    private String nom;
    private Integer nbHeures;
    private Boolean archive;
    private Specialite specialite;

    @ManyToOne
    Classe classe;
}
