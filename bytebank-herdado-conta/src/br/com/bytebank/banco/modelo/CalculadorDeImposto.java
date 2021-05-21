package br.com.bytebank.banco.modelo;

//Todos que implementaram a interface Tributavel podem ser utilizados, por meio deste m�todo

//br.com.bytebank.banco.modelo => Full Qualified Name = FQN
public class CalculadorDeImposto {
	  private double totalImposto;

      public void registra(Tributavel t) {

          double valor = t.getValorImposto();
          this.totalImposto += valor;

      }

      public double getTotalImposto() {
          return totalImposto;
      }
      //teremos um m�todo para nos devolver o 
      //valor total de impostos, que � o 
      //getTotalImposto():
}
//
//Com essa arquitetura, poder�amos, inclusive,
//ter desenvolvedores diferentes, desde que 
//ambos tenham definido a interface Tributavel 
//em comum, as classes podem evoluir sem que 
//nada seja alterado nela.