package Q5;


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
		//duplica a variavel f2 já existente solução renomeá-la
		// a variavel f2 do if tambem foi modificada
		Funcionario f3=f1;
		
		if(f1==f3){
			System.out.println("Os funcionários são iguais \n");
		}
		else{
			System.out.println("Funcionários diferentes \n");
		}
		

			
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f1.Mostra());
		
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f2.Mostra());
		
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f3.Mostra());
	}
}
