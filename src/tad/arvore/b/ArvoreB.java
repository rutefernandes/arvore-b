package tad.arvore.b;

import java.util.Iterator;

public class ArvoreB implements IArvoreB{
	private NoB raiz;
    private int tamanho;
    private int ordem;
    Comparador c = new Comparador();
	
    public ArvoreB(){
        this.raiz = null;
        this.tamanho = 0;
        this.setOrdem(0);
    }
    
    public ArvoreB(int o, int ordem){
        this.raiz = new NoB(o, ordem);
        this.setOrdem(ordem);
        this.tamanho++;
    }
    
    public NoB getRaiz() {
        return raiz;
    }

    public void setRaiz(NoB raiz) {
        this.raiz = raiz;
    }
    
    public int getTamanho() {
        return tamanho;
    }
    
	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

    @Override
    public int size() {
        return this.getTamanho();
    }

    @Override
    public boolean isEmpty() {
        return (getRaiz() == null);
    }

    @Override
    public NoB root() {
        return getRaiz();
    }

	@Override
	public NoB parent(NoB no) {
		return no.getPai();
	}

	@Override
	public Iterator children(NoB no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInternal(NoB no) {
        return (no==null)? false : no.getFilhos() != null;
	}

	@Override
	public boolean isExternal(NoB no) {
		return (no==null)? false : no.getFilhos() == null;
	}

	@Override
	public boolean isRoot(NoB no) {
		return (no == getRaiz());
	}

	@Override
	public void adicionar(int o) {
		// TODO Auto-generated method stub
	}

	@Override
	public NoB buscar(int posicao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoB buscar(int posicao, NoB raiz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoB remover(NoB no) {
		// TODO Auto-generated method stub
		return null;
	}

	// MÉTODOS DE EXIBIÇÃO 
	@Override
	public void mostrar() {
        System.out.println(this.toString());
	}
	
    public String toString () {
    	return null;
    }

}
