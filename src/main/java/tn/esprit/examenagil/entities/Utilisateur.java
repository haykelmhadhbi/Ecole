package tn.esprit.examenagil.entities;

import jakarta.persistence.*;
import lombok.*;
;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idUtilisateur;
    private String prenom ;
    private String nom;
    private String password;

    @ManyToOne
    private Classe classe;


}
