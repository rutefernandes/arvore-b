package tad.arvore.b;

public class NoB {
	private NoB[] filhos;
	private NoB pai;
	private int[] chaves;
	private int ordem = 0;
	private int tamanho = 0;
	
	NoB(){
		
	}
	
	NoB(int chave, int ordem){
		this.ordem = ordem;
		this.chaves = new int[ordem];
		this.chaves[tamanho] = chave;
		this.tamanho++;
	}
	
	public NoB[] getFilhos() {
		return filhos;
	}
	
	public void setFilhos(NoB[] filhos) {
		this.filhos = filhos;
	}
	
	public NoB getPai() {
		return pai;
	}
	
	public void setPai(NoB pai) {
		this.pai = pai;
	}
	
	public int[] getChaves() {
		return chaves;
	}
	
	public void setChaves(int[] chaves) {
		this.chaves = chaves;
	}
}
