package com.fr.game.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.game.entities.Personnage;
import com.fr.game.entities.PersonnageJoueur;
import com.fr.game.exceptions.ApplicationException;
import com.fr.game.services.FeatureCharacterService;

@RestController
@RequestMapping("character")
public class FeatureCharacterController {

	private FeatureCharacterService featureCharacterService;

	public FeatureCharacterController(FeatureCharacterService featureCharacterService) {
		this.featureCharacterService = featureCharacterService;
	}

	@GetMapping("self/featureCharacter")
	public Personnage getPersonnageFeature() {
		//TODO ajouter sécu pour reccup' les elements
		//String email = SecurityContextHolder.getContext().getAuthentication().getName();
		PersonnageJoueur personnageFeature = new PersonnageJoueur();
		featureCharacterService.getFeature(null);
		
		
		return null;

	}

	/**
	 * Catch l'exception throw par le service si une annumalie s'est produite dans
	 * le service annonce et renvoie une ResponseEntity avec le statut 404 et le
	 * message de lexception
	 * 
	 * @param e
	 * @return ResponseEntity<String>
	 */
	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<String> onAnnonceException(ApplicationException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
	}
}
