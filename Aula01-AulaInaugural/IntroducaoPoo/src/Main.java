import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");

        String produto1 = sc.nextLine();
        System.out.println("Digite a quantidade do produto: ");

        int quantidade = sc.nextInt();
        System.out.println("Digite o preco do produto: ");

        double preco = sc.nextDouble();

        System.out.println("Produto :" + produto1 +
                "Quantidade :" + quantidade + "Preco :" + preco);

        double precoFinal = preco * quantidade;

        System.out.println("Produto :" + produto1 +
                "Quantidade :" + quantidade + "Preco :" + preco + "PrecoFinal:" + precoFinal);
    }
}
