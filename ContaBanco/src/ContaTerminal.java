import java.util.Scanner;

public class ContaTerminal {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String agencia, nome;
                int numero;
                double saldo;

                System.out.println("Por favor, digite o nome do cliente,\n"
                        + "o número da conta, a agência e o saldo disponível");

                nome = scanner.nextLine();
                numero = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer após a leitura do número inteiro
                agencia = scanner.nextLine();
                saldo = scanner.nextDouble();

                System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, \n"
                        + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "\njá está disponível para saque");
        }
}
