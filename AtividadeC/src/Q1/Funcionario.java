package Q1;

//Exercicos 5.5 /Q1
public class Funcionario {
   

	String nome;
	 String depart;
	 double salario;
     Data dataent;
	 String RG;
	 boolean situacao;
	 double bonus;
	
	/*#AtividadeC: Prática de Arrays, Construtores, Static.
Exercícios FJ 11, itens: 5.5, 5.6, 5.8 e 6.8, 6.9*/
	

	public String toString(){
		
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus R$"+bonus;
	}
	
	String Mostra(){
		
		return "Nome: "+ nome+" Departamento de lotação" + depart +" Salário  "+salario+ " Data da entrada "+dataent+ " RG"+RG+" Siuação na empresa "+situacao+"  Bônus R$"+bonus ;
		
	}
  
	public void aumSalario(double valor){
	    
	    this.salario += valor;
	    }
	   
	 public double bonifica(){
	    
	    double result;
	      
	  result = this.salario * 12;
	    
	    return  result;
	    }

	

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}

	 public void setSituacao(boolean situacao) {
			this.situacao = situacao;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
	
	}
		

	


