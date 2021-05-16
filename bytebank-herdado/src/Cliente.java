
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	//Ele gerou os métodos concretos
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
