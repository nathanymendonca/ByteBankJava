package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayListEquals {
	
	
	//Array [] tbm é um objeto
	 public static void main(String[] args) {
		 
		 

		//Generics
		 
	        ArrayList<Conta> lista = new ArrayList<Conta>();

	        Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);

	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);
	        
	        Conta cc3 = new ContaCorrente(22, 22);
	        //lista.add(cc3);

	        boolean existe = lista.contains(cc3); // ve se contem itens na lista // mudar cc3 para ccc2

	        System.out.println("Já existe? " + existe);

	        
	        
	        
//	        for(Conta conta : lista) {
//	        	if(conta.ehIgual(cc3)) { // para ver se já tem essa referencia mudar o cc2 para cc3
//                System.out.println("Já tenho essa conta");
                 
	        
	        
	        
	        for(Conta conta : lista) {
	                System.out.println(conta);
	        }
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
	 
	 
	 //int[] idades = new int[5]; //inicializa o array com 0
//	 
//	 for(int i = 0; i < idades.length; i++) {
//		 idades[i] = i * i;
//	 }
//		 
//	 
//	 for (int i = 0; i < idades.length; i++) {
//		 System.out.println(idades[i]);
//	 }
//}
    
