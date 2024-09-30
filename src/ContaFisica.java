//class fisica e extends da super class 
public class ContaFisica extends Conta {
//atributo 
	private String cpf; 
//construtores e os parametros 	
public ContaFisica (String nome, String endereço, String email,String cpf  ) {
	super (nome, endereço, email); //atributos da super class 
	this.cpf = cpf;
}
//gettres e setters dos atributos 
public String getCpf(){
	return cpf;
}
public void setCpf (String cpf ) {
	this.cpf = cpf;
}
// metodo para exibir as infos 
public void exibirInfo(){
	System.out.println("Pessoa Fisica: " );
    super.exibirInfo(); //exibindo da super class 
    System.out.println("CPF: " + cpf);
    System.out.println("---------------------");
}
}
