package robo;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		//Plano p = new Plano(2, 2);
		
		//Robo r = new Robo(1, "delta x", 2, 2, p);
		//p.verificarSeTemRobo();
		//r.moverEsquerda();
		//r.moverDireita();
		//p.verificarSeTemRobo();
		
	//Inicio do Jogo
		
		Partida p1 = new Partida();
		//p1.solicitaDados();
		p1.solicitarNome();
		
		//Solicita as posições do plano
		int x = p1.solicitarValorX();
		int y = p1.solicitarValorY();
		
		//Solicita a quantidade de alunos e bugs
		int qtdAlunos = p1.solicitarAlunos();
		int qtdBugs = p1.solicitarBugs();
		
		//È realizado a verificação 
		p1.verificaQtdRoboBug(x,y,qtdAlunos,qtdBugs);
		
		
	
		
        //Criamos o plano e temos acesso a suas informações
		Plano p2 = new Plano(x,y);
		p2.distribuicao_aluno_bug_no_plano(qtdAlunos, qtdBugs);
		p2.retornarCelulas();
		

		
		
		
		
		
		}
		
		
	
	}
	


