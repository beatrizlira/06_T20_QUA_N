public class Sincrona {
    public static void main(String[] args) {
        Valores valor = new Valores();

        System.out.println("Processadores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Memória Livre: " + Runtime.getRuntime().freeMemory());
        System.out.println("Iniciando Produtor e Consumidor\n");

        // criação e execução dos dois Threads
        new Thread(new Produtor(valor), "Thread-Produtor").start();
        new Thread(new Consumidor(valor), "Thread-Consumidor").start();
    }
}