package br.com.bytebank.banco.modelo;
//definir� a assinatura deste m�todo

public interface Tributavel {

	double getValorImposto();
}

//N�o h� necessidade de utilizarmos 
//o abstract antes de interface, 
//j� que este �ltimo j� presume que 
//tudo que h� nele � de fato abstrato


//Por padr�o, o m�todo nesse caso sempre
//ser� public abstract, por isso � comum 
//que nem se escreva isso no c�digo, 
//ele compila normalmente, j� que � o 
//padr�o da interface.