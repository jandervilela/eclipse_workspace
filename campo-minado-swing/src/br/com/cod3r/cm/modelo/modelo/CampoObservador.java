package br.com.cod3r.cm.modelo.modelo;

@FunctionalInterface
public interface CampoObservador {
	
	public void eventoOcorreu(Campo campo, CampoEvento evento);

}
