package br.com.bytebank.banco.modelo;
//definirá a assinatura deste método

public interface Tributavel {

	double getValorImposto();
}

//Não há necessidade de utilizarmos 
//o abstract antes de interface, 
//já que este último já presume que 
//tudo que há nele é de fato abstrato


//Por padrão, o método nesse caso sempre
//será public abstract, por isso é comum 
//que nem se escreva isso no código, 
//ele compila normalmente, já que é o 
//padrão da interface.