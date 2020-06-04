package com.fr.game.entities;

import javax.persistence.Entity;

@Entity
public class Equipement extends Item {

	private Boolean equiped;

	public Equipement() {

	}

	public Equipement(Boolean equiped) {
		super();
		this.equiped = equiped;
	}

	public Boolean getEquiped() {
		return equiped;
	}

	public void setEquiped(Boolean equiped) {
		this.equiped = equiped;
	}

}
