class Grifo extends Criatura {
    private int velocidade;
    
    public Grifo(String nome, String poder, int forcaBase, int velocidade) {
        super(nome, poder, forcaBase);
        this.velocidade = velocidade;
    }
    
    @Override
    public int calcularForcaTotal() {
        // Fórmula específica para Grifo: força base multiplicada pela velocidade
        return forcaBase * velocidade;
    }
}