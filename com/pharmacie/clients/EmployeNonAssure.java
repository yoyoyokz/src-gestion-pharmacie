package com.pharmacie.clients;

import com.pharmacie.interfaces.IEmploye;

public class EmployeNonAssure extends ClientNonAssure implements IEmploye {

	public EmployeNonAssure(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email,
			double indicateurFidelite) {
		super(nom, prenom, genre, adresse, numeroTelephone, email, indicateurFidelite);
		autoIncremente() ;
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
