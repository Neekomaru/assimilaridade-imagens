package br.com.assimilaridade.imagens.main;

import java.io.IOException;

import br.com.assimilaridade.imagens.classe.CompararImagens;

public class Main {

	public static void main(String[] args) throws IOException {
		CompararImagens ci = new CompararImagens();
		String caminho = "\\\\batutas\\usuario$\\4381\\Documents\\My Pictures\\img\\Nova pasta (2)";
		//String caminho2 = "\\\\batutas\\usuario$\\4381\\Documents\\My Pictures\\img\\Nova pasta";
		ci.compararImg(caminho);

	}

}
