package caelumpoo.exceçoes;

public class TestaErro {
	
	/* como fazer CASTING de string p int public String soma(String op1, String op2) {
int op1Int = Integer.parseInt(op1);
int op2Int = Integer.parseInt(op2);
return String.valueOf(soma(op1Int, op2Int));*/

	public static void main(String[] args) {
		
			System.out.println("inicio do main");
			metodo1();
			System.out.println("fim do main");
			}
			
	
	      static void metodo1() {
			System.out.println("inicio do metodo1");
			metodo2();
			System.out.println("fim do metodo1");
			}
			
	      
	      static void metodo2() {
			System.out.println("inicio do metodo2");
			int[] array = new int[10];
			for(int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
			}
			System.out.println("fim do metodo2");
			}
			
	}


