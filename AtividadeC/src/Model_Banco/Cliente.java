package Model_Banco;

public class Cliente {
	public String titular;
	public String endereço;
	public String cpf;
	public String idade;
	
    public Cliente( ) {
		
	}
	
	public Cliente(String titular, String cpf) {
		
		
	}
	
	
	public Cliente(String titular, String endereço, String cpf, String idade) {
		
		this.titular = titular;
		this.endereço = endereço;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String toString(){
			
		return "Cliente: "+ titular +cpf +idade;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	/*public void mudaCPF(String cpf) {
		//validaCPF(cpf);
		//this.cpf = cpf;
		if (this.idade <= 60) {
			
			validaCPF(cpf);
			}
			this.cpf = cpf;
			
		
}*/
	public void mudaCPF(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;}
		
	private void validaCPF(String cpf) {
		// série de regras aqui, falha caso nao seja válido
		}

}
