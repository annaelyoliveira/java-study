import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE" , "ANNA", "JULIA" , "PAULO" , "GUSTAVO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    public static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{ 
            atendeu = atender();
            continuarTentando =!atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else    
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuarTentando && tentativasRealizadas<3);
        
        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        else    
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo tentativas " + tentativasRealizadas);
    }

    public static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    public static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE" , "ANNA" , "JULIA" , "DAVID" , "AUGUSTO"};
        System.out.println("Imprimindo a lista de candiadtos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }

    }
    public static void selecaoCandidato() {
        String [] candidatos = {"FELIPE" , "ANNA" , "JULIA" , "DAVID" , "AUGUSTO" , "MARIA" , "FAGNER" , "MAYA" , "BERNARDO"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + "Solicitou ester valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    
    public static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
