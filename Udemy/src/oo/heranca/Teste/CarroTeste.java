package oo.heranca.Teste;

import oo.herancaDesafio.Carro;
import oo.herancaDesafio.Civic;
import oo.herancaDesafio.Ferrari;

public class CarroTeste extends Carro{
	
	CarroTeste(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Ferrari c2 = new Ferrari(400);
		c2.LigarTurbo();
		c2.LigarAr();
		c2.DesligarAr();
		
		System.out.println(c2.VelocidadeDoAr());
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);

		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}

}
