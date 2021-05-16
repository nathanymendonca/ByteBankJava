
public class Cliente implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		 this.autenticador = new AutenticacaoUtil();
	}
	
	//Ele gerou os m�todos concretos
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
//Gerente � Funcionario e assina Autenticavel;
//Administrador � Funcionario e assina Autenticavel; e
//Cliente � Autenticavel.
