import java.util.ArrayList;
import java.util.Iterator;

class Empresa{
	String nome;
	String cnpj;
	ArrayList<Funcionario> bodegueiros;
	int numFuncionarios;

	public Empresa(String nome, String cnpj){
		this.nome = nome;
		this.cnpj = cnpj;
		this.bodegueiros = new ArrayList<>();
		this.numFuncionarios = 0;
	}

	public void Contrata(Funcionario func){
		this.bodegueiros.add(func);
		this.numFuncionarios++;
	}

	public void MostrarFuncionarios(){
		int n = this.bodegueiros.size();
	    for (int i=0;i<n;i++) {
	    	Funcionario f = this.bodegueiros.get(i);
	    	System.out.println((i+1)+" - "+f.nome+" | R$ "+f.salario);
	    }
	}

}