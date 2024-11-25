package tn.esprit.examenagil.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenagil.entities.CoursClassroom;
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

}
