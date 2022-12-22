package com.pharmacie.run;

import com.pharmacie.clients.Client;
import com.pharmacie.clients.ClientDiamond;
import com.pharmacie.clients.EmployeGold;
import com.pharmacie.produits.Medicament;
import com.pharmacie.produits.Parapharmacie;

public class Pharmacie {

	public static void main(String[] args) {
		
		ClientDiamond clientDiamond = new ClientDiamond ("AKINOCHO", "Ghislain", 'H', "45, Rue carnot", "+221775699577", "ghislain.akinocho@gmail.com", 12345, "AXA Assurances" ) ;
		EmployeGold employeGold = new EmployeGold ("KANE", "Seynabou Léna", 'F', "85, Rue des filles", "+221705878540", "lena.kane@gmail.com", 0) ;
	
		Medicament efferalgan = new Medicament (1, "Efferalgan", 1000, false, false) ;
		Parapharmacie deodorant = new Parapharmacie (10, "Déodorant", 1500, 1);
		
		clientDiamond.ajouterProduitDansLePanier(efferalgan);
		clientDiamond.ajouterProduitDansLePanier(deodorant);
		
		employeGold.ajouterProduitDansLePanier(efferalgan);
		employeGold.ajouterProduitDansLePanier(deodorant);
		
		clientDiamond.sePresenter();
		clientDiamond.afficherContenuPanier();
		clientDiamond.payerFacture();
		
		System.out.println("\n\n");
		
		employeGold.sePresenter();
		employeGold.afficherContenuPanier();
		employeGold.payerFacture();
		
		System.out.println("\n\n");
		
		System.out.println("Nombre de Clients : " + Client.getNbClient());
		System.out.println("Nombre d'employés : " + Client.getNbEmploye());
	}

}
