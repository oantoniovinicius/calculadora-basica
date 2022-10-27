import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class CalculadoraApp {
    public static String menu(){
        return "CALCULADORA DIGITAL\n" +
                "Selecione a operação que deseja realizar: \n" +
                "1 - Adição \n"+
                "2 - Subtração \n"+
                "3 - Multiplicação\n"+
                "4 - Divisão\n"+
                "0 - Sair";
    }
    public static void main(String[] args) {
        int escolha=0;
        Calculadora c = new Calculadora();
        double n1=0;
        double n2=0;
        
        escolha = Integer.parseInt(JOptionPane.showInputDialog(menu()));

        while(escolha!=0){
            try{
                switch(escolha){
                
                    case 1->{
                        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                        JOptionPane.showMessageDialog(null, "Resultado da adição= " + c.somar(n1, n2));
                    } 
                    case 2->{
                        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                        JOptionPane.showMessageDialog(null, "Resultado da subtração= " + c.subtrair(n1, n2));
                    }
                    case 3->{
                        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                        JOptionPane.showMessageDialog(null, "Resultado da multiplicação= " + c.multiplicar(n1, n2));
                    }
                    case 4->{
                        n1= Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
                        n2= Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
                        JOptionPane.showMessageDialog(null, "Resultado da divisão= " + c.dividir(n1, n2));
                    }
                }
            } catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null, e.toString());
            } catch (InputMismatchException x){
                JOptionPane.showMessageDialog(null, "\nErro!\nEntrada invalida ");
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage() + "\nErro!\nTente Novamente.");
            }
            escolha = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}   
