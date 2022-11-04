package br.com.cod3r.cm.modelo.modelo;

public class ResultadoEvento {

	private final Boolean ganhou;

	public ResultadoEvento(Boolean ganhou) {
		this.ganhou = ganhou;
	}

	public boolean isGanhou() {
		return ganhou;
	}
}
