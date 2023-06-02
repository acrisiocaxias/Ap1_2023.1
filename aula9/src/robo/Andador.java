package robo;

public class Andador extends Robo {

	

	


	public Andador(int id, String nome, Plano plano) {
		super(id, nome, plano);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Andador [pontos=" + this.pontos + ", posicao_x=" + this.posicao_x + ", posicao_y=" + this.posicao_y + ", plano="
				+ plano + ", nome=" + this.nome + ", identificador=" + this.identificador + ", getClass()=" + getClass()
				+ ", hashCode()=" + this.hashCode() + "]";
	}

	@Override
	public void avancar(int numero_passos) {
		// TODO Auto-generated method stub
		this.posicao_y =+numero_passos;
		
	}

	@Override
	public void retroceder(int numero_passos) {
		// TODO Auto-generated method stub
		this.posicao_y =-numero_passos;
		
	}


	public boolean movimenta(Movimento movimento, int passos) {
		
	switch (movimento) {
	case AVANCAR: {
		avancar(passos);
		
	}
	case RETROCEDER: {
		retroceder(passos);
	}
	default:
		throw new IllegalArgumentException("Valor não experado: " + movimento);
	}
		
	}
	
	public void movimenta() {
		
	}
	
	
	
	

	@Override
	public boolean verifica_movimento() {
		
		return false;
	}
	



	
	
	
	



}
