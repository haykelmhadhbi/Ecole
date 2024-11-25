package tn.esprit.examenagil.iservices;

import tn.esprit.examenagil.entities.Classe;

import java.util.List;

public interface IClasseService {

    List<Classe> getAllClasse();

    Classe addClasse (Classe C);

    void deleteClasse(Integer id);

    Classe  updateClasse (Classe classe);

    Classe  getClassebyId(Integer idClasse);
}
