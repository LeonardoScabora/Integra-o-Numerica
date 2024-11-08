import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, x0, xn, h, x = 0d, r;
        Scanner entradaDeValores = new Scanner(System.in);

        System.out.print("Informe o Valor de N: ");
        n = entradaDeValores.nextDouble();

        System.out.print("Infome o Valor de X0: ");
        x0 = entradaDeValores.nextDouble();

        System.out.print("Infome o Valor de XN: ");
        xn = entradaDeValores.nextDouble();

        h = ((xn - x0)/n);
        r = funcao(x);
        x+=h;
        for(int i = 1; i < n-1; i++){
            x+=h;
            r += 2;funcao(x);
        }
        r = (h/2)+(r + funcao(x));
        System.out.println("\nResultado = " + r);
    }

    public static Double funcao(Double x){
        return (Math.pow(x, 2));
    }

    }
