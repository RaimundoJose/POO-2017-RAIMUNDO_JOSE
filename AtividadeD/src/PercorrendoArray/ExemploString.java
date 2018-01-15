package PercorrendoArray;

public class ExemploString {
	
	

	public static void main(String[] args) {
		/* String s = "Instituto Fedearal do Piaui";
System.out.println(s.toUpperCase());
System.out.println(s.toLowerCase());
System.out.println(s.charAt(2));
System.out.println(s.length());
System.out.println(s.substring(5));
System.out.println(s.substring(0,4));
String[] stringDividida = "Instituto Fedearal do
Piaui".split(" ");
System.out.println(stringDividida[0] + "-" +
stringDividida[1] + "-" +
stringDividida[2]);
System.out.println("-" + " a ".trim() + "-");
}
}
		 * */
		String s = "   Instituto    Federal   do   Piaui   ";
		System.out.println(s.toUpperCase());//maiusculas
		System.out.println(s.toLowerCase());//minusculas
		System.out.println(s.charAt(2)); //string na posição
		System.out.println(s.length()); //tamanho da string
		System.out.println(s.substring(5)); //retorna ums substring da string original apartir da posição 5 posições apartir da 0
		System.out.println(s.indexOf(s, 5));
		System.out.println(s.trim());
		
	}

}
