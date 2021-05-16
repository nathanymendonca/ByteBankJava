
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo =100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMercela = new Conta();
		contaDaMercela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMercela.transfere(300, contaDoPaulo);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Falou dinheiro");
		}
		System.out.println(contaDaMercela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		}
	}


