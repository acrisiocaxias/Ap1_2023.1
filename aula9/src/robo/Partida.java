package robo;

import java.util.Scanner;

public class Partida {
	Scanner ler = new Scanner(System.in);
	
	
	public void solicitarNome() {
		

		System.out.println("#### Olá, seja bem vindo ao GAME, vamos Iniciar !!? Informe alguns dados : ####\n");
		System.out.println("Informe seu nome :");
		String nome = ler.next();
	}
	
	//Solicita o tamanho do plano
	public int solicitarValorX() {
		System.out.println("Informe a dimensão X do plano :");
		int x = ler.nextInt();
		return x;
	}
	public int solicitarValorY() {
		System.out.println("Informe a dimensão Y do plano :");
		 int y = ler.nextInt();
		return y;
	}
	
	//Solicita a quantidade de alunos e bugs
	public int solicitarAlunos() {
		System.out.println("Informe a quantidade de alunos perdidos :");
		int qtdAluno = ler.nextInt();
		return qtdAluno;
	}
	public int solicitarBugs() {
		System.out.println("Informe a quantidade de Bugs :");
		int qtdBug = ler.nextInt();
		return qtdBug;
	}

	//Verifica se a quantidade de alunos e bugs s�o menor que a metade do plano
	public void verificaQtdRoboBug(int tamanhoX, int tamanhoY, int quantidade_aluno,int quantidade_bug) {

		if((quantidade_aluno+quantidade_bug)<(tamanhoX*tamanhoY)/2) {
	     
			
	       
		}else {
			System.out.println("A quantidade de Alunos e Bugs s�o maior que a metade da quantidade de celulas, por favor reinforme : ");
			
			solicitarAlunos();
			solicitarBugs();
			verificaQtdRoboBug(tamanhoX, tamanhoY,  quantidade_aluno, quantidade_bug);
			
		}
		
	}
	
	
	public void solicitaDados() {
		solicitarNome();
		int x = solicitarValorX();
		int y = solicitarValorY();
		int qtdAlunos = solicitarAlunos();
		int qtdBugs =solicitarBugs();
		verificaQtdRoboBug(x,y,qtdAlunos, qtdBugs);
		
	}

	

	
	
	
	
	
	
	
	
	
//Metodo anterior...	
//	public void solicitarDados() {
//		String nome;
//		int x;
//		int y;
//		int qtdAluno ;
//		int qtdBug ;
//
//		Scanner ler = new Scanner(System.in);
//
//		System.out.println("#### Olá, seja bem vindo ao GAME, vamos Iniciar !!? Informe alguns dados : ####\n");
//		System.out.println("Informe seu nome :");
//		nome = ler.next();
//		System.out.println("Informe a dimensão X do plano :");
//		x = ler.nextInt();
//		System.out.println("Informe a dimensão Y do plano :");
//		y = ler.nextInt();
//		System.out.println("Informe a quantidade de alunos perdidos :");
//		qtdAluno = ler.nextInt();
//		System.out.println("Informe a quantidade de Bugs :");
//		qtdBug = ler.nextInt();
//		//Passamos os valores do plano
//				Plano plano1 = new Plano(x,y);
//				plano1.retornarCelulas();
//
//				//plano1.verificaQtdRoboBug(x, y, qtdAluno, qtdBug);
//		        
//				
//				if((qtdAluno+qtdBug)<(x*y)/2) {
//					plano1.distribuicao_aluno_bug_no_plano(qtdAluno, qtdBug);
//				}else {
//					System.out.println("A quantidade de alunos e bugs s�o maior que a metade das celulas, reinforme(o)s obedecendo a regra :");
//					System.out.println("Informe a quantidade de alunos perdidos :");
//					qtdAluno = ler.nextInt();
//					System.out.println("Informe a quantidade de Bugs :");
//					qtdBug = ler.nextInt();
//	}
}

