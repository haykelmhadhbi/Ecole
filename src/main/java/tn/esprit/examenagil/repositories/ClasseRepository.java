package tn.esprit.examenagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenagil.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe,Integer> {
}
