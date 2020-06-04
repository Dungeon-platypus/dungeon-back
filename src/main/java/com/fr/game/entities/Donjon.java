package com.fr.game.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Donjon extends BaseEntite {

	private String nom;
	@OneToMany
	private List<Salle> salles;
	private String urlImage;

	public Donjon() {

	}

	public Donjon(String nom, List<Salle> salles, String urlImage) {
		super();
		this.nom = nom;
		this.salles = salles;
		this.urlImage = urlImage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Salle> getSalles() {
		return salles;
	}

	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
