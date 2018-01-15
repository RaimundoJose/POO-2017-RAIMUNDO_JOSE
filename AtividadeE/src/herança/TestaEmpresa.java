package caelumpoo.herança;

public class TestaEmpresa {

	public static void main(String[] args) {
		//Funcionario[] empregados = new Funcionario[10];
		Funcionario  funcionarios = new Funcionario();
		Empresa empresa = new Empresa( );
		//empresa.funcionarios = new Funcionario[10];
		
		Empresa f = new Empresa();
		//Funcionario  f1 = new Funcionario();
		//Funcionario f2 = new Funcionario();
	    
	    f.setNome("Ana");
	    f.setEndereco("rua 100 2000");
	    f.setSalario(1000.0);
	    f.setBonificacao(100.0); 	    
	    empresa.Adiciona(f);
	  
	    
	    
	    
	   /* f1.setNome("Anajulia");
	    f1.setEndereco("rua 200 1000");
	    f1.setSalario(2000.0);
	    f1.setBonificacao(200.0);
	 
	    
	    
	   
	   
	   
	 
	  // empregados.setBonificacao(10);;
	   f2.setNome("RJ");
	   f2.setEndereco("rua 300, 300");
	   f2.setSalario(1700.0);
	   f2.setBonificacao(20); 
	   
	   
	   empresa.Adiciona(f2);*/
		
	   System.out.println("\n o array é"+f.toString());
	   
	  // System.out.println("\n o array é"+f1.toString());
	  // System.out.println("o array é"+f2.toString());
	   System.out.println("o array é"+empresa.toString());
	   
	   
		
	 
	}

}
