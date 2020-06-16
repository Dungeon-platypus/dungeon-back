package com.fr.game;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fr.game.entities.Joueur;
import com.fr.game.entities.utils.Role;
import com.fr.game.entities.utils.RoleJoueur;
import com.fr.game.repositories.JoueurRepository;

@Component
public class StartupListener {

	private String appVersion;
	private PasswordEncoder passwordEncoder;
	private JoueurRepository joueurRepository;

	public StartupListener(PasswordEncoder passwordEncoder, @Value("${app.version}") String appVersion, JoueurRepository joueurRepository) {
		this.appVersion = appVersion;
		this.passwordEncoder = passwordEncoder;
		;

	}

	@EventListener(ContextRefreshedEvent.class)
	public void onStart() {
		Joueur joueur = new Joueur();
		joueur.setNom("admin");
		joueur.setRoles(Arrays.asList(new RoleJoueur(joueur, Role.ROLE_ADMIN),
				new RoleJoueur(joueur, Role.ROLE_JOUEUR)));
		joueur.setEmail("admin@dev.fr");
		joueur.setMotDePasse("platypus");

	}

}
