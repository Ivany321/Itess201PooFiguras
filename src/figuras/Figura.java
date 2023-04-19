package figuras;


public abstract class Figura {
    protected int n;

    public void setN(int n) {
        this.n = n;
    }
    
    public abstract void imprimir();
}
