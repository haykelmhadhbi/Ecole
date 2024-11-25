package tn.esprit.examenagil.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.examenagil.entities.Classe;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.iservices.IUtilisateurService;
import tn.esprit.examenagil.repositories.ClasseRepository;
import tn.esprit.examenagil.repositories.UtilisateurRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class UtilisateurService implements IUtilisateurService {

    private final UtilisateurRepository utilisateurRepository;
    private  final ClasseRepository classeRepository;

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return null;
    }

    @Override
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
            return utilisateurRepository.save(utilisateur);


    }

    @Override
    public void deleteUtilisateur(Integer id) {
        utilisateurRepository.deleteById(id);

    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
        if (utilisateurRepository.existsById(utilisateur.getIdUtilisateur())) {
            return utilisateurRepository.save(utilisateur); // Mettre à jour un utilisateur
        }
        return null; // L'utilisateur n'existe pas
    }

    @Override
    public Utilisateur getUtilisateurById(Integer idUtilisateur) {
        return null;
    }

    @Override
    public void affecterUtilisateurClasse(Integer idUtilisateur, Integer codeClasse) {

        Utilisateur utilisateur = utilisateurRepository.findById( idUtilisateur)
                .orElseThrow(() -> new IllegalArgumentException("Utilisateur non trouvé avec l'ID: " + idUtilisateur));

        Classe classe = classeRepository.findById(codeClasse)
                .orElseThrow(() -> new IllegalArgumentException("Classe non trouvée avec le code: " + codeClasse));

        utilisateur.setClasse(classe);
        utilisateurRepository.save(utilisateur);
    }
}
