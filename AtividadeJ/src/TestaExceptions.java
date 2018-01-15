import java.io.FileNotFoundException;

public class TestaExceptions {
	public static void main(String[] args)  {
	/*
		System.out.println("inicio do main");
	     //try{  
		metodo1();
	 //    }
		//catch (NullPointerException e) {
	//	System.out.println("Erro: metódo em Pilha "+e);
		//}
	       System.out.println("fim do main");
	   }

	   static void metodo1() {
	       System.out.println("inicio do metodo1");
	    try{
	       metodo2();
	     }
	   catch (NullPointerException e) {
			System.out.println("Erro :  metódo em Pilha"+e);
		}
	       System.out.println("fim do metodo1");
	   }

	   static void metodo2()  {
	       System.out.println("inicio do metodo2");
	       ContaCorrente cc = new ContaCorrente();
	       try{
	    	   for (int i = 0; i <= 15; i++) { 
	    	 
	    		   cc.deposita(i + 1000);
	    		   System.out.println(cc.getSaldo());
	    		   		if (i == 5) {
	    		   			cc = null;
	    		   					}
	         }
	    	   
	    	 }
	       catch (NullPointerException e) {
    		   System.out.println("Erro:  Rastro da Pilha " );
	    
	   }
	   
	      
	      
			try {
				new java.io.FileInputStream("arquivo.txt");
			} catch (FileNotFoundException e) {
				
				System.out.println("\nErro:  Arquivo Inexistente,impossível abrí-lo.");//e.printStackTrace();
			}
		
		}
	   
	  
	   
	  /*
    	   for (int i = 0; i <= 15; i++) { 
    		   try{
    		   cc.deposita(i + 1000);
    		   System.out.println(cc.getSaldo());
    		   		if (i == 5) {
    		   			cc = null;
    		   					}
    		   		}
    		   catch (NullPointerException e) {
    			   System.out.println("\nerro: " + e);
    		   }
      	 }*/
	      

	   Conta c = new Conta();
	   ContaCorrente contacorrente = new ContaCorrente();
	   c.setNumero(10);
	   c.setSaldo(2000.0);
	   try{
	   c.deposita(-100);
	   }
	   catch (IllegalArgumentException e) {
		System.out.println("Valor  Inválido");
	}
	   contacorrente.deposita(1000.0);

	   try {
	       c.saca(15000.0);
	   } catch (IllegalArgumentException e) {
	       System.out.println("Saldo Insuficiente, seu saldo é "+ c.getSaldo());
	   }
	 //  System.out.println("\nO saldo é: "+ c.getSaldo());
	}
	
	}
 

