package tn.esprit.examenagil.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Ce pointcut capture les méthodes commençant par "ajouter" dans les classes du package service
    @Before("execution(* tn.esprit.examenagil.services.*.add*(..))")
    public void logBeforeMethodExecution() {
        // Affichage du message avant l'exécution de chaque méthode cible
        System.out.println("Début Exécution :");
    }
}