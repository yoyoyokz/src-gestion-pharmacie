package com.pharmacie.clients;

import java.util.Iterator;

import com.pharmacie.produits.Produit;

public class ClientNonAssure extends Client {
	private double indicateurFidelite ;

	public ClientNonAssure(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			double indicateurFidelite) {
		super(nom, prenom, genre, adresse, numeroTelephone, email);
		this.indicateurFidelite = indicateurFidelite;
	}

	public double getIndicateurFidelite() {
		return indicateurFidelite;
	}

	public void setIndicateurFidelite() {
		this.indicateurFidelite = getHistoricFacture ();
	}

	@Override
	public double getPrixPanier() {
		double coutPanier = 0 ;
		
		Iterator<Produit> it = panier.iterator() ;
		
		while (it.hasNext()) {
			Produit produit = it.next() ;
			coutPanier += produit.getCout() ;
		}
		
		return coutPanier;
	}
}
