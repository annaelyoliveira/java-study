import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Insira o valor do limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();
        do {
            System.out.println("Insira o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            if (valorSaque <= 0){
              System.out.println("Transacoes encerradas.");
              break;
            }else if (valorSaque > limiteDiario) {
              System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
              break;
            } else {
              limiteDiario -= valorSaque;
              System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }while(true);
        scanner.close(); 
    }
}
