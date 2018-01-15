package APP_Banco;

import Model_Banco.Conta;
import Model_Banco.Cliente;

public class TestaConta {

	public static void main(String[] args) {
 /*Conta minhaConta = new Conta();
  Cliente c = new Cliente();
  minhaConta.titular = c;*/
			
		Conta c1 = new Conta(1000.00);
		Conta c2 = new Conta("sese", 5000.0, 1000.0);
		Cliente cli = new Cliente("Raimundo","686.557.113-49");
		c1.cliente=cli;
		c2.cliente =cli;
		c1.cliente.setTitular("RJ");
	//	cli.setTitular("RJ");
		cli.setCpf("686.557.113-49");
		cli.setIdade("25");
		cli.setEndereço("Rua 1, s/n");
		c1.depositar(1500.0);
		c1.setCliente(cli);
		c1.setLimite(0);
		c1.getProximo();
		c1.depositar(8000.0);
		
	/*	Conta c1 = new Conta();
		c1.deposita(100);
		
		 Conta c2 = c1; // linha importante! variavel duplicada
		 c2.deposita(200);
		
		 System.out.println(c1.saldo);
		 System.out.println(c2.saldo);
		}*/

		
		
		cli.setCpf("685.667.113-49");
		cli.setIdade("35");
		cli.setEndereço("Rua 1, s/n");
		c2.depositar(5000);
		c2.transferir(1000,  c1);
		c2.sacar(20.000);
		c2.setCliente(cli);
		c2.getProximo();
		
		c1.transferir(5000.0, c2);
		c2.transferir(10000, c2);
		c1.calculaRendimento();
		
				System.out.println(c1.toString());
				System.out.println(c2.toString());
				
				System.out.println("Mostra o saldo  da conta"+c1.getProximo()+" : "+c1.mostraSaldo());
				System.out.println("Mostra o saldo "+c2.mostraSaldo());
				System.out.println(cli.toString());
				System.out.println("saldo	atual de c1 é: "	+	c1.getSaldo());
				System.out.println("saldo	atual: de c2 é "	+	c2.getSaldo());
				System.out.println("O rendimento de c1 é: "+c1.calculaRendimento());
				System.out.println("O rendimento de c2 é: "+c2.calculaRendimento());
			
				}

}
