package br.com.assimilaridade.imagens.main;

import java.io.IOException;

import br.com.assimilaridade.imagens.classe.CompararImagens;

public class Main {

	public static void main(String[] args) throws IOException {
		CompararImagens ci = new CompararImagens();
		String caminho = "Sua pasta com as imagens";
		ci.compararImg(caminho);

	}

}
