public class Valores {
    int valor;
    private boolean bloqueado;

    public Valores() {
        bloqueado = false;
    }

    public synchronized void guardar(int valores) {
        while (bloqueado) {
            try {
                wait(); // aguardar até que algo o libere
            } catch (InterruptedException e) {
                System.out.println("Erro-Guardar: " + e.getMessage());
            }
        }
        this.valor = valores;
        bloqueado = true;
        notify(); // avisa o escalonador que está bloqueado
    }

    // método par ler o dado
    public synchronized int exibir() {
        while (!bloqueado) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Valores-Exibir (ERRO): " + e.getMessage());
            }
        }
        bloqueado = false;
        notify();
        return this.valor;
    }
}
