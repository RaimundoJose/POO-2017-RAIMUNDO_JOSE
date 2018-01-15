package Q8;


public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1=new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario Funcionario = new Funcionario();
		
		Data data = new Data();
		Data dataDeEntrada;
		
		f1.setDataent(data);
		
		
		
		
		
		
		f1.setDepart("Informatica");
		f1.setRG("1.379.802/PI");
		f1.setNome("Fiodor");
		f1.setSalario(100.00);
		f1.setBonus(50.0);
		
		
		//f1.dataDeEntrada = data;
		//f1.setDataent(data);
		data.setDia(10);
		data.setMes(3);
		data.setAno(2012);
		
		
		f2.setDepart("Informatica");
		f2.setRG("1.379.802/PI");
		f2.setNome("Fiodor");
		f2.setSalario(100.00);
		f2.setBonus(50.0);
		f2.setSituacao(true);

		//duplica a variavel f2 já existente solução renomeá-la
		// a variavel f2 do if tambem foi modificada
		
		
		
		//ACESSANDO DIRETO DA CLASSE não é possivel porque não nenhuma instância de Funcionario en sim uma classe
		// A não ser que seja criada um objeto Funcionario do tipo Funcionario será a solução
		
		Funcionario = f1;
		Funcionario.Demite(false); // compila mas da erro pelo mesmo motivo anterior  nao esta instanciado
		System.out.println("Dia: " + f1.getDataent().getDia());
	    System.out.println("Dia: " + f1.getDataent().getMes());
		System.out.println("Dia: " + f1.getDataent().getAno());
		
		System.out.println("A data de entrada de f1 é: "+f1.getDataent().Mostra());
		
		System.out.println(data.Mostra());
	
		System.out.println(f1.Mostra());
		System.out.println(Funcionario.Mostra());
		
		System.out.println("Dia: " + Funcionario.getDataent().getDia());
	    System.out.println("Dia: " + Funcionario.getDataent().getMes());
		System.out.println("Dia: " + Funcionario.getDataent().getAno());
		
		
	}
}
