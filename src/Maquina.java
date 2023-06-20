class Maquina {
    private static final int TEMPO_PRODUCAO = 5000; // Tempo em milissegundos
    private Produto produto;

    public Maquina(Produto produto) {
        this.produto = produto;
    }

    public void produzir() {
        Thread currentThread = Thread.currentThread();

        System.out.println("Iniciando produção do Produto " + produto.getNome() + " na máquina: " + currentThread.getName());

        try {
            Thread.sleep(TEMPO_PRODUCAO);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Produto " + produto.getNome() + " produzido com sucesso!" + " na máquina: " + currentThread.getName());
    }
}
