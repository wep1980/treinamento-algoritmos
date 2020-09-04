package treinamento.algoritmos;

public class Algoritmos {

	public static void main(String[] args) {

		int resposta = fatorial(3);
		System.out.println("O fatorial é : " + resposta);
		
		int[] valores = fibonacci2(10);
		for (int v : valores) {
			System.out.print(v + " - ");
		}

	}

	/* --------------------- MÉTODOS ----------------------- */

	// Fatorial ( recurssão )
	static int fatorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		return numero * fatorial(numero - 1);
	}

	// Fibonacci 1
	static void fibonacci1(int qtd) {
		for (int cont = 0, i = 0, j = 1; cont < qtd; cont++) {
			i = i + j;
			j = i - j;
		}
	}

	// Fibonacci 2
	static int[] fibonacci2(int qtd) {
		
		int[] resposta = new int[qtd]; 
		
		for (int cont = 0, i = 0, j = 1; cont < qtd; cont++) {
			i = i + j;
			j = i - j;
			
			resposta[cont] = i;
		}
		return resposta;
	}
}
