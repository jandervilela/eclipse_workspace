import javax.swing.JOptionPane;

public class OperacaoSegundoGrau{
	public static void main(String args[]){
		double delta,a,b,c,x1,x2;
		String jop; //jop=Joption
		
		JOptionPane.showMessageDialog(null,"calculadora de equa��o do 2� grau!");
		jop = JOptionPane.showInputDialog("Informe o valor de  a");
		a = Float.parseFloat(jop.trim());
		jop = JOptionPane.showInputDialog("Informe o valor de  b");
		b = Float.parseFloat(jop.trim());
		jop = JOptionPane.showInputDialog("Informe o valor de  c");
		c = Float.parseFloat(jop.trim());
		
		
		delta = Math.pow(b, 2)-(4*a*c); //delta calculado
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
		JOptionPane.showMessageDialog(null, "\nO valor de Delta � : " + delta + 
				"\nO resultado de x1 = � : " + x1 + "\nO resultado de x2 = � : " + x2);
		
	}
}