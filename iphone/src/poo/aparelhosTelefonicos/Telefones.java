package poo.aparelhosTelefonicos;

public class Telefones implements AparelhoTelefonico{

	public void ligar() {
		System.out.println("Girar o número escolhido no discador até o final.");
	}
	public void atender() {
		System.out.println("Campainha toca...Pegar o telefone do gancho.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Quer deixar uma mensagem na caixa postal?");
	}

}
