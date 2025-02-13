package pasta2;

public class MainCarro {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro("Marca");
		
		Ferrari ferrari1 = new Ferrari("Rapido");
		
		System.out.println(carro1.nome + ": ");
		carro1.fazerAndar();
		
		System.out.println(ferrari1.nome + ": ");
		ferrari1.fazerAndar();

	}

}
