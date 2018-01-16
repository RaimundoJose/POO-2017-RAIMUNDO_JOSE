package br.com.caelu.modelo.Empresa;

public class Gerenrte extends Funcionario implements Autenticavel{
	protected int senha;
	protected int numeroDeFuncionariosGerenciados;
	
	//Autenticavel a = new Gerente();
	
	public int getSenha() {
		return senha;
	}


	public void setSenha(int senha) {
		this.senha = senha;
	}
	public	boolean	autentica(int	senha) {
												if	(this.senha	==	senha)	{
																System.out.println("Acesso	Permitido!");
																return true;
												}	else	{
																System.out.println("Acesso	Negado!");
																return false;
												}
								}
								//	setter	da	senha	omitido
				

   
	


	

	

	@Override
	public double getBonificacao(double salario, double bonus) {
		// TODO Auto-generated method stub
		return  getBonificacao(salario, bonus)*1.4+1000.0;
	}




	


}
