package Q1;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
public Data() {
		
	}

	public Data(int dia, int mes, int ano) {
	this.dia = dia;
	this.mes = mes;
	this.ano = ano;
}


	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAno() {
		return ano;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	


		/*6) (opcional) Em vez de utilizar uma String para representar a data, crie uma outra classe, chamada Data. Ela
possui 3 campos int, para dia, m�s e ano. Fa�a com que seu funcion�rio passe a us�-la. (� parecido com
o �ltimo exemplo, em que a Conta passou a ter refer�ncia para um Cliente).
class Funcionario {
Data dataDeEntrada; // qual � o valor default aqui?
// seus outros atributos e m�todos
}
class Data {
int dia;
int mes;
int ano;
}
Modifique sua classe TestaFuncionario para que voc� crie uma Data e atribua ela ao Funcionario:
Funcionario f1 = new Funcionario();
//...
Data data = new Data(); // liga��o!
f1.dataDeEntrada = data;
Fa�a o desenho do estado da mem�ria quando criarmos um Funcionario.
*/

	 public String mostraData(){
	        return dia+ "/" +mes+ "/" +ano;
	    }
	     
	
}
