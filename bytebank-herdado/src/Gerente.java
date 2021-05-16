// Gerente é um Funcionario, Gerente herda das class Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil ();
		
	}
	
	// reescrita da classe mae para a classe filha (nao pode mexer mto na assinatura)
	public double getBonificacao() {
		System.out.println("Chamando o método bonificacao do GERENTE");
		return super.getSalario(); // pega a bonificacao definina na class funcionario
		// super = vem da classe mãe, nao está nessa classe
	}

	 @Override
 	public void setSenha(int senha) {
 		this.autenticador.setSenha(senha);
 		
 	}

 	@Override
 	public boolean autentica(int senha) {
 		return this.autenticador.autentica(senha);
 		  
 	   }
 	}


//
//Gerente é Funcionario e assina Autenticavel;
//Administrador é Funcionario e assina Autenticavel; e
//Cliente é Autenticavel.

