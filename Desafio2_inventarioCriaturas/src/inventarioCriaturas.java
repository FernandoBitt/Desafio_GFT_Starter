import java.util.ArrayList;
import java.util.List;

public class inventarioCriaturas {
    private List<Criatura> criaturas;
    
    public inventarioCriaturas() {
        criaturas = new ArrayList<>();
    }
    
    public void adicionarCriatura(Criatura criatura) {
        criaturas.add(criatura);
    }
    
    public Criatura encontrarCriaturaMaisPoderosa() {
        if (criaturas.isEmpty()) {
            return null;
        }
        
        Criatura maisPoderosa = criaturas.get(0);
        for (Criatura criatura : criaturas) {
            if (criatura.calcularForcaTotal() > maisPoderosa.calcularForcaTotal()) {
                maisPoderosa = criatura;
            }
        }
        
        return maisPoderosa;
    }
    
    public void mostrarTodasCriaturas() {
        System.out.println("=== Todas as Criaturas no Inventário ===");
        for (Criatura criatura : criaturas) {
            System.out.println(criatura);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        inventarioCriaturas inventario = new inventarioCriaturas();
        
        // Adicionando criaturas ao inventário
        inventario.adicionarCriatura(new Dragao("Dragao", "Sopro de Fogo", 50, 3));
        inventario.adicionarCriatura(new Fenix("Fenix", "Renascimento", 30, 157));
        inventario.adicionarCriatura(new Grifo("Grifo", "Voo Veloz", 40, 4));
        
        // Mostrando todas as criaturas
        inventario.mostrarTodasCriaturas();
        
        // Encontrando e mostrando a criatura mais poderosa
        Criatura maisPoderosa = inventario.encontrarCriaturaMaisPoderosa();
        if (maisPoderosa != null) {
            System.out.println("Criatura mais poderosa: " + maisPoderosa.getNome() + 
                               " (Poder: " + maisPoderosa.getPoder() + 
                               ", Força Total: " + maisPoderosa.calcularForcaTotal() + ")");
        }
    }
}