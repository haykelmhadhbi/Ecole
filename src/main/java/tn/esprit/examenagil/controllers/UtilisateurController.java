package tn.esprit.examenagil.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.iservices.IUtilisateurService;

@RestController
@RequestMapping("/utilisateur")
@RequiredArgsConstructor
public class UtilisateurController {
    private final IUtilisateurService iUtilisateurService;
    @PostMapping
    public ResponseEntity<Utilisateur>addUtilisateur(@RequestBody Utilisateur utilisateur){
        Utilisateur createUtilisateur = iUtilisateurService.addUtilisateur(utilisateur);
        return  new ResponseEntity<>(createUtilisateur, HttpStatus.CREATED);

    }
}