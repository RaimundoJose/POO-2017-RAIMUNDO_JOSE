package Model_Banco;

public class Cliente {
	public String titular;
	public String endere�o;
	public String cpf;
	public String idade;
	
    public Cliente( ) {
		
	}
	
	public Cliente(String titular, String cpf) {
		
		
	}
	
	
	public Cliente(String titular, String endere�o, String cpf, String idade) {
		
		this.titular = titular;
		this.endere�o = endere�o;
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
	

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
		// s�rie de regras aqui, falha caso nao seja v�lido
		}

}
