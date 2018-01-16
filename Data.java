package br.com.caelu.modelo.Empresa;

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
	


		

	 public String mostraData(){
	        return dia+ "/" +mes+ "/" +ano;
	    }
	     
	

}
