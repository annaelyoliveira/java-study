import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        int opcao = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        do {
            System.out.println("\n1. Depositar \n2. Sacar \n3. Consultar Saldo \n4. Encerrar \nEscolha uma das opções:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:{
                    System.out.println("Digite o  valor a ser depositado: ");
                    saldo += scanner.nextDouble();
                    break;
                }
                case 2: {
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo){
                        saldo -= saque;
                    }else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                } case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }case 4: {
                    System.out.println("Programa encerrado!");
                    break;
                } default: {
                    System.out.println("Opção inválida. Tente novamente."); 
                    break;
                }
            } 
        }while (opcao !=4);
        }
}

