import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();
        String agenciaFormatado = agencia.substring(0, 3) + "-" + agencia.substring(3);

        System.out.println("Por favor, digite o valor do saque: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaFormatado + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
