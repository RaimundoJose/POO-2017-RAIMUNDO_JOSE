package Q3;


public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		f1.setDataent("10-10-2000");
		f1.setDepart("Informatica");
		f1.setRG("1.379.802/PI");
		f1.setNome("Fiodor");
		f1.setSalario(100.00);
		f1.setBonus(50.0);
		
		
		
		
		System.out.println("O codigo mostrar exibe os valores dos atributos  \n"+f1.Mostra());
		
	}
}
