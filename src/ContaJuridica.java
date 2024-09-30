//class conta juruduca com o extends da super class 
public class ContaJuridica extends Conta {
//atributo da class 
	private String cnpj;
//contrutores e os parametros 
public ContaJuridica (String nome, String cnpj, String endereço, String email) {
	super(nome,endereço, email);
	this.cnpj = cnpj;	
}
//getters e setters dos atributos 
public String getCnpj() {
	return cnpj;
}
public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}
//metodo para exibir info
public void exibirInfo(){
	System.out.println("Pessoa Juridica: " );
    super.exibirInfo(); //exibindo da super class
    System.out.println("CPF: " + cnpj);
    System.out.println("---------------------");
}
}