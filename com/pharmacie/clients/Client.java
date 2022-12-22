package com.pharmacie.clients;

import java.util.ArrayList;
import java.util.Iterator;

import com.pharmacie.produits.Produit;

public abstract class Client {
	
	private String nom ;
	private String prenom ;
	private char genre ;
	private String adresse ;
	private String numeroTelephone ;
	private String email ;
	
	private static int nbEmploye ;
	private static int nbClient ;
	
	public static int getNbClient() {
		return nbClient;
	}

	public static void setNbClient() {
		Client.nbClient ++;
	}

	public static int getNbEmploye() {
		return nbEmploye;
	}

	public static void setNbEmploye() {
		Client.nbEmploye ++;
	}
	
	private static final int TAILLE_MAX_PANIER = 10 ;
	
	protected ArrayList<Produit> panier = new ArrayList<Produit> () ;

	public Client(String nom, String prenom, char genre, String adresse, String numeroTelephone, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.adresse = adresse;
		this.numeroTelephone = numeroTelephone;
		this.email = email;
		setNbClient () ;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public char getGenre() {
		return genre;
	}

	public void setGenre(char genre) {
		this.genre = genre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void ajouterProduitDansLePanier (Produit produit) {
		if ( panier.size() < TAILLE_MAX_PANIER ) {
			panier.add(produit) ;
		}
	}
	
	public void payerFacture () {
		System.out.println("A payer : " + getPrixPanier());
	}
	
	public void afficherContenuPanier () {
		Iterator<Produit> it = panier.iterator() ;
		
		while (it.hasNext()) {
			Produit produit = it.next() ;
			System.out.println( produit.toString() );
		}
	}
	
	public abstract double getPrixPanier () ;
	
	public void sePresenter () {
		System.out.println( toString ());
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", genre=" + genre + ", adresse=" + adresse
				+ ", numeroTelephone=" + numeroTelephone + ", email=" + email + "]";
	}
	
	public double getHistoricFacture() {
		return 0 ;
	}
}
