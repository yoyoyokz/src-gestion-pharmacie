package com.pharmacie.produits;

public class Medicament extends Produit {
	private boolean avecOrdonnance ;

	public Medicament(int identifiant, String nom, double cout, boolean prisEnCharge, boolean avecOrdonnance) {
		super(identifiant, nom, cout, prisEnCharge);
		this.avecOrdonnance = avecOrdonnance;
	}

	public boolean isAvecOrdonnance() {
		return avecOrdonnance;
	}

	public void setAvecOrdonnance(boolean avecOrdonnance) {
		this.avecOrdonnance = avecOrdonnance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nMedicament [avecOrdonnance=" + avecOrdonnance + "]";
	}	
		
	
}
