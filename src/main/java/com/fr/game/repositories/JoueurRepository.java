package com.fr.game.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fr.game.entities.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur, Long> {

	Optional <Joueur> findByEmail(String username);

}
