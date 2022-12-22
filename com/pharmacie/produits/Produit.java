package com.pharmacie.produits;

public abstract class Produit {
	
	private int identifiant ;
	private String nom ;
	private double cout ;
	
	private boolean prisEnCharge ;

	public Produit(int identifiant, String nom, double cout, boolean prisEnCharge) {
		setIdentifiant (identifiant);		
		setCout (cout);
		this.nom = nom;
		this.prisEnCharge = prisEnCharge;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		if ( identifiant > 0 ) {
			this.identifiant = identifiant;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		if ( cout >= 0 ) {
			this.cout = cout;
		}
	}

	public boolean isPrisEnCharge() {
		return prisEnCharge;
	}

	public void setPrisEnCharge(boolean prisEnCharge) {
		this.prisEnCharge = prisEnCharge;
	}

	@Override
	public String toString() {
		return "Produit [identifiant=" + identifiant + ", nom=" + nom + ", cout=" + cout + ", prisEnCharge="
				+ prisEnCharge + "]";
	}
}
