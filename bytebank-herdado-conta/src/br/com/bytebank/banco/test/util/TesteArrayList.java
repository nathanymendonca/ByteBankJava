package br.com.bytebank.banco.test.util;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteArrayList {
	
	
	//Array [] tbm é um objeto
	 public static void main(String[] args) {
		 
		 List<Conta> lista = new ArrayList<Conta>();
		 
		 
		 
             GuardadorDeContas guardador = new GuardadorDeContas();

             Conta cc = new ContaCorrente(22, 11);
             guardador.adiciona(cc);

             Conta cc2 = new ContaCorrente(22, 22);
             guardador.adiciona(cc2);
             
             int tamanho = guardador.getQuantidadeDeElementos();
             System.out.println(tamanho);
             
             Conta ref  =guardador.getReferencia(0); // muda para nº 1 e vai para a cc2
             System.out.println(ref.getNumero());
	
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
    
