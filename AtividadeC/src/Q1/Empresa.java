package Q1;

public class Empresa {
	public  Funcionario[] funcionarios;
	String cnpj;
    int posicao;
	
	
	
	public Empresa() {
		
	}
	public Empresa(Funcionario[] funcionarios, String cnpj, int posicao) {
		this.funcionarios = funcionarios;
		this.cnpj = cnpj;
		this.posicao= posicao;
		//this.posicao=Empresa.getProximo();
	}
	/*public static int getProximo(){
		return ++posicao;
		
	}*/
	
	
	void	 adiciona(Funcionario f){
	 for(int i=0; i<funcionarios.length; i++){
		this.funcionarios[posicao]=f;
		posicao++;
		
	 }
    }
	

	 
	public String obterFuncionarios() {
		  String status = "Funcionarios\n";
		     
		   for (int i = 0; i < funcionarios.length; i++) 
		{
		  
		          status += "Funcionario na posicao - " +i+"\n";
		    
		        status += funcionarios[i].nome + "\n";
		         
		   status += "Salario - "+funcionarios[i].salario +"\n";
		        }
		   
		     return  status;
		    }
		


		
	public void  mostraFuncionarios(){
						
		 for(int x : funcionarios){
	    	  System.out.println(x);
	      }
				
	
			 
	}	 
	}
}
