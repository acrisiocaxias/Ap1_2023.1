package robo;

import java.util.ArrayList;
import java.util.Random;

public class Plano {

	public ArrayList<Celula> listaCelulas;

	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();

			int contador = 1;
			for (int i = 1; i <= tamanhoX; i++) {
				for (int j = 1; j <= tamanhoY; j++) {
					Celula celula = new Celula(contador, i, j);
					listaCelulas.add(celula);
					contador++;
				}
			}
	}
	

	public void verificarSeTemRobo() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if(listaCelulas.get(i).personagem != null) {
				if (listaCelulas.get(i).personagem instanceof Robo) {
					System.out.println("tem robo" + aux.personagem.nome + "  - x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
				}
			}
		}
		
	}


	public Celula retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).imprimir());
		}
	}
	
	public void distribuicao_aluno_bug_no_plano(int quantidade_aluno, int quantidade_bug) {
		
		//PROVISORIO NECESSÃ�RIO REFATORAR CODIGO		
		//Sorteia celulas de forma aleatÃ³ria para distribuiÃ§Ã£o dos alunos
		Random random = new Random();
		
		for (int i = 0; i < quantidade_aluno; i++) {
			int aux_randomico = random.nextInt(listaCelulas.size());
			
			if((listaCelulas.get(aux_randomico).personagem == null) && (aux_randomico != 0)) {
				listaCelulas.get(aux_randomico).personagem= new Aluno(i);
			}else {
				i--;
				continue;
			}
			
			
			
		}
		
		int aux_contador_bug=0;
		int aux_randomico = 0;
		while(aux_contador_bug < quantidade_bug) {
			aux_randomico = random.nextInt(listaCelulas.size());
			
			if((listaCelulas.get(aux_randomico).personagem == null) && (aux_randomico != 0)) {
				listaCelulas.get(aux_randomico).personagem= new Bug(aux_contador_bug);
			}else {
				
				continue;
			}
			aux_contador_bug++;
		}
		System.out.println("Alunos e Bugs distribuidos sobre o tabuleiro ... OK");
		
	}
	

}
