package com.fr.game.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fr.game.entities.utils.RoleJoueur;

@Entity
public class Joueur extends BaseEntite {

	private String nom;

	private String prenom;

	private String email;

	private String login;

	private String motDePasse;
	@OneToMany
	private List<PersonnageJoueur> personnages;

	@JsonManagedReference
	@OneToMany(mappedBy = "joueur", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<RoleJoueur> roles;

	public Joueur() {

	}

	public Joueur(String nom, String prenom, String email, String motDePasse, List<PersonnageJoueur> personnages,
			List<RoleJoueur> roles, String login) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.personnages = personnages;
		this.roles = roles;
		this.login = login;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<PersonnageJoueur> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<PersonnageJoueur> personnages) {
		this.personnages = personnages;
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
