package tn.esprit.examenagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.CoursClassroom;
import tn.esprit.examenagil.enumeration.Niveau;

public interface ClasseRepository extends JpaRepository<Classe,Integer> {


}
