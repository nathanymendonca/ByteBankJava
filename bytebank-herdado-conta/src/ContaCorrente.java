//herda métodos e atributos, mas não herda o construtor, tem que chamar (linha5)
public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);   // super = chamada do construtor da classe mãe
	}

	@Override // @Override = Ssobreescreve o método
	public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
