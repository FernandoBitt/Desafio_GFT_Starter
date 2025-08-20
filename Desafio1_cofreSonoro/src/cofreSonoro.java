import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class cofreSonoro {
    // Sequência correta de desbloqueio (encapsulada)
    private final List<String> sequenciaCorreta = Arrays.asList("DO", "RE", "MI", "FA");
    
    // Método para verificar se a sequência está correta
    public boolean verificarSequencia(List<String> sequencia) {
        return sequenciaCorreta.equals(sequencia);
    }
    
    // Método principal para tentar abrir o cofre
    public void tentarAbrir() {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;
        
        System.out.println("Bem-vindo ao Cofre Sonoro!");
        System.out.println("Digite 4 notas separadas por espaço, sem acento (ex: DO RE MI FA):");
        
        for (int i = 1; i <= tentativas; i++) {
            System.out.println("\nTentativa " + i + " de " + tentativas + ":");
            System.out.print("> ");
            
            String entrada = scanner.nextLine().trim().toUpperCase();
            String[] notasArray = entrada.split("\\s+");
            List<String> notas = Arrays.asList(notasArray);
            
            // Verifica se foram fornecidas exatamente 4 notas
            if (notas.size() != 4) {
                System.out.println("Por favor, digite exatamente 4 notas separadas por espaço.");
                continue;
            }
            
            // Verifica se a sequência está correta
            if (verificarSequencia(notas)) {
                System.out.println("Cofre aberto com sucesso!");
                scanner.close();
                return;
            } else {
                System.out.println("Sequência incorreta.");
            }
        }
        
        System.out.println("\nNúmero máximo de tentativas excedido. Cofre permanece trancado.");
        scanner.close();
    }
    
    
    public static void main(String[] args) {
        cofreSonoro cofre = new cofreSonoro();
        cofre.tentarAbrir();
    }
}