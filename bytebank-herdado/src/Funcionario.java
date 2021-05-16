
// nao pode instanciar objetos dessa classe, pq � abstrata
public abstract class Funcionario {
	
	
	private String nome;
	private String cpf;
	private double salario;
	// protected = publico para os filhos para o resto privado
	
	//Precisamos pensar em quais atributos
	//o funcion�rio tem. No caso, teremos 
	//o nome, que ser� uma String privada.
	//Al�m disso, ele ter� um cpf, que tamb�m 
	//ser� uma String, e um salario, que ser� 
	//do tipo double:
	
	//metodo sem corpo, n�o h� implementa��o, obriga os filhos a usar o m�todo
	public abstract double getBonificacao();
	
	//***USADO NO IN�CIO DO EXERC�CIO, PERDEU UTILIDADE
	// get e set 
	//public abstract double getBonificacao() {
	//	return this.salario * 0.05;
	//}
	
	//utilizamos um getter em getBonificacao 
	//mesmo n�o tendo criado o atributo bonificacao. 
	//N�o h� problema em fazer isso, ou seja, podemos 
	//criar nossos pr�prios getters ainda que n�o haja
	//um atributo relacionado.
	
	//Temos public seguido direto pelo nome da classe,
	//sem nenhum tipo de retorno definido, como double, por exemplo.

//Mesmo sem termos criado este construtor, nosso c�digo estava funcionando.
//Isso porque, se nenhum construtor for criado, o compilador insere automaticamente 
//o construtor padr�o.

//O construtor padr�o � aquele que n�o recebe nenhum par�metro.

//Trabalharemos novamente com a classe TesteFuncionario. 
//Daremos um nome para este funcion�rio, utilizando o setNome, 
//bem como um CPF, por meio do setCpf', e ainda, um sal�rio, com o setSalario:
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
