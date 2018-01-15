package ArrayContas;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco(10);
        
		
		Conta c1 = new Conta();
		Conta c2= new Conta();
		
		Cliente cl = new Cliente();
		
		
		
		//cl.nome="RJ";
		//cl.cpf="123456789-00";
		//c.setNumero=("123");
		c1.setNumero("12");
		
		
		cl.nome="RJ";
		cl.cpf="123456789-10";
		
		c1.setSaldo(10000.0);
		c1.saca(2000.0);
		c1.deposita(5000.0);
		c1.deposita(10000.0);
		banco.inserir(c1);
		
		c1.transferePara(5000.0, c2);
	   // banco.inserir(c);
		
		c2.setNumero("13");
		c2.setSaldo(1000.0);
		cl.nome="RJN";
		cl.cpf="123456789-00";
		banco.inserir(c2);
		
		System.out.println("O saldo é: R$"+c1.getSaldo());
		System.out.println("O saldo é: R$"+c2.getSaldo());
		System.out.println("O saldo é: R$"+c1.toString());
		System.out.println("O saldo é: R$"+c2.toString());
		
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
	}
	
	
}
