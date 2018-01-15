package ArrayContas;

/*/*
	
	
	
	boolean sacar(double valor) {
		boolean teste = true;
		if((saldo - valor) >= 0){
			saldo = saldo - valor;	
		}
		else{
			teste = false;
		}
		return teste;
	}
		
	
	
	boolean transferir(Conta destino, double valor) {
		boolean teste = true;
		if(this.sacar(valor)){
		//subtraio o valor o saldo desta conta (this)
		//deposito o valor na conta destino;
		destino.depositar(valor);
		}
		else 
			teste = false;
		return teste;
	}
	
	
	
	
}
*/

public class Banco extends Conta{





	
    Conta[] contas = new Conta[10] ;
    Conta c = new Conta();
    int indice;
    
    
    Banco( ){
    
		
	}
    
    Banco (int tamanho){
    	contas = new Conta[tamanho];
    	
    	
    }
	
		void inserir(Conta c){
			
			contas[indice] = c;
			indice++;
			
		}
		void alterar(Conta c){
			
		}
		
		 



	 Conta consultar(String numero){
			
			for (int i = 0; i<indice; i++){
				
			   if(contas[i].numero==numero){
				  c = contas[i];
				   break;
			   }
			}
			
			return c;
			   
			
		}
	 
	 double sacar(double valor){
			this.saldo-=valor;
			return getSaldo();
		}
		
	 double depositar(double valor){
			this.saldo+=valor;
			return getSaldo();
		}
		
		void excluir(String numero){
			contas[indice] = c;
			indice--;
			
		}
		
		double transferePara(double valor, Conta contaDestino){
			this.saldo-=saldo;
			contaDestino.saldo+=valor;
			return getSaldo();
		}
		
			
		
	

	}
	
