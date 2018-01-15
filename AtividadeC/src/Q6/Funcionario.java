package Q6;



public class Funcionario {
	private String nome;
	
	private String depart;
	private double salario;
	private Data dataent;
	private String RG;
	private boolean situacao;
	private double bonus;


	
	
	

	public Funcionario() {
		
		
	}

	public Funcionario(String nome, double salario, Data dataent) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.dataent = dataent;
	}

	public String toString(){
		//Bonifica(1000.00);	
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus"+bonus+ "Total recebido R$"+Bonifica(2000.00, 1000.00);
	}
	
	/*String Mostra(){
		//Bonifica(1000.00);	
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus"+bonus+" Total recebido R$"+Bonifica(2000.00,1000.00);
		
	}*/
	
	
	
  
	public Data getDataent() {
		return dataent;
	}

	public void setDataent(Data dataent) {
		this.dataent = dataent;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public boolean isSituacao() {
		return situacao;
	}
	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	double Bonifica(double salario, double bonus){
		double remTot = this.salario+this.bonus;
		return remTot;
	}
	
	void Demite(boolean situacao){
		if(situacao==true){
			System.out.println("Funcionario ativo na empresa\n");
		}
		else
		{
			System.out.println("Funcionario demitido com exito da empresa\n");
		}
	}

	

}
