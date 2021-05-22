package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/9/docs/api/overview-summary.html
		
		String nome = "Alura"; //object literal - uma string é imutavel

		
//		String vazio ="    Alura    ";
//		String outroVazio = vazio.trim(); 
//
//		System.out.println(vazio.contains("Alu"));
		// Este método verifica se uma String possui uma sub-String. 
		//Perguntaremos se a String vazio possui uma sub-String Alu.
		
		
		
		
//		String outroVazio = vazio.trim(); 
//
//		System.out.println(outroVazio.isEmpty());
//		//Como do ponto de vista do usuário um espaço não é considerado um caractere,
		//iremos utilizar outro método para anular todos os espaços em uma String.
		//Esse método é chamado de trim()
		
		
		
		
//		String vazio = "";
//		System.out.println(vazio.isEmpty()); // vazio
		//Recebemos como retorno um booleano, neste caso, recebemos um true.
		//Se inserirmos um espaço na String, do ponto de vista do Java, 
		//não teremos mais uma String vazia, e o resultado será false.
		
		
		
		
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
		
		
		
		//char c = nome.charAt(2); // charAt =  pega a posição da letra
		//System.out.println(c);
		
		
		
		//String outra = nome.replace('A', 'a'); // char = uma caractere com aspas simples
		// replace não altera a String original e sim devolve uma nova String
		
		
		
		// String outra = nome.toLowerCase();
		
		System.out.println(nome);
		//System.out.println(outra);
		

	}

}
