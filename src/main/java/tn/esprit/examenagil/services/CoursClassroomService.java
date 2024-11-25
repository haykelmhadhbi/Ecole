package tn.esprit.examenagil.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.CoursClassroom;
import tn.esprit.examenagil.iservices.ICoursClassroomService;
import tn.esprit.examenagil.repositories.ClasseRepository;
import tn.esprit.examenagil.repositories.CoursClassroomRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class CoursClassroomService implements ICoursClassroomService {

    private  final CoursClassroomRepository coursClassroomRepository;
    private  final ClasseRepository classeRepository;
    @Override
    public List<CoursClassroom> getAllCoursClassrooms() {
        return null;
    }

    @Override
    public CoursClassroom addCoursClassroom(CoursClassroom coursClassroom) {
        return null;
    }

    @Override
    public void deleteCoursClassroom(Integer id) {

    }

    @Override
    public CoursClassroom updateCoursClassroom(CoursClassroom coursClassroom) {
        return null;
    }

    @Override
    public CoursClassroom getCoursClassroomById(Integer idCours) {
        return null;
    }

    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc, Integer codeClasse) {
        Classe classe = classeRepository.findById(codeClasse)
        .orElseThrow(() -> new RuntimeException("Classe avec le code " + codeClasse + " introuvable"));
        cc.setClasse(classe);

        return coursClassroomRepository.save(cc);
    }
}
