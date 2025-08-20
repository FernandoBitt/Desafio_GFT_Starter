class Fenix extends Criatura {
    private int ciclosRenascimento;
    
    public Fenix(String nome, String poder, int forcaBase, int ciclosRenascimento) {
        super(nome, poder, forcaBase);
        this.ciclosRenascimento = ciclosRenascimento;
    }
    
    @Override
    public int calcularForcaTotal() {
        // Fórmula específica para Fênix: força base elevada pelos ciclos de renascimento
        return (int) forcaBase + ciclosRenascimento;
    }
}