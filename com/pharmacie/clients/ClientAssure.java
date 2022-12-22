package com.pharmacie.clients;

import java.util.Iterator;

import com.pharmacie.produits.Produit;

public class ClientAssure extends Client {

	private long policeAssurance ;
	private String libelleAssureur ;

	public ClientAssure(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			long policeAssurance, String libelleAssureur) {
		super(nom, prenom, genre, adresse, numeroTelephone, email);
		
		this.policeAssurance = policeAssurance;
		this.libelleAssureur = libelleAssureur;
	}

	public long getPoliceAssurance() {
		return policeAssurance;
	}

	public void setPoliceAssurance(long policeAssurance) {
		this.policeAssurance = policeAssurance;
	}

	public String getLibelleAssureur() {
		return libelleAssureur;
	}

	public void setLibelleAssureur(String libelleAssureur) {
		this.libelleAssureur = libelleAssureur;
	}

	@Override
	public double getPrixPanier() {
		
		double coutPanier = 0 ;
		
		Iterator<Produit> it = panier.iterator() ;
		
		while (it.hasNext()) {
			Produit produit = it.next() ;
			if (! produit.isPrisEnCharge()) {
				coutPanier += produit.getCout() ;
			}
		}
		
		return coutPanier;
	}
}
