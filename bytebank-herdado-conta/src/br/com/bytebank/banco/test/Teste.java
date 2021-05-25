package br.com.bytebank.banco.test;

public class Teste {
	
	
	//Array [] tbm é um objeto
	 public static void main(String[] args) {

		 int[] idades = new int[5]; //inicializa o array com 0
		 
		 for(int i = 0; i < idades.length; i++) {
			 idades[i] = i * i;
		 }
			 
		 
		 for (int i = 0; i < idades.length; i++) {
			 System.out.println(idades[i]);
		 }
		 }
		 
		 
//		 idades[0] = 29;
//         idades[1] = 39;
//         idades[2] = 49;
//         idades[3] = 59;
//         idades[4] = 69;
//
//         
//         int idade1 = idades[2];
//         
//         
//         System.out.println(idade1);
//         
//         System.out.println(idades.length); 
//}
    }
