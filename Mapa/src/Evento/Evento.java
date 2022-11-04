package Evento;

import java.util.ArrayList;
import java.util.List;




public class Evento {
	
	 //atributos
    private int id;
    private String nome;
    private String data;
    private double valorUnico;
    private int capacidade;

    //lista de ingressos
    private List<Ingresso> ingressos;

    public Evento(int id, String nome, String data, double valorUnico, int capacidade) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidade = capacidade;

        ingressos = new ArrayList<>();

    }

    public void venderIngresso(Ingresso ingresso) {
        if (this.getCapacidade() > getIngressos().size()) {
            getIngressos().add(ingresso);
            ingresso.mostrarResumo();
            ingresso.imprimirValor();

        } else {
            System.out.println("capacidade máxima atingida para "
                    + ingresso.getEvento().nome);
            System.out.println("####################################################");

        }
    }

    int getCapacidade() {
		// TODO Auto-generated method stub
		return 0;
	}

	private List<Ingresso> getIngressos() {
		// TODO Auto-generated method stub
		return null;
	}

	public int quantidadeIngressosVendidos() {
        return getIngressos().size();
    }

    public int getid() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public double getValorUnico() {
        return valorUnico;

}
}