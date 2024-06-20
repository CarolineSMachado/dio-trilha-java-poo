package apples;

import poo.aparelhosTelefonicos.AparelhoTelefonico;
import poo.navegadoresDeInternet.NavegadorDeInternet;
import poo.reprodutoresMusical.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico{

	public void exibirPagina() {
		System.out.println("Exibindo os dados da página.");
	}
	public void adicionarNovaAba() {
		System.out.println("Apertar no botão com '+' na parte superior do navegador.");
	}
	public void atualizarPagina() {
		System.out.println("Apertar 'F5' ou no icone de recarregar página.");
	}


	public void tocar() {
		System.out.println("Apertar no icone 'tocar' na tela no IPhone.");
	}
	public void pausar() {
		System.out.println("Apertar no icone 'pausar' na tela no IPhone: || ");	
	}
	public void selecionarMusica() {
		System.out.println("Subir e descer a tela e precionar na música desejada.");
	}


	public void ligar() {
		System.out.println("Clicar no icone de telefone.");
	}
	public void atender() {
		System.out.println("Clicar no icone verde para atender.");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando o correio de voz.");
	}

}
