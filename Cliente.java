package br.com.caelu.modelo.Empresa;

public class Cliente {
	private String titular;
	private String endereco;
	private String cpf;
	private int idade;
	
    public Cliente( ) {
		
	}
	
	public Cliente(String titular, String cpf) {
		
		
	}
	
	
	public Cliente(String titular, String endereco, String cpf, int idade) {
		
		this.titular = titular;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String toString(){
			
		return  "Cliente:  "+ titular +" "+cpf +" "+idade+ " "+endereco;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	

	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}

	

	public void setIdade(int idade) {
		this.idade = idade;
	}


	
	public void mudaCPF(String cpf) {
		if(idade<=60){
		 validaCPF(cpf);
		}
			this.cpf=cpf;
		
	}
	private boolean validaCPF(String cpf) {
		
		boolean conseguiu;
		// série de regras aqui, falha caso nao seja válido
		if(idade>60){
		 return  conseguiu=true;
		  }
		else
		{
		return 	conseguiu=false;
		}
		
		}


}
