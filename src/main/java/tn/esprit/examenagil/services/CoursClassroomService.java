package tn.esprit.examenagil.services;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.CoursClassroom;
import tn.esprit.examenagil.enumeration.Niveau;
import tn.esprit.examenagil.enumeration.Specialite;
import tn.esprit.examenagil.iservices.ICoursClassroomService;
import tn.esprit.examenagil.repositories.ClasseRepository;
import tn.esprit.examenagil.repositories.CoursClassroomRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class CoursClassroomService implements ICoursClassroomService {

    private final CoursClassroomRepository coursClassroomRepository;
    private final ClasseRepository classeRepository;

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

    @Override
    public void desaffecterCoursClassroomClasse(Integer idCours) {

        CoursClassroom cours = coursClassroomRepository.findById(idCours).orElse(null);

      if (cours!=null){
          Classe classe = cours.getClasse();
          if(classe!=null){
              if (classe.getTitre().equals("4AG1")){
                  cours.setClasse(null);
                  coursClassroomRepository.save(cours);
                  System.out.println("Cours désaffecté de la classe 4AG1.");

              }
          } else {
              System.out.println("Aucune classe pour 4AG1.");
          }
          }
      }

    @Override
    @Scheduled(fixedRate = 60000) // 60000 ms = 60 secondes
    public void archiverCoursClassrooms() {
        Iterable<CoursClassroom> coursList = coursClassroomRepository.findAll();
        for(CoursClassroom coursClassroom: coursList){
            coursClassroom.setArchive(true);
            coursClassroomRepository.save(coursClassroom);
        }
        System.out.println("Tous les cours ont été archivés.");

    }

    @Override
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv) {
        Integer totalHeures=0;
        Iterable<CoursClassroom> coursList = coursClassroomRepository.findAll();
       for (CoursClassroom coursClassroom: coursList){
           if (coursClassroom.getSpecialite().equals(sp) &&
                   coursClassroom.getClasse() != null &&
                   coursClassroom.getClasse().getNiveau() != null &&
                   coursClassroom.getClasse().getNiveau().equals(nv)) {

               totalHeures += coursClassroom.getNbHeures();
           }
       }
       return  totalHeures;

    }
}
