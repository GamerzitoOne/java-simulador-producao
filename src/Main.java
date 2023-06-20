import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int numMaquinas = 10;
        int numProdutos = 50;

        ExecutorService executor = Executors.newFixedThreadPool(numMaquinas);

        for (int i = 0; i < numProdutos; i++) {
            Produto produto = new Produto("Pastel");
            executor.execute(new TarefaProducao(new Maquina(produto)));
        }

        executor.shutdown();
    }
}