package poo.aparelhosTelefonicos;

public class TelefonesCelulares implements AparelhoTelefonico{

	public void ligar() {
		System.out.println("Entrar na lista telefônica do celular");
	}
	public void atender() {
		System.out.println("Apertar no botão de atender que está no teclado.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Quer deixar uma mensagem na caixa postal?");
	}

}
