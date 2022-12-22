package com.pharmacie.clients;

import com.pharmacie.interfaces.IDiamond;

public class EmployeDiamond extends EmployeAssure implements IDiamond {

	public EmployeDiamond(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			long policeAssurance, String libelleAssureur) {
		super(nom, prenom, genre, adresse, numeroTelephone, email, policeAssurance, libelleAssureur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrixAvecRemise() {
		return super.getPrixPanier() * ( 1 - IDiamond.REMISE);
	}

	@Override
	public double getPrixPanier() {
		return getPrixAvecRemise();
	}
}
