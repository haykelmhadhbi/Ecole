package tn.esprit.examenagil.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.iservices.IClasseService;

@RestController
@RequestMapping("/classe")
@RequiredArgsConstructor
public class ClasseController {
    private  final IClasseService iClasseService;

    @PostMapping
    public ResponseEntity<Classe> addClasse(@RequestBody Classe classe){
        Classe addClasse = iClasseService.addClasse(classe);
        return  new ResponseEntity<>(addClasse, HttpStatus.OK);

    }
}
