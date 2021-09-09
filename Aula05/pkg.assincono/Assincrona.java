public class Assincrona {
    public static void main(String[] args) {
        Valores valor = new Valores();

        System.out.println("Iniciando os Threads Produtor e Consumidor");
        System.out.println("------------------------------------------");

        // criação e execução dos dois Threads
        new Thread(new Produtor(valor)).start();
        new Thread(new Consumidor(valor)).start();
    }
}