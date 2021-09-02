class ClasseRunnable implements java.lang.Runnable {
    private int contador;
    private final int prioridade;
    private final int contadorTotal;

    // construtor
    public ClasseRunnable(int contadorTotal, int prioridade) {
        this.contadorTotal = contadorTotal;
        this.contador = 0;
        this.prioridade = prioridade;
    }

    // método run()
    @Override
    public void run() {
        while (contador <= contadorTotal) {
            System.out.println(Thread.currentThread().getName() + " Prioridade de Execução: "
                    + Thread.currentThread().getPriority() + " - Contador Atual: " + contador);
            if (prioridade == Thread.currentThread().getPriority()) {
                System.out.println("Verdadeiro");
            } else {
                System.out.println("False");
            }
            contador++;

            try {
                // implementação da lógica do contador
                System.out.println(Thread.currentThread().getName() + " Dormindo por 2 segundos...");

                // controlando o tempo do "soninho"
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }
        System.out.println("\nThread " + Thread.currentThread().getName() + " Finalizado com Sucesso!!!");
    }
}

public class MyRunnable {
    public static void main(String[] args) {
        // criação dos Threads Runnable
        ClasseRunnable r1 = new ClasseRunnable(3, 5); // contador=3
        ClasseRunnable r2 = new ClasseRunnable(4, 1); // contador=4
        ClasseRunnable r3 = new ClasseRunnable(5, 10); // contador=5

        // criar os Threads
        Thread t1 = new Thread(r1);
        t1.setName("Runnable 1");
        t1.setPriority(Thread.MIN_PRIORITY); // 5

        Thread t2 = new Thread(r2);
        t2.setName("Runnable 2");
        t2.setPriority(Thread.NORM_PRIORITY); // 1

        Thread t3 = new Thread(r3);
        t3.setName("Runnable 3");
        t3.setPriority(Thread.MAX_PRIORITY); // 10

        // inicializar os Threads
        t1.start();
        t2.start();
        t3.start();
    }
}

/*
 * Alterar o programa de forma que seja possível informar para cada Thread o
 * tempo em que ela irá dormir. Além disso, alterar as prioridades e executar,
 * para cada conjunto de parâmetros 10 vezes e comparar a prioridade determinada
 * com a ordem de execução.
 */