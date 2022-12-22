package com.pharmacie.produits;

public class Parapharmacie extends Produit {
	
	private int categorie ;
	public static final int DEFAULT_CATEGORY = 1 ;
	public static final double SURTAXE = 65 ;
	
	public Parapharmacie(int identifiant, String nom, double cout, int categorie) {
		super(identifiant, nom, cout, false);
		setCategorie (categorie);
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		if ( categorie > 0 ) {
			this.categorie = categorie;
		} else {
			this.categorie = DEFAULT_CATEGORY ;
		}
	}

	@Override
	public double getCout() {		
		return super.getCout() + SURTAXE * categorie ;
	}

	@Override
	public String toString() {
		return super.toString() + "\nParapharmacie [categorie=" + categorie + "]";
	}
		
	
}
