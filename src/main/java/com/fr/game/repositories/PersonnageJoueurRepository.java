package com.fr.game.repositories;

import com.fr.game.entities.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PersonnageJoueurRepository extends JpaRepository<PersonnageJoueur, Long> {

	Optional<PersonnageJoueur> findOneById(Long id);

}
