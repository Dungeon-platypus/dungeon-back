package com.fr.game.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fr.game.entities.utils.Statistique;

@Entity
public class PersonnageJoueur extends Personnage {

	private Double experience;
	@OneToMany
	private List<Equipement> equipements;
	@OneToMany
	private List<Consumable> consumables;
	
	@OneToOne
	private Salle salleActuel; 

	public PersonnageJoueur() {

	}

	public PersonnageJoueur(Double experience, List<Equipement> equipements, List<Consumable> consumables,
			Salle salleActuel) {
		super();
		this.experience = experience;
		this.equipements = equipements;
		this.consumables = consumables;
		this.salleActuel = salleActuel;
	}

	public Double getExperience() {
		return experience;
	}

	public void setExperience(Double experience) {
		this.experience = experience;
	}

	public List<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements;
	}

	public List<Consumable> getConsumables() {
		return consumables;
	}

	public void setConsumables(List<Consumable> consumables) {
		this.consumables = consumables;
	}

	public Salle getSalleActuel() {
		return salleActuel;
	}

	public void setSalleActuel(Salle salleActuel) {
		this.salleActuel = salleActuel;
	}



	
	
	

}
