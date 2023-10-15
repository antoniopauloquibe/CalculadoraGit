public class Tno<T> {
    private T valor;
    private Tno filhoEsquerdo;
    private Tno filhoDireito;

    public Tno(T valor, Tno filhoEsquerdo, Tno filhoDireito) {
        this.valor = valor;
        this.filhoEsquerdo = filhoEsquerdo;
        this.filhoDireito = filhoDireito;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Tno getFilhoEsquerdo() {
        return filhoEsquerdo;
    }

    public void setFilhoEsquerdo(Tno filhoEsquerdo) {
        this.filhoEsquerdo = filhoEsquerdo;
    }

    public Tno getFilhoDireito() {
        return filhoDireito;
    }

    public void setFilhoDireito(Tno filhoDireito) {
        this.filhoDireito = filhoDireito;
    }
    
    
}
