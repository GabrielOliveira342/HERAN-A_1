
public class Usuario {

	private String nome;
	private String cpf; 
	private String endereço;
	private double salario;


public Usuario (String nome,String cpf, String endereço, double salario) {
	this.nome = nome;
	this.cpf = cpf;
	this.endereço = endereço;
	this.salario = salario;
}
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getEndereco() {
    return endereço;
}

public void setEndereco(String endereco) {
    this.endereço = endereco;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}
public void exibirInfo() {
    System.out.println("Funcionário:");
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Endereço: " + endereço);
    System.out.printf("Salário: R$ %.2f\n", salario);
    System.out.println("---------------------------");
}
}
