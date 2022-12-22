package com.pharmacie.clients;

import com.pharmacie.interfaces.IGold;

public class ClientGold extends ClientNonAssure implements IGold {

	public ClientGold(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			double indicateurFidelite) {
		super(nom, prenom, genre, adresse, numeroTelephone, email, indicateurFidelite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrixAvecRemise() {
		return super.getPrixPanier() * ( 1 - IGold.REMISE);
	}

	@Override
	public double getPrixPanier() {
		return getPrixAvecRemise();
	}
	
}
