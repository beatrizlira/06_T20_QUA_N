class Tarefa{
    private final String tarefa;
    private final String nome;

    public Tarefa(String tarefa, String nome){
        this.tarefa = tarefa;
        this.nome = nome;
    }

    // método que "executa" o processo "Tarefa"
    public void run(){ // correr
        System.out.println("A tarefa é: " + nome);
        System.out.println("Tarefa executada: " + tarefa);
    }
}

public class MultiTarefa{
    public static void main(String[] args){
        // criar a tarefa
        Tarefa t1 = new Tarefa("Listar", "Produtos");
        Tarefa t2 = new Tarefa("Atualizar", "Produtos");

        // executar a tarefa
        t1.run();
        t2.run();
    }
}