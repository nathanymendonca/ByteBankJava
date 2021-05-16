public class Conta { 
  private double saldo;
  int agencia; // por default vai 0, mas pode ser escolhido
  int numero;
  Cliente titular;
  
  
  
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
	  
   
   public double pegaSaldo() { 
       return this.saldo;
   }
  
}
