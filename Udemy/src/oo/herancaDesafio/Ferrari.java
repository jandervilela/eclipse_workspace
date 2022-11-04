package oo.herancaDesafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean LigarTurbo = false;
	private boolean LigarAr = false;

	Ferrari() {
		this(315);
	}

	public Ferrari(int velocidaMaxima) {
		super(velocidaMaxima);
		setDelta(15);
	}

	@Override
	public void LigarTurbo() {
		LigarTurbo = true;

	}

	@Override
	public void DesligarTurbo() {
		LigarTurbo = false;
	}

	@Override
	public void LigarAr() {
		LigarAr = true;
	}

	@Override
	public void DesligarAr() {
		LigarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(LigarTurbo && !LigarAr) {
			return 35;
		}else if(LigarTurbo && LigarAr) {
			return 30;
		}else if(!LigarTurbo && !LigarAr) {
			return 20;
		}else {
			return 15;
		}
		
	}
	/*
	 * @Override void acelerar() { velocidadeAtual += 15; }
	 */

}
