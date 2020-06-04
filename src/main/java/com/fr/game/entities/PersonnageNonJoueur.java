package com.fr.game.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fr.game.entities.utils.Statistique;

@Entity
public class PersonnageNonJoueur extends Personnage {

	private Double gainExperience;

	private String race;

	@OneToMany
	private List<Equipement> lootEquipements;
	@OneToMany
	private List<Consumable> lootConsumables;
	
	
	public PersonnageNonJoueur() {

	}


	public PersonnageNonJoueur(Double gainExperience, String race, List<Equipement> lootEquipements,
			List<Consumable> lootConsumables) {
		super();
		this.gainExperience = gainExperience;
		this.race = race;
		this.lootEquipements = lootEquipements;
		this.lootConsumables = lootConsumables;
	}


	public Double getGainExperience() {
		return gainExperience;
	}


	public void setGainExperience(Double gainExperience) {
		this.gainExperience = gainExperience;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
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

	
	
	

}
