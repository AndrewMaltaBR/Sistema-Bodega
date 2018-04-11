import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int quantidade, opcao = 1;

		Funcionario f1 = new Funcionario("Sandy Júnior", 1800);
		Funcionario f2 = new Funcionario("Pedro Valença", 1600);
		Funcionario f3 = new Funcionario("Milton Nascimento", 1400);

		Empresa bodega = new Empresa("Bodega do Joãzin", "58.351.278/0001-93");
		bodega.Contrata(f1);
		bodega.Contrata(f2);
		bodega.Contrata(f3);

		Bebida bebida = new Bebida("Brahma", 0.5, 350, 5.8, 50);
		
		while(opcao != 0){
			System.out.println("-------------------");
			System.out.println("1 - Vender bebida");
			System.out.println("2 - Comprar bebida");
			System.out.println("3 - Ver funcionários");
			System.out.println("4 - Ver bebida");
			System.out.println("0 - Sair");
			System.out.println("-------------------");
			System.out.print(">>> ");
			opcao = scanner.nextInt();
			switch(opcao){
				case 0:
				break;
				case 1:
					System.out.print("Digite a quantidade: ");
					quantidade = scanner.nextInt();
					bebida.Vender(quantidade);
				break;
				case 2:
					System.out.print("Digite a quantidade: ");
					quantidade = scanner.nextInt();
					bebida.Comprar(quantidade);
				break;
				case 3:
					bodega.MostrarFuncionarios();
				break;
				case 4:
					bebida.Mostra();
				break;
				default:
					System.out.println("Opção inválida!");
				break;
			}
		}
	}
}
