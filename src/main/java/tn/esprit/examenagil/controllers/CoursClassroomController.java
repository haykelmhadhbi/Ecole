package tn.esprit.examenagil.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenagil.entities.CoursClassroom;
import tn.esprit.examenagil.enumeration.Niveau;
import tn.esprit.examenagil.enumeration.Specialite;
import tn.esprit.examenagil.iservices.ICoursClassroomService;

@RestController
@RequestMapping("/coursClassroom")
@RequiredArgsConstructor
public class CoursClassroomController {
    private  final ICoursClassroomService iCoursClassroomService;

    @PostMapping("/{codeClasse}")
    public ResponseEntity<CoursClassroom> ajouterCoursClassroom(
            @RequestBody CoursClassroom cc,
            @PathVariable Integer codeClasse
    ) {
        CoursClassroom createdCours = iCoursClassroomService.ajouterCoursClassroom(cc, codeClasse);
        return new ResponseEntity<>(createdCours, HttpStatus.CREATED);
    }

    @DeleteMapping("/desaffecter/{idCours}")
    public  ResponseEntity<String> desaffecterCours (@PathVariable Integer idCours){
        try {
            iCoursClassroomService.desaffecterCoursClassroomClasse(idCours);
            return ResponseEntity.ok("Cours désaffecté de la classe 4AG1.");


        }catch (Exception e){
            return ResponseEntity.status(500).body("Erreur lors de la désaffectation du cours.");

        }
    }

    @GetMapping("/nbHeuresParSpecEtNiv")
    public Integer getNbHeuresParSpecEtNiv() {
        return iCoursClassroomService.nbHeuresParSpecEtNiv(Specialite.AGRICULTURE, Niveau.QUATRIEME);
    }

}
