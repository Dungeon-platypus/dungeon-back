package com.fr.game.entities.utils;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fr.game.entities.Joueur;

@Entity
public class RoleJoueur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "joueur_id")
	private Joueur joueur;

	@Enumerated(EnumType.STRING)
	private Role role;

	public RoleJoueur() {
	}

	public RoleJoueur(Joueur joueur, Role role) {
		this.joueur = joueur;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Joueur getCollegue() {
		return joueur;
	}

	public void setCollegue(Joueur joueur) {
		this.joueur = joueur;
	}

	@Override
	public String toString() {
		return ""+ getRole() ;
	}

	
}
