package Q1;



/*#AtividadeC: Prática de Arrays, Construtores, Static.
Exercícios FJ 11, itens: 5.5, 5.6, 5.8 e 6.8, 6.9*/


//System.out.println(empresa.obterFuncionarios());


	
/*System.out.println("Descreva a situação atual do funcionario  \n"+e.f1.toString());
System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+Empresa.Mostra());
System.out.println("Descreva a situação atual do funcionario  \n"+e);
System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f2.Mostra());

System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f3.Mostra());
*/



public class TestaFuncionario {

	
	public static void main(String[] args) {
		 Funcionario f = new Funcionario();
	
		Funcionario f1=new Funcionario();
		Funcionario f2=new Funcionario();
		Funcionario f3=new Funcionario(); 
		
 		

	  
	    Data data = new Data();
	    f1.dataent=data;
	    Empresa empresa = new Empresa();
	    Funcionario[]  funcionarios = new Funcionario[10];
	  
	    empresa.funcionarios = new Funcionario[10];
	  
	   for (int i = 0; i < 5; i++) {
		 
		   f.setNome("Raimundo");
		   f.setSalario(i*1000.0);
		   	 
		   empresa.adiciona(f);
		}
	   
  
	   //  minhasContas[1].deposita(3200.0);      
	
	    f.setNome("Raimundo");
	
	      f.setSalario(1000.0);
	     
	       empresa.adiciona(f);
	       
	            
		
		
	       f1.setNome("Rai");
	   	
		      f1.setSalario(100.0);
		     
		       empresa.adiciona(f1);	
		
		f2.setNome("MARIA ");
		f2.setSalario(2000.0);
	
		empresa.adiciona(f2);
		
		f3.setNome("MANOEL ");
		f3.setSalario(3000.0);
		empresa.adiciona(f3);	
		


     
		
//	/System.out.println(f.);
		
		
	  
	
	}		
			
}

