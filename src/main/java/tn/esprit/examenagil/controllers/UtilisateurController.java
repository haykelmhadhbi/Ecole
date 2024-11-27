package tn.esprit.examenagil.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.enumeration.Niveau;
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

    @PatchMapping("/{idUtilisateur}/classe/{codeClasse}")
    public ResponseEntity<String> affecterUtilisateurClasse(
            @PathVariable Integer idUtilisateur,
            @PathVariable Integer codeClasse) {
        iUtilisateurService.affecterUtilisateurClasse(idUtilisateur, codeClasse);
        return ResponseEntity.ok("Utilisateur affecté à la classe avec succès !");
    }

    @GetMapping
    public  ResponseEntity<Integer> getNbUtilisateursParNiveau (@RequestBody Niveau niveau){
        Integer numb = iUtilisateurService.nbUtilisateursParNiveau(niveau);
        return  new ResponseEntity<>(numb, HttpStatus.OK);
    }
}
