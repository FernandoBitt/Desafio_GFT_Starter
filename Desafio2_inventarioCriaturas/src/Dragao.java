class Dragao extends Criatura {
    private int nivelFuria;
    
    public Dragao(String nome, String poder, int forcaBase, int nivelFuria) {
        super(nome, poder, forcaBase);
        this.nivelFuria = nivelFuria;
    }
    
    @Override
    public int calcularForcaTotal() {
        // Fórmula específica para Dragão: força base multiplicada pelo nível de fúria
        return forcaBase * nivelFuria;
    }
}