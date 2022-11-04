package Evento;

public class IngressoPista extends Ingresso {

    public IngressoPista(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento, Categoria.PISTA);
        this.calculaValorIngresso();
    }

    private void calculaValorIngresso() {
        super.valorIngresso = super.getEvento().getValorUnico();
    }

}
