
// nao pode instanciar objetos dessa classe, pq é abstrata
public abstract class Funcionario {
	
	
	private String nome;
	private String cpf;
	private double salario;
	// protected = publico para os filhos para o resto privado
	
	//Precisamos pensar em quais atributos
	//o funcionário tem. No caso, teremos 
	//o nome, que será uma String privada.
	//Além disso, ele terá um cpf, que também 
	//será uma String, e um salario, que será 
	//do tipo double:
	
	//metodo sem corpo, não há implementação, obriga os filhos a usar o método
	public abstract double getBonificacao();
	
	//***USADO NO INÍCIO DO EXERCÍCIO, PERDEU UTILIDADE
	// get e set 
	//public abstract double getBonificacao() {
	//	return this.salario * 0.05;
	//}
	
	//utilizamos um getter em getBonificacao 
	//mesmo não tendo criado o atributo bonificacao. 
	//Não há problema em fazer isso, ou seja, podemos 
	//criar nossos próprios getters ainda que não haja
	//um atributo relacionado.
	
	//Temos public seguido direto pelo nome da classe,
	//sem nenhum tipo de retorno definido, como double, por exemplo.

//Mesmo sem termos criado este construtor, nosso código estava funcionando.
//Isso porque, se nenhum construtor for criado, o compilador insere automaticamente 
//o construtor padrão.

//O construtor padrão é aquele que não recebe nenhum parâmetro.

//Trabalharemos novamente com a classe TesteFuncionario. 
//Daremos um nome para este funcionário, utilizando o setNome, 
//bem como um CPF, por meio do setCpf', e ainda, um salário, com o setSalario:
	
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
