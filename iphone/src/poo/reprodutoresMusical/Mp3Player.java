package poo.reprodutoresMusical;

public class Mp3Player implements ReprodutorMusical {

	public void tocar() {
		System.out.println("Tocando no aparelho MP3!");
	}
	public void pausar() {
		System.out.println("Apertando no botão do meio, Pausar!");
	}
	public void selecionarMusica() {
		System.out.println("Mexendo nas setas mudo as músicas");
	}

}
