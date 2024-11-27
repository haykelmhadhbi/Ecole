package tn.esprit.examenagil.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.enumeration.Niveau;
import tn.esprit.examenagil.iservices.IClasseService;
import tn.esprit.examenagil.iservices.IUtilisateurService;

@RestController
@RequestMapping("/classe")
@RequiredArgsConstructor
public class ClasseController {
    private  final IClasseService iClasseService;
    public  final IUtilisateurService iUtilisateurService;

    @PostMapping
    public ResponseEntity<Classe> addClasse(@RequestBody Classe classe){
        Classe addClasse = iClasseService.addClasse(classe);
        return  new ResponseEntity<>(addClasse, HttpStatus.OK);

    }

}
