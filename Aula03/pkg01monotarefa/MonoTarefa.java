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

public class MonoTarefa{
    public static void main(String[] args){
        // criar a tarefa
        Tarefa t = new Tarefa("Listar", "Produtos");

        // executar a tarefa
        t.run();
    }
}