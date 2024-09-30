//class conta 
public class Conta {
//atributos
	private String nome;
	private String endereço;
	private String email;
//construtores e os parametros	
public Conta (String nome, String endereço, String email) {
		this.nome = nome;
		this.endereço = endereço;
		this.email = email;
}
//getters e setters dos atributos
public String getNome (String nome) {
	return nome;
}
public void setNome (String nome) {
	this.nome = nome;
}
public String getEndereço (String endereço) {
	return endereço;
}
public void setEndereço (String endereço) {
	this.endereço = endereço;
}
public String getEmail (String email) {
	return email;
}
public void setEmail (String email) {
	this.email = email;
}
//metodo para exibir as infos 
public void exibirInfo() {
 
	System.out.println("Nome: " + nome);
    System.out.println("Endereço: " + endereço);
    System.out.println("Email: " + email);
}

}