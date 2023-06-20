public class TarefaProducao implements Runnable {

    Maquina maquina;
    
    public TarefaProducao(Maquina banheiro) {
        this.maquina = banheiro;
    }

    public void run() {
        this.maquina.produzir();
    }
}