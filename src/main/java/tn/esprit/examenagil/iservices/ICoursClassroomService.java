package tn.esprit.examenagil.iservices;

import tn.esprit.examenagil.entities.CoursClassroom;
import tn.esprit.examenagil.enumeration.Niveau;
import tn.esprit.examenagil.enumeration.Specialite;

import java.util.List;

public interface ICoursClassroomService {

    List<CoursClassroom> getAllCoursClassrooms(); // Récupérer tous les CoursClassroom

    CoursClassroom addCoursClassroom(CoursClassroom coursClassroom); // Ajouter un CoursClassroom

    void deleteCoursClassroom(Integer id); // Supprimer un CoursClassroom par son ID

    CoursClassroom updateCoursClassroom(CoursClassroom coursClassroom); // Mettre à jour un CoursClassroom

    CoursClassroom getCoursClassroomById(Integer idCours);

    public CoursClassroom ajouterCoursClassroom (CoursClassroom cc,  Integer codeClasse);

    public void desaffecterCoursClassroomClasse(Integer idCours);

    public void archiverCoursClassrooms();
    public Integer nbHeuresParSpecEtNiv(Specialite sp, Niveau nv);


}
