package Padroes.Observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada =  new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.RegistrarObservador(namorada);
		porteiro.monitorar();
	}
}
