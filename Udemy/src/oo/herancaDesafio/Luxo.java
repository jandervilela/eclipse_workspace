package oo.herancaDesafio;

public interface Luxo {

	public void LigarAr();

	abstract void DesligarAr();

	default int VelocidadeDoAr() {
		return 1;
	}

}
