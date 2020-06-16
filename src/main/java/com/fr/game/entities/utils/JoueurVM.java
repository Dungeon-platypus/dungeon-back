package com.fr.game.entities.utils;

import java.util.ArrayList;
import java.util.List;

import com.fr.game.entities.Joueur;

/**
 * Structure modèlisant un joueur servant à communiquer avec l'extérieur (WEB
 * API).
 */
public class JoueurVM {

	private String email;
	private String nom;
	private String prenom;
	private List<RoleJoueur> roles = new ArrayList<>();
	private String login;

	public JoueurVM(Joueur joueur) {
		this.email = joueur.getEmail();
		this.nom = joueur.getNom();
		this.prenom = joueur.getPrenom();
		this.roles = joueur.getRoles();
		this.login = joueur.getLogin();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<RoleJoueur> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleJoueur> roles) {
		this.roles = roles;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
}
