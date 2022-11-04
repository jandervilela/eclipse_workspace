package Evento;

public class IngressoVip extends Ingresso {

    public IngressoVip(String nome, String cpf, Evento evento) {
        super(nome, cpf, evento, Categoria.VIP);
        this.calculaValorIngresso();
    }

    private void calculaValorIngresso() {
        super.valorIngresso = super.getEvento().getValorUnico() * 1.3;
    }

}
