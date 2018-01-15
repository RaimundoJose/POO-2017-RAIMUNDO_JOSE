package caelumpoo.herança;

public class Empresa extends Funcionario{
	private Funcionario[] funcionarios = new Funcionario[10];
	private String cnpj;
	Empresa[] empresa = new Empresa[10];  
	//Empresa.empregados = new Funcionario[10];
	
	public Empresa() {
		super();
		
	}
	public Empresa(Funcionario[] empregados, String cnpj) {
		super();
		this.funcionarios = empregados;
		this.cnpj = cnpj;
	}
	public Funcionario[] getEmpregados() {
		return funcionarios;
	}
	public void setEmpregados(Funcionario[] empregados) {
		this.funcionarios = empregados;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	void Adiciona(Funcionario f){
		
		
		for(int i= 0; i<10; i++){
			
			funcionarios[i] = f;
		}
		
	}

}
