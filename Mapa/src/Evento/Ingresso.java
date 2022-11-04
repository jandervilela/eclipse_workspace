package Evento;

public class Ingresso {

    //atributos
    private String nome;
    private String cpf;
    private Evento evento;
    protected Categoria categoria;
    protected double valorIngresso;

    public Ingresso(String nome, String cpf, Evento evento, Categoria categoria) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        this.categoria = categoria;
    }

    public int getCodigoEvento() {
        return this.evento.getid();
    }

    public void mostrarResumo() {
        //vai mostrar o nome e o cpf do dono do ingresso
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Evento: " + this.evento.getNome());
        System.out.println("Data: " + this.evento.getData());
    }

    public void imprimirValor() {
        System.out.println("Categoria: " + this.categoria);
        System.out.println("valor: " + this.valorIngresso);
        System.out.println("###################################################");
        
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

}
