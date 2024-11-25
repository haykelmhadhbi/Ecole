package tn.esprit.examenagil.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.iservices.IClasseService;
import tn.esprit.examenagil.repositories.ClasseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClasseService implements IClasseService {

    private final ClasseRepository classeRepository;

    @Override
    public List<Classe> getAllClasse() {
        return null;
    }

    @Override
    public Classe addClasse(Classe C) {
        return classeRepository.save(C);
    }

    @Override
    public void deleteClasse(Integer id) {

    }

    @Override
    public Classe updateClasse(Classe classe) {
        return null;
    }

    @Override
    public Classe getClassebyId(Integer idClasse) {
        return null;
    }
}
