package Q4;


public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setDataent("10-10-2000");
		f1.setDepart("Informatica");
		f1.setRG("1.379.802/PI");
		f1.setNome("Fiodor");
		f1.setSalario(100.00);
		f1.setBonus(50.0);
		f1.setSituacao(true);
		
		f2.setDataent("10-10-2000");
		f2.setDepart("Informatica");
		f2.setRG("1.379.802/PI");
		f2.setNome("Fiodor");
		f2.setSalario(100.00);
		f2.setBonus(50.0);
		f2.setSituacao(true);
		
		//funcionarios diferentes porque apontam para aloca��es de mem�ria diferentes
		if(f1==f2){
			System.out.println("Os funcion�rios s�o iguais \n");
		}
		else{
			System.out.println("Funcion�rios diferentes \n");
		}
		

			
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f1.Mostra());
		
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f2.Mostra());
		
	}
}
