package Main;

import Evento.Evento;
import Evento.Ingresso;
import Evento.Principal;

/**
 * Nome:JanderVianaVilela 
 * Ra:21082308-5 
 * Mapa ProgramaçãoI 53-2022
 */
public class Main {

    public static void main(String[] args) {
        Principal principal = new Principal();

        Evento evento1 = principal.cadastroEvento1();

        Evento evento2 = principal.cadastroEvento2();

        principal.NovoEvento(evento1);
        principal.NovoEvento(evento2);

        principal.mostrarEventos();

        Ingresso ingresso1 = principal.gerarIngresso1(evento1);
        principal.venderIngresso(ingresso1);

        Ingresso ingresso2 = principal.gerarIngresso2(evento1);
        principal.venderIngresso(ingresso2);

        Ingresso ingresso3 = principal.gerarIngresso3(evento1);
        principal.venderIngresso(ingresso3);

        Ingresso ingresso4 = principal.gerarIngresso4(evento2);
        principal.venderIngresso(ingresso4);

        Ingresso ingresso5 = principal.gerarIngresso5(evento2);
        principal.venderIngresso(ingresso5);

        Ingresso ingresso6 = principal.gerarIngresso6(evento2);
        principal.venderIngresso(ingresso6);

        Ingresso ingresso7 = principal.gerarIngresso7(evento2);
        principal.venderIngresso(ingresso7);

        Ingresso ingresso8 = principal.gerarIngresso8(evento2);
        principal.venderIngresso(ingresso8);

        Ingresso ingresso9 = principal.gerarIngresso9(evento1);
        principal.venderIngresso(ingresso9);

        Ingresso ingresso10 = principal.gerarIngresso10(evento1);
        principal.venderIngresso(ingresso10);

        principal.mostrarEventos();

    }

}
