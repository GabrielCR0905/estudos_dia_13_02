package package1;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Bicho");
		
		Cachorro cachorro1 = new Cachorro("Rex");
        
		System.out.println(animal1.nome + ":");
		animal1.fazerSom();
		
		System.out.print(cachorro1.nome + ":");
		cachorro1.fazerSom();
	}

}
