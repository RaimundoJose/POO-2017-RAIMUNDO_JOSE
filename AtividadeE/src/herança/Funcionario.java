package caelumpoo.herança;

public class Funcionario {
	private String nome, endereco;
	private double salario, bonificacao;
	Funcionario[] funcionarios = new Funcionario[10];
	
	

	public Funcionario() {
		
		
	}

	public Funcionario(String nome, String endereco, double salario, double bonificacao) {		
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
		this.bonificacao = bonificacao;
	}


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public double getBonificacao() {
		return bonificacao;
	}



	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}



	


	

	
	
     
	
}
