package pasta2;

class Ferrari extends Carro {

	public Ferrari(String nome) {
		super(nome);
		
	}
	
	@Override
	public void fazerAndar() {
		System.out.print(" A Ferrari anda mais Rapido");
	}
	
}
