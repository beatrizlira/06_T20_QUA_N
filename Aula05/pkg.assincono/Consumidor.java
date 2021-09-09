public class Consumidor implements java.lang.Runnable{
    Valores valor;

    public Consumidor(Valores valor){
        this.valor = valor;
    }

    public void run(){
        int tempo;
        for (int i = 0; i < 11; i++) {
            tempo = (int) (Math.random() * 1);
            System.out.println("O Consumidor está lendo o valor..: " + valor.exibir());
            System.out.println("tempo............................: " + Math.random());
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
            }
        }
    }
}
