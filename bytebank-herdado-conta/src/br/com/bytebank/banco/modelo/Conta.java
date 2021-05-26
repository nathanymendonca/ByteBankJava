package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Nathany
 * 
 * */

public abstract class Conta { 
	
   protected double saldo;
   private int agencia; // por default vai 0, mas pode ser escolhido
   private int numero;
   private Cliente titular;
   private static int total = 0;
   
   /**
    * Contrutor para inicializar o objeto Conta a partir da agencia e n
    * 
    * @param agencia
    * @param numero
    */
   
   public Conta(int agencia, int numero) {  // construtor específico
	   Conta.total++;
	   //System.out.println("o total de contas é " + Conta.total);
       this.agencia = agencia;
       this.numero = numero;
       //this.saldo = 100;
       //System.out.println("estou criando uma conta " + this.numero);
   }
  
   //Abaixo, temos todos os métodos, como deposita, saca e transfere, 
   //além dos getters e setters. Por fim, temos o método da classe, 
   //que nos retorna o total das contas, com um atributo estático privado, 
   //o nome da classe:
  
   
   public abstract void deposita(double valor);
  
  
   /**
    * Valor precisa ser maior do que o saldo
    * @param valor
    * @throws SaldoInsuficienteException
    */
  
  public void saca(double valor) throws SaldoInsuficienteException {
	  
	  if(this.saldo < valor) {
		  throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
	  } 
	  
	  this.saldo -=	 valor;	
	  
  }
  
   public void transfere(double valor, Conta destino ) throws SaldoInsuficienteException{
	   this.saca(valor); 
	   destino.deposita(valor); 
		     
	}
   
   public double getSaldo() {
	   return this.saldo;
   }
   
   public int getNumero() {
	   return this.numero;
   }
	  
   public void setNumero(int numero){
	   if(numero <= 0) {
		   System.out.println("nao pode valor <= 0");
		   return;
	   }
	   this.numero = numero;
   }
   
   
   public int getAgencia() {
	return this.agencia;
  }
   
   public void setAgencia(int agencia) {
	   if(agencia <= 0) {
		   System.out.println("nao pode valor menor igual 0");
		   return;
	   }
	
	   this.agencia = agencia;
  }
   
   public void setTitular(Cliente titular) {
	this.titular = titular;
  }
   
   public Cliente getTitular() {
	return titular;
  }
   
   public static int getTotal() {
	   return Conta.total;
   }
   
   
   @Override
   public boolean equals(Object ref) {
	   
	   Conta outra = (Conta) ref;
	  
	   if(this.agencia != outra.agencia) {
		   return false;
	   }
	   if(this.numero != outra.numero) {
		   return false;
	   }
	   
	   return true;
   }
   
   
   @Override
	public String toString() {
		
		return "Número: " + this.numero + ", Agencia: " + this.agencia;
	}
   
   
   
   
}
