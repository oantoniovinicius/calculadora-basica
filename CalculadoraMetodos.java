public class Calculadora {
    // método somar
    public double somar (double n1, double n2){
        return n1+n2;
    }
    // método subtrair
    public double subtrair (double n1, double n2){
        return n1-n2;
    }
    // método multiplicar
    public double multiplicar (double n1, double n2){
        return n1*n2;
    }
    // método dividir
    public double dividir (double n1, double n2) {
        if (n2 ==0){
            throw new ArithmeticException("\nImpossível realizar essa operação:\nDivisão por zero");
        }
        else
            return n1/n2;
    }
}