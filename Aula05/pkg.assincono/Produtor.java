public class Produtor implements java.lang.Runnable {
    // criar uma variável para controlar o valor
    Valores valor;

    public Produtor(Valores valor) {
        this.valor = valor;
    }

    public void run() {
        int tempo;
        int i;

        for (i = 0; i < 11; i++) {
            tempo = (int) (Math.random() * 1);
            valor.guardar(i); // produtora de valores
            System.out.println("O Produtor está guardando o valor: " + i);
            System.out.println("tempo............................: " + Math.random());
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
            }
        }
    }
}
