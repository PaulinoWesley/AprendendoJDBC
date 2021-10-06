package com.campeonato.repository.jdbc;

public interface Automovel {
	public void ligarMotor();

	public void acelerar(int velocidade);

	public void freiar(int velocidade);
}

class Carro implements Automovel {

	public void ligarMotor() {
		System.out.println("Ligando carro");
	}

	public void acelerar(int velocidade) {
		System.out.println("Acelerando  carro");
	}

	public void freiar(int velocidade) {
		System.out.println("Freiando carro");
	}

}

class Moto implements Automovel {
	public void ligarMotor() {
		System.out.println("Ligando moto");
	}

	public void acelerar(int velocidade) {
		System.out.println("Acelerando  moto");
	}

	public void freiar(int velocidade) {
		System.out.println("Freiando moto");
	}	
}