//class main 
public class Main {

	public static void main(String[] args) {
		 
	//Instanciando as contas e o usuario 
	ContaFisica cf1 = new ContaFisica("João Silva", "123.456.789-00", "Rua Brasil, 55", "joao@example.com");
	ContaJuridica cj1 = new ContaJuridica("Facens.", "12.345.678/0001-99", "Rua Chile, 789", "contato@xyz.com.br");
	Usuario func1 = new  Usuario("Carlos Pereira", "111.222.333-44", "Rua Espanha, 202", 3500.00);
	cf1.exibirInfo();  // Exibindo informações dos clientes
	cj1.exibirInfo();  // Exibindo informações dos clientes
	func1.exibirInfo();// Exibindo informações dos funcionários
	  

	}

}
