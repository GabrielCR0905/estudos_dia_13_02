package pasta3;

 class Pessoa {
   String nome;
   int idade;
   
   public Pessoa(String nome, int idade) {
	   this.nome = nome;
	   this.idade = idade;
	   
   }
   
   public void exibirDados() {
	   System.out.print("Nome:"+ nome);
	   System.out.print("Idade: " + idade);
	   
   }
}
