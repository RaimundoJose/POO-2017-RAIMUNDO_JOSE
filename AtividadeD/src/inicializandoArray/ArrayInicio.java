package inicializandoArray;

public class ArrayInicio {

	public static void main(String[] args) {
		/*int[] notas = new int[10];
� Inicializando o array de forma est�tica:
int[] notas = {1,3,5,7};
String[] strArr = {"teste", "str1",
"str2"};
		 * */
		
	//int[] notas = new int[10]; inicializa��o com new
	int[] notas = {1,3,5,7}; //inicializa��o sem new
	String[] strArr = {"teste", "str1", "str2"};
	notas[0] = 1;
	System.out.println("mostre tudo :"+notas.length);
	System.out.println("mostre tudo :"+notas[0]);
	System.out.println("mostre tudo :"+strArr[0]);
	

	}

}
