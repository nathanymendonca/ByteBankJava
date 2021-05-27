package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		
		ArrayList<Conta> lista = new ArrayList<Conta>(); // fala que é uma lista de <conta>
		
		Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);
        
        System.out.println(lista.size());
        
        Conta ref =  lista.get(0); // o get só vai devolver o que for conta
        
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        
        System.out.println("Tamanho: " + lista.size());
        
      
        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(44, 422);
        lista.add(cc4);
        
        
        for(Conta conta : lista) {
        	System.out.println(conta); // laço de jeito mais simples
        	
        }

//        FOR COMPLETO
//        for(int i = 0; i < lista.size(); i++) {
//            
//        	Object oRef = lista.get(i);
//        	System.out.println(oRef);
//
//        }
	}

}
