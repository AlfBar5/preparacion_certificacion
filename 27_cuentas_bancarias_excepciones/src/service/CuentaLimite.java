package service;

import java.io.IOException;
import java.sql.SQLException;


import exceptions.SaldoNegativoException;

public class CuentaLimite extends Cuenta{
	
	//clase cuenta límite, que hereda de cuenta
	//incorpora un atributo llamado límite para limitar la extracción  a dicho valor
	//cuando alguien intenta sacar o ingresar solo puede hacerlo hasta ese límite 
	//Dispondrá de un método ajustarLimite(), para cambiar el límite a la mitad del saldo
	//límite se inicializa en el constructor
	
	private double limite;
	
	// constructor
	public CuentaLimite(String codigoCuenta, double saldo, double limite) {
		
		//llamamos al constructor de la superclase
		super(codigoCuenta,saldo);
		this.limite=limite;	
		
	}
	
	
	public double ajustarLimite() {
		limite=getSaldo()/2;
		return limite;
				
	}
	
	
	/*
	
	//MÉTODO ingresar
	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);
		
		if (cantidad<=limite) {
			super.ingresar(cantidad);
		}else {
			super.ingresar(limite);;
		}
		
	}
	
	*/
	
	
	//MÉTODO extraer
	@Override
	public void extraer(double cantidad) throws SaldoNegativoException {
		super.extraer(cantidad);
		
		
		//si el saldo es menor que la cantidad
		double saldo = getSaldo();
		
		if (saldo>=cantidad) {
					
			super.extraer(cantidad);
			
		}else {
			super.extraer(limite);
			
		}
	}
	
	
	
	
	

}
