package com.fr.game.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Item extends BaseEntite {

	private String nom;
	private String urlImage;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

}
