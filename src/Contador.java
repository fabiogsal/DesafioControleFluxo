import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite o primeiro parametro");
            int parametro1 = scanner.nextInt();
            System.out.println("Digite o segundo parametro");
            int parametro2 = scanner.nextInt();

            contar(parametro1, parametro2);
            System.out.println("Fim da contagem");

        } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: primeiro parametro deve ser menor que o segundo parametro");

        } catch (InputMismatchException e){
            System.out.println("Erro: o parametro deve ser um valor númerico inteiro");
        }

    }
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) throw new ParametrosInvalidosException();

        for (int inicio = parametro1; inicio != parametro2 + 1; inicio++) System.out.print(inicio + " ");

    }
}

