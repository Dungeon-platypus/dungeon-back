package com.fr.game.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fr.game.entities.PersonnageJoueur;
import com.fr.game.exceptions.PersonnageNotFindException;
import com.fr.game.repositories.PersonnageJoueurRepository;

@Service
public class FeatureCharacterService {

	private PersonnageJoueurRepository personnageJoueurRepository;

	/**
	 * @param personnageRepository
	 */
	public FeatureCharacterService(PersonnageJoueurRepository personnageJoueurRepository) {
		this.personnageJoueurRepository = personnageJoueurRepository;
	}

	/**
	 * @return
	 * 
	 */
	public PersonnageJoueur getFeature(Long id) {

		Optional<PersonnageJoueur> personnageJoueur = this.personnageJoueurRepository.findOneById(id);
		if (personnageJoueur.isPresent()) {
			return personnageJoueur.get();
		} else {
			throw new PersonnageNotFindException("Aucun Personnage trouvé avec cet Id : " + id);
		}
	}

}
