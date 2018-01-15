
public class Conta {
private int numero;
	
	public String agencia;
	public String dataAbertura;
	protected double saldo;
	
	protected  static int contador;
	
	
	
	
	
public Conta() {
		
	}

	// rogerio guit 	 comit p coloca na ne rogerio410@gmail.com
	public Conta(  double saldo) {
		this.saldo = saldo;
		this.numero=Conta.getProximo();
	}
	

	
	public Conta( String titular, double saldo) {
		this.saldo = saldo;
		this.numero=Conta.getProximo();
	}

	
	
	//cria automaticamente o nume das contas e conta o numero de 
	public static int getProximo(){
		return ++contador;
		
	}
	
	
		
		
	// aqui pode chamar no to sgtring "Cliente "+cliente"

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString(){
		//sacar(50.00);	
		//return "Conta: "+ numero+ cliente+"  Saldo  "+saldo;
		return "Conta: "+ numero+ "cliente" +saldo ;
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
	
	public boolean saca(double valor) {
	    if (this.saldo < valor) {
	    
	  
	    } else {
	        this.saldo-=valor;  
	        return true;
	    }
		return false;        
	
}
	
	
	 public boolean deposita(double valor) {
		//try{
		 if ( valor<0) {
			 throw new IllegalArgumentException(" Valor negativo corrija e tente novamente");
		 }
		 else
		 {
		 this.saldo += valor;
		 return true;
		
		 }
		 
		//catch (IllegalArgumentException e) {
		//	System.out.println("Valor negativo corrija e tente novamente");
		//}
	 }
	 
	 public void transferir(double valor, Conta c2){
		
		if  (saca(valor)){
			
		 c2.deposita(valor);
		
		}
		else
		{
			 System.out.println("Saldo insuficiente");
		 
		 }
	 }
	


	 
    public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}




	public double getSaldo() {
		return this.saldo;
	}

	public double mostraSaldo(){
    	return getSaldo();
    }


	public double calculaRendimento() {
	
			this.saldo+=(this.getSaldo()*0.1);
			return this.getSaldo();
			
		
		
	}


}
