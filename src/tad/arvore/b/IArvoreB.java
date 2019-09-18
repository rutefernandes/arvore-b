package tad.arvore.b;

import java.util.Iterator;

public interface IArvoreB {
    public int size();
    public boolean isEmpty();
    public NoB root();
    public NoB parent(NoB no);
    public Iterator children(NoB no);
    public boolean isInternal(NoB no);
    public boolean isExternal(NoB no);
    public boolean isRoot(NoB no);
    public void adicionar(int o);
    public NoB buscar(int posicao);
    public NoB buscar(int posicao, NoB raiz);
    public NoB remover(NoB no);
    public void mostrar();
    
    /* Métodos arvore B */
}
