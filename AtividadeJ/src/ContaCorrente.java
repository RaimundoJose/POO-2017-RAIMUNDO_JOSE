

public class ContaCorrente extends Conta{
	protected double limite;


	@Override
	public boolean deposita(double valor) {
		// TODO Auto-generated method stub
		super.deposita(valor);
		return true;
	}


//	@Override
	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		//try{
		super.saca(valor);
		//}
	//	catch (IllegalArgumentException e) {
	//	System.out.println("Erro: Valor negativo digite outro valor ou saldo insufuciente");
	//	}
		return false;
	}


	@Override
	public void transferir(double valor, Conta c2) {
		// TODO Auto-generated method stub
		super.transferir(valor, c2);
		
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double mostraSaldo(){
		return super.getSaldo()+getLimite();
	}


	public double calculaRendimento() {
		   super.saldo+=(super.getSaldo()*0.1);
				return super.getSaldo();
			
	}
	@Override
	public double getSaldo() {
		return super.getSaldo()+getLimite();
	}

	public String getTipo(){
		return "Conta Corrente ";
	}

}
