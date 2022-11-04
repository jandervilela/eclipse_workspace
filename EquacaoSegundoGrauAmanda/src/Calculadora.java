/**Nome: 
 * Ra: 
 * Mapa Programa��o II 
 */
import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
        int a, b, c;
        double delta, x1, x2;
        
        String JOp;
        
        JOptionPane.showMessageDialog(null,"CALCULADORA DE EQ DE 2�GRAU!");
        JOp = JOptionPane.showInputDialog("Informe o valor de  a : ");
        a = Integer.parseInt(JOp.trim());
        JOp = JOptionPane.showInputDialog("Informe o valor de  b : ");
        b = Integer.parseInt(JOp.trim());
        JOp = JOptionPane.showInputDialog("Informe o valor de  c : ");
        c = Integer.parseInt(JOp.trim());
        
        
        try {
            delta = CalculoDeDelta(a, b, c);
            
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            JOptionPane.showMessageDialog(null, "\nO valor de Delta � : " + delta
                + "\nO valor de x1 � :  " + x1 + "\nO valor de x2 � : " + x2);
            
        }catch (IllegalArgumentException i) {
            System.err.println(i);
            JOptionPane.showMessageDialog(null, i.getMessage());
        }
    }
    
    private static double CalculoDeDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - (4*a*c);
        if (delta<0) {
            throw new IllegalArgumentException("Delta �: "+delta+"\nN�o existem ra�zes reais.");
        }
        return delta;
    }    
}