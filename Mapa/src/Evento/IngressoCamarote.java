package Evento;

public class IngressoCamarote extends Ingresso {

    public IngressoCamarote(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento, Categoria.CAMAROTE);
        this.calculaValorIngresso();
    }

    private void calculaValorIngresso() {
        super.valorIngresso = super.getEvento().getValorUnico() * 1.6;
    }

}
