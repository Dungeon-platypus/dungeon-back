package com.fr.game.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Salle extends BaseEntite {

	private String urlImage;
	@OneToMany
	private List<PersonnageNonJoueur> pnjs;
	@OneToMany
	private List<Equipement> lootEquipements;
	@OneToMany
	private List<Consumable> lootConsumables;
	@ManyToOne
	private Donjon donjon; 

	public Salle() {

	}

	public Salle(String urlImage, List<PersonnageNonJoueur> pnjs, List<Equipement> lootEquipements,
			List<Consumable> lootConsumables, Donjon donjon) {
		super();
		this.urlImage = urlImage;
		this.pnjs = pnjs;
		this.lootEquipements = lootEquipements;
		this.lootConsumables = lootConsumables;
		this.donjon = donjon;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public List<PersonnageNonJoueur> getPnjs() {
		return pnjs;
	}

	public void setPnjs(List<PersonnageNonJoueur> pnjs) {
		this.pnjs = pnjs;
	}

	public List<Equipement> getLootEquipements() {
		return lootEquipements;
	}

	public void setLootEquipements(List<Equipement> lootEquipements) {
		this.lootEquipements = lootEquipements;
	}

	public List<Consumable> getLootConsumables() {
		return lootConsumables;
	}

	public void setLootConsumables(List<Consumable> lootConsumables) {
		this.lootConsumables = lootConsumables;
	}

	public Donjon getDonjon() {
		return donjon;
	}

	public void setDonjon(Donjon donjon) {
		this.donjon = donjon;
	}

	


}
