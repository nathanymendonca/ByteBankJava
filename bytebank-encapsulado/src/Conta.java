public class Conta { 
   private double saldo;
   private int agencia; // por default vai 0, mas pode ser escolhido
   private int numero;
   private Cliente titular;
   private static int total;
   
   public Conta( int agencia, int numero) { 
	   Conta.total++;
	   System.out.println("o total de contas é " + Conta.total);
       this.agencia = agencia;
       this.numero = numero;
       System.out.println("estou criando uma conta " + this.numero);
   }
  
   //Abaixo, temos todos os métodos, como deposita, saca e transfere, 
   //além dos getters e setters. Por fim, temos o método da classe, 
   //que nos retorna o total das contas, com um atributo estático privado, 
   //o nome da classe:
  public void deposita(double valor) {
	 this.saldo += valor; 
  }
  
  public boolean saca(double valor) {
	  if(this.saldo >= valor) {
		  this.saldo -=	 valor;
		  return true;
	  } else {
		  return false;
	  }
	  
  }
  
   public boolean transfere(double valor, Conta destino ){
	   if(this.saldo >= valor) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
		   
	   } 
		return false;
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
   
   
   
   
   
   
   
}
