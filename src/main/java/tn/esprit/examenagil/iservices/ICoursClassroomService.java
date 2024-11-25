package tn.esprit.examenagil.iservices;

import tn.esprit.examenagil.entities.CoursClassroom;

import java.util.List;

public interface ICoursClassroomService {

    List<CoursClassroom> getAllCoursClassrooms(); // Récupérer tous les CoursClassroom

    CoursClassroom addCoursClassroom(CoursClassroom coursClassroom); // Ajouter un CoursClassroom

    void deleteCoursClassroom(Integer id); // Supprimer un CoursClassroom par son ID

    CoursClassroom updateCoursClassroom(CoursClassroom coursClassroom); // Mettre à jour un CoursClassroom

    CoursClassroom getCoursClassroomById(Integer idCours);

    public CoursClassroom ajouterCoursClassroom (CoursClassroom cc,  Integer codeClasse);



}
