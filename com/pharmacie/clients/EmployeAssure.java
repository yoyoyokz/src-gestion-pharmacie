package com.pharmacie.clients;

import com.pharmacie.interfaces.IEmploye;

public class EmployeAssure extends ClientAssure implements IEmploye {

	public EmployeAssure(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			long policeAssurance, String libelleAssureur) {
		super(nom, prenom, genre, adresse, numeroTelephone, email, policeAssurance, libelleAssureur);
		autoIncremente () ;
	}

	@Override
	public double getPrixAvecRemiseExceptionnelle() {
		return super.getPrixPanier() * ( 1 - IEmploye.REMISE);
	}

	@Override
	public double getPrixPanier() {
		return getPrixAvecRemiseExceptionnelle();
	}

	@Override
	public void autoIncremente() {
		Client.setNbEmploye(); 
	}

	
}
