class MeuThread extends java.lang.Thread {
    private final String tarefa;
    private final String nome;

    public MeuThread(String tarefa, String nome) {
        this.tarefa = tarefa;
        this.nome = nome;
    }

    // método que "executa" o processo "MeuThread"
    @Override
    public void run() { // correr
        System.out.println("A tarefa é: " + nome);
        System.out.println("Tarefa executada: " + tarefa);
    }
}

public class MonoThread {
    public static void main(String[] args) {
        // criar a tarefa
        MeuThread t1 = new MeuThread("Listar", "Produtos");
        MeuThread t2 = new MeuThread("Atualizar", "Produtos");

        // executar a tarefa
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
    }
}