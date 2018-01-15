package ArrayObjetos;

public class ArrayObjetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* Conta[] contas;
contas = new Conta[10];
Conta c1 = new Conta(1,1000);
contas[0] = c1;
// ou
contas[0] = new Conta(1, 1000);
		
		double saldo = contas[0].saldo;
		
		contas[0].saldo = 100;
		
		
		*/
		
		Conta[] contas = new Conta[10];
		Conta c1 = new Conta("1", 1000);
		contas[0] = c1;
		contas[1]=c1;
		//double saldo = contas[0].saldo;
		contas[1].numero = "2";
		contas[1].saldo = 2000;
		System.out.println("O saldo é  :"+c1.saldo);
		System.out.println("O numero   é  :"+c1.numero);
		System.out.println("O saldo é  :"+c1.getSaldo());
		System.out.println("O numero   é  :"+c1.getNumero());
		
	}

}
