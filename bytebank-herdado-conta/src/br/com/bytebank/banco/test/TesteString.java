package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/9/docs/api/overview-summary.html
		
		String nome = "Alura"; //object literal - uma string � imutavel

		
//		String vazio ="    Alura    ";
//		String outroVazio = vazio.trim(); 
//
//		System.out.println(vazio.contains("Alu"));
		// Este m�todo verifica se uma String possui uma sub-String. 
		//Perguntaremos se a String vazio possui uma sub-String Alu.
		
		
		
		
//		String outroVazio = vazio.trim(); 
//
//		System.out.println(outroVazio.isEmpty());
//		//Como do ponto de vista do usu�rio um espa�o n�o � considerado um caractere,
		//iremos utilizar outro m�todo para anular todos os espa�os em uma String.
		//Esse m�todo � chamado de trim()
		
		
		
		
//		String vazio = "";
//		System.out.println(vazio.isEmpty()); // vazio
		//Recebemos como retorno um booleano, neste caso, recebemos um true.
		//Se inserirmos um espa�o na String, do ponto de vista do Java, 
		//n�o teremos mais uma String vazia, e o resultado ser� false.
		
		
		
		
////		for(int i = 0; i < nome.length(); i++) {
////			System.out.println(nome.charAt(i)); //  imprimirmos caractere por caractere utilizando
//		}
//		
//		String nome = "Alura"; 
//		System.out.println(nome.length()); // quantos eleentos tem na string
		
		
		
		
//		String sub = nome.substring(1); // pega a parte de string
//		System.out.println(sub);
		
		
		
		//int pos  = nome.indexOf("ur"); // indeof parte da string
		//System.out.println(pos);
		
		
		
		//char c = nome.charAt(2); // charAt =  pega a posi��o da letra
		//System.out.println(c);
		
		
		
		//String outra = nome.replace('A', 'a'); // char = uma caractere com aspas simples
		// replace n�o altera a String original e sim devolve uma nova String
		
		
		
		// String outra = nome.toLowerCase();
		
		System.out.println(nome);
		//System.out.println(outra);
		

	}

}
