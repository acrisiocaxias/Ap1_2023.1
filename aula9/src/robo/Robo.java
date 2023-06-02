package robo;

public abstract class Robo extends Personagens{

	/*
	 * public int id; public String nome; public int posicaox; public int posicaoy;
	 * public Plano plano;
	 * 
	 * public Robo(int id, String nome, int posicaox, int posicaoy, Plano plano) {
	 * this.id = id; this.nome = nome; this.posicaox = posicaox; this.posicaoy =
	 * posicaoy; this.plano = plano;
	 * 
	 * Celula aux = null; for (int i = 0; i < plano.listaCelulas.size(); i++) { aux
	 * = plano.listaCelulas.get(i); if (aux.posicaoX == posicaox && aux.posicaoY ==
	 * posicaoy) { aux.robo = this; } } }
	 * 
	 * public void moverEsquerda() { for (int i = 0; i < plano.listaCelulas.size();
	 * i++) {
	 * 
	 * if (plano.listaCelulas.get(i).robo != null) { plano.listaCelulas.get(i).robo
	 * = null; plano.listaCelulas.get(i - 1).robo = this; } }
	 * 
	 * }
	 * 
	 * public int moverDireita() { return posicaox + 1; }
	 */
	
	public long pontos;
	public int posicao_x;
	public int posicao_y;
	public Plano plano;
	
	public Robo(int id, String nome, Plano plano) {
		  this.identificador = id; this.nome = nome; this.posicao_x = 1; this.posicao_y =
		  1; this.plano = plano; pontos=0;
	}
	
	
	abstract public void avancar(int numero_passos);
	abstract public void retroceder(int numero_passos);
	
	protected void acumla_pontos() {
		this.pontos =+10;
	}
	
	protected void reduz_pontos() {
		this.pontos =-15;
	}
	
	abstract public boolean verifica_movimento();
	protected void resgate() {
		Celula celula_atual= this.plano.retornarCelula(this.posicao_x, this.posicao_y);
		if(celula_atual != null) {
			if(celula_atual.personagem instanceof Aluno) {
				acumla_pontos();
				
			} else if(celula_atual.personagem instanceof Bug) {
				reduz_pontos();
				
			}
			
		}
		
	}
	
	
	
	
	
	
}
