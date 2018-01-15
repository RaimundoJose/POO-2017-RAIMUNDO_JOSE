package Model_Banco;



public class Conta {
	private int numero;
	//private String nome;
	public Cliente cliente;
	public String agencia;
	public String dataAbertura;
	private double saldo;
	private double limite;
	private  static int contador;
	
	
	
	
	
public Conta() {
		
	}

	
	//p guit botao direito team  share select todos comit p coloca na ne rogerio410@gmail.com
	public Conta(  double saldo) {
		this.saldo = saldo;
		this.numero=Conta.getProximo();
	}
	
	
	public Conta( String titular, double saldo) {
		this.saldo = saldo;
		this.numero=Conta.getProximo();
	}

	public Conta( String titular, double saldo, double limite) {
		this.saldo = saldo;
		this.limite = saldo+limite;
		this.numero=Conta.getProximo();
	}
	
	
	//cria automaticamente o nume das contas e conta o numero de 
	public static int getProximo(){
		return ++contador;
		
	}
	
	//public Cliente(Cliente cliente){
	//this.Cliente= cliente;
	//this.numero=Conta.getProximo();
	
		
		
	// aqui pode chamar no to sgtring "Cliente "+cliente"

	public String toString(){
		//sacar(50.00);	
		//return "Conta: "+ numero+ cliente+"  Saldo  "+saldo;
		return "Conta: "+ numero+ cliente +saldo +limite;
	}
	
  
	 /*public boolean sacar(double valor){
		 if(valor<=saldo){
		 saldo = saldo -valor;
		 return true;
	 }
	 else
	 {
		 System.out.println("Saldo Insuficiente");
		 return false;
		 
	 }
}*/
	
	public boolean sacar(double valor) {
		if (valor > this.saldo + this.limite){ //posso sacar até saldo+limite
		System.out.println("Saldo Insuficiente fora do limite!");
		return false;
		} else {
		this.saldo = this.saldo - valor;
		return true;
		}
	}

	
	 public void depositar(double valor){
		 this.saldo += valor;
	 }
	 
	 public void transferir(double valor, Conta c2){
		
		 if(sacar(valor)){
			
		 c2.depositar(valor);
		 }
		 else{
			  System.out.println("Saldo insuficiente");
		 }
		 }
	 
	


	 
    public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public double getSaldo() {
		return this.saldo+this.limite;
	}


	


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}


	public double mostraSaldo(){
    	return getSaldo()+getLimite();
    }


	public double calculaRendimento() {
	
			this.saldo+=(this.getSaldo()*0.1);
			return this.getSaldo();
			
		
		
	}


	
	
}
