import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdInteira;
        int qtdMeia;

        String valorInteiraStr;
        String valorMeiaStr;

        double valorInteira;
        double valorMeia;

        double totalInteira;
        double totalMeia;
        double totalSessao;
        double mediaIngresso;

        System.out.print("Quantidade de ingressos inteiros: ");
        qtdInteira = entrada.nextInt();

        System.out.print("Quantidade de ingressos meia-entrada: ");
        qtdMeia = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Valor do ingresso inteiro: ");
        valorInteiraStr = entrada.nextLine();
        valorInteiraStr = valorInteiraStr.replace(",", ".");
        valorInteira = Double.parseDouble(valorInteiraStr);

        System.out.print("Valor do ingresso meia-entrada: ");
        valorMeiaStr = entrada.nextLine();
        valorMeiaStr = valorMeiaStr.replace(",", ".");
        valorMeia = Double.parseDouble(valorMeiaStr);

        totalInteira = qtdInteira * valorInteira;
        totalMeia = qtdMeia * valorMeia;

        totalSessao = totalInteira + totalMeia;

        mediaIngresso = totalSessao / (qtdInteira + qtdMeia);

        System.out.println("\nRESULTADOS");
        System.out.println("Total arrecadado com ingressos inteiros: " + totalInteira);
        System.out.println("Total arrecadado com meia-entrada: " + totalMeia);
        System.out.println("Total arrecadado na sessão: " + totalSessao);
        System.out.println("Valor médio por ingresso: " + mediaIngresso);

        entrada.close();
    }
}