package ArrayContas;


public class Conta {
	String numero;
	double saldo;
	Cliente titular;
	
	
	
	Conta (){
		
		
		
	}
	Conta(String numero, double saldo,Cliente titular){
		
		this.numero = numero;
		this.saldo = saldo;
		this.titular = titular;
		if (saldo >= 0) {
			this.saldo = saldo;	
		} else {
			this.saldo = 0;
		}	
	}
	
	double saca(double valor){
		this.saldo-=valor;
		return getSaldo();
	}
	
	double deposita(double valor){
		this.saldo+=valor;
		return getSaldo();
	}
	
	double transferePara(double valor, Conta contaDestino){
		this.saldo-=saldo;
		contaDestino.saldo+=valor;
		return getSaldo();
		
		
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
	
	
}
