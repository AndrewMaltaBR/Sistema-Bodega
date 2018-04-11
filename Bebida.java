class Bebida{
	String nome;
	double teorAlcoolico;
	double ml;
	double precoVenda;
	int estoque;

	public Bebida(String nome, double teorAlcoolico, double ml, double precoVenda, int estoque){
		this.nome = nome;
		this.teorAlcoolico = teorAlcoolico;
		this.ml = ml;
		this.precoVenda = precoVenda;
		this.estoque = estoque;
	}

	public void Comprar(int quantidade){
		if(quantidade <= 0){
			System.out.println("Quantidade inválida!");
			return;
		}
		this.estoque += quantidade;
		System.out.println("Estoque atual: "+this.estoque);
	}

	public void Vender(int quantidade){
		if(!this.ConfereEstoque()){
			System.out.println("Estoque vazio!");
			return;
		}
		if(quantidade <= 0){
			System.out.println("Quantidade inválida!");
			return;
		}
		if(quantidade > this.estoque){
			System.out.println("Quantidade indisponível no estoque!");
			return;
		}
		this.estoque -= quantidade;
		System.out.println("Valor a ser pago: R$ "+(this.precoVenda*quantidade));
	}

	public boolean ConfereEstoque(){
		return this.estoque > 0;
	}

	public void Mostra(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Teor Alccólico: "+this.teorAlcoolico);
		System.out.println("Quantidade: "+this.ml+" ml");
		System.out.println("Peço de venda: R$ "+this.precoVenda);
		System.out.println("Estoque: "+this.estoque);
	}
}
