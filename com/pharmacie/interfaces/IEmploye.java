package com.pharmacie.interfaces;

public interface IEmploye {
	public static final double REMISE = 0.05;
	
	public double getPrixAvecRemiseExceptionnelle () ;
	public void autoIncremente () ;
}
