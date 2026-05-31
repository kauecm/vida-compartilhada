package com.kminfo.vida_compartilhada.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "medications")
public class Medication extends BaseEntity {

	  @Column(nullable = false)
	    private String name;

	    private String activeIngredient;

	    private String concentration;

	    private String pharmaceuticalForm;

	    private String manufacturer;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getActiveIngredient() {
			return activeIngredient;
		}

		public void setActiveIngredient(String activeIngredient) {
			this.activeIngredient = activeIngredient;
		}

		public String getConcentration() {
			return concentration;
		}

		public void setConcentration(String concentration) {
			this.concentration = concentration;
		}

		public String getPharmaceuticalForm() {
			return pharmaceuticalForm;
		}

		public void setPharmaceuticalForm(String pharmaceuticalForm) {
			this.pharmaceuticalForm = pharmaceuticalForm;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
	    
	    
    
}