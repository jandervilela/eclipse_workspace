package Evento;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    private List<Evento> eventos;

    public Principal() {

        eventos = new ArrayList<>();
    }

    public List<Evento> getevEventos() {
        return eventos;
    }

    public void NovoEvento(Evento evento) {
        getevEventos().add(evento);
    }

    //Resumo eventos Criados;
    public void mostrarEventos() {
       /* System.out.println(""" 
                               Nome:Jander Viana Vilela 
                               Ra:21082308-5 
                               Mapa ProgramaçãoI 53-2022\n""");*/
        for (int x = 0; x < eventos.size(); x++) {                        
            System.out.println("Evento id: " + eventos.get(x).getid());
            System.out.println("Evento nome: " + eventos.get(x).getNome());
            System.out.println("Eventos capacidade: " + eventos.get(x).getCapacidade());
            System.out.println("Evento ingressos vendidos: "
                    + eventos.get(x).quantidadeIngressosVendidos());
            System.out.println("#######################################################");
            

        }
    }

    public void venderIngresso(Ingresso ingresso) {
        for (int x = 0; x < eventos.size(); x++) {
            if (ingresso.getCodigoEvento() == eventos.get(x).getid()) {
                eventos.get(x).venderIngresso(ingresso);
                return;
            }
           
        }
    }
    
    //criar eventos
    public Evento cadastroEvento1() {
        return new Evento(1, "Show Pink Floyd", "21/06/2022", 300, 6);
    }

    public Evento cadastroEvento2() {
        return new Evento(2, "Show Led Zeppelin", "22/06/2022", 250, 4);

    }
    //vender Ingressos

    public Ingresso gerarIngresso1(Evento evento) {
        return new IngressoPista("João Da Silva", "999.888.777-66", evento);
    }

    public Ingresso gerarIngresso2(Evento evento) {
        return new IngressoVip("Lucas Martins", "555.444.333-22", evento);
    }

    public Ingresso gerarIngresso3(Evento evento) {
        return new IngressoCamarote("Marcia Eliana", "777.888.777-66", evento);
    }

    public Ingresso gerarIngresso4(Evento evento) {
        return new IngressoPista("José Vilela", "777.888.777-66", evento);
    }

    public Ingresso gerarIngresso5(Evento evento) {
        return new IngressoCamarote("Jander Vilela", "777.555.444-33", evento);
    }

    public Ingresso gerarIngresso6(Evento evento) {
        return new IngressoVip("Alana Fialho", "666.777.666-21", evento);
    }

    public Ingresso gerarIngresso7(Evento evento) {
        return new IngressoVip("Isaac Prado", "555.444.666-21", evento);
    }

    public Ingresso gerarIngresso8(Evento evento) {
        return new IngressoCamarote("Maria Eduarda", "555.444.777-21", evento);
    }

    public Ingresso gerarIngresso9(Evento evento) {
        return new IngressoPista("Eduarda", "333.222.777-21", evento);
    }

    public Ingresso gerarIngresso10(Evento evento) {
        return new IngressoPista("Francisca", "654.432.321-11", evento);
    }

}
