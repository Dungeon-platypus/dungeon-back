package com.fr.game.entities;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.fr.game.entities.utils.Classe;
import com.fr.game.entities.utils.Statistique;

@MappedSuperclass
public abstract class Personnage extends BaseEntite {

	
	@Embedded
	private Statistique baseStatistiques;
	
	private String pseudo;

	@Enumerated(EnumType.STRING)
	private Classe classe;

	private String imageURL;

	private Integer niveau;

	
	public Personnage() {
		
	}
	
	public Personnage(Classe classe, String pseudo, Statistique baseStatistiques, String imageURL, Integer niveau) {
		this.baseStatistiques = baseStatistiques;
		this.pseudo = pseudo;
		this.classe = classe;
		this.imageURL = imageURL;
		this.niveau = niveau;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public Integer getNiveau() {
		return niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public Statistique getBaseStatistiques() {
		return baseStatistiques;
	}

	public void setBaseStatistiques(Statistique baseStatistiques) {
		this.baseStatistiques = baseStatistiques;
	}

	
}
