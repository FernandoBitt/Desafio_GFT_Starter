abstract class Criatura {
    protected String nome;
    protected String poder;
    protected int forcaBase;
    
    public Criatura(String nome, String poder, int forcaBase) {
        this.nome = nome;
        this.poder = poder;
        this.forcaBase = forcaBase;
    }
    
    // Método abstrato que cada subclasse deve implementar
    public abstract int calcularForcaTotal();
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getPoder() {
        return poder;
    }
    
    public int getForcaBase() {
        return forcaBase;
    }
    
    @Override
    public String toString() {
        return nome + " (Poder: " + poder + ", Força Base: " + forcaBase + ", Força Total: " + calcularForcaTotal() + ")";
    }
}