interface ArvoreBinaria<T> {
    boolean isEmpty();
    int numeroDeNos();
    int numeroFilhosEsquerda();
    int numeroFilhosDireita();
    int altura();
    Tno elementoMaisEsquerdo();
    Tno elementoMaisDireito();
    boolean existe(T v);
    void imprimirPreOrder();
    void imprimirInOrder();
    void imprimirPosOrder();
    void adicionar();
    Tno obter(T v);
    boolean remover(T v);
}
