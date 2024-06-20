package poo.reprodutoresMusical;

public class Radio implements ReprodutorMusical {

	public void tocar() {
		System.out.println("Ligando o aparelho... 'Tocando da 93.7, música de qualidade...'");
	}
	public void pausar() {
		System.out.println("Atividade realizada pela estação de rádio.");
	}
	public void selecionarMusica() {
		System.out.println("Ao girar o botão muda de estação.");
	}

}
