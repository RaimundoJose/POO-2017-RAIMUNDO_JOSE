package PercorrendoArray;

public class PercorrendoAerrayEnchacedFor {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		for (int i = 0; i < numeros.length; i++) {
		numeros[i] = i * 10;
		
		/*for (int numero: numeros) {
System.out.println(numeros);*/
		for (int numero: numeros){
			
			System.out.println(numeros[i]);
			
		}

	

		}
	
	}
}