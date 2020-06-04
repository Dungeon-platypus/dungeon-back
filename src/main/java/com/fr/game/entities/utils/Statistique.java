package com.fr.game.entities.utils;


public class Statistique {

	private Integer hpMax;
	private Integer hpActuel;
	private Integer manaMax;
	private Integer manaActuel;
	private Integer force;
	private Integer intelligence;
	private Integer dexterite;

	public Statistique() {

	}

	public Statistique(Integer hpMax, Integer hpActuel, Integer manaMax, Integer manaActuel, Integer force,
			Integer intelligence, Integer dexterite) {
		super();
		this.hpMax = hpMax;
		this.hpActuel = hpActuel;
		this.manaMax = manaMax;
		this.manaActuel = manaActuel;
		this.force = force;
		this.intelligence = intelligence;
		this.dexterite = dexterite;
	}

	public Integer getHpMax() {
		return hpMax;
	}

	public void setHpMax(Integer hpMax) {
		this.hpMax = hpMax;
	}

	public Integer getHpActuel() {
		return hpActuel;
	}

	public void setHpActuel(Integer hpActuel) {
		this.hpActuel = hpActuel;
	}

	public Integer getManaMax() {
		return manaMax;
	}

	public void setManaMax(Integer manaMax) {
		this.manaMax = manaMax;
	}

	public Integer getManaActuel() {
		return manaActuel;
	}

	public void setManaActuel(Integer manaActuel) {
		this.manaActuel = manaActuel;
	}

	public Integer getForce() {
		return force;
	}

	public void setForce(Integer force) {
		this.force = force;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getDexterite() {
		return dexterite;
	}

	public void setDexterite(Integer dexterite) {
		this.dexterite = dexterite;
	}
	
	

}
