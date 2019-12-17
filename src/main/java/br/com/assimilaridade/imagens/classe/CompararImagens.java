package br.com.assimilaridade.imagens.classe;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CompararImagens {
		
	
	public void compararImg(String caminho) throws IOException {
	        final File folder = new File(caminho);
	        //final File folder2 = new File(caminho2);
	        listarImg(folder);
	}
	
	public void listarImg(final File folder) throws IOException {
			
		for (final File fileEntry : folder.listFiles()) {
			String nomeImg1 = fileEntry.getName();
			for(final File fileEntry2 : folder.listFiles()) {
				
				String nomeImg2 = fileEntry2.getName();
				if(!nomeImg1.contentEquals(nomeImg2)) {
					System.out.println("Comparando Imagens..."+ "(" + nomeImg1 +")" +" - "+ "(" + nomeImg2 + ")");
					if(compareImage(fileEntry,fileEntry2)) {
						System.out.println("Resultado: As imagens são iguais.");
						fileEntry2.delete();
					}else {
						System.out.println("Resultado: As imagens são diferentes.");
					}
				}
				
			}
		}
	}
	
	public static boolean compareImage(File fileA, File fileB) {        
	    try {
	        // take buffer data from botm image files //
	        BufferedImage biA = ImageIO.read(fileA);
	        DataBuffer dbA = biA.getData().getDataBuffer();
	        int sizeA = dbA.getSize();                      
	        BufferedImage biB = ImageIO.read(fileB);
	        DataBuffer dbB = biB.getData().getDataBuffer();
	        int sizeB = dbB.getSize();
	        // compare data-buffer objects //
	        if(sizeA == sizeB) {
	            for(int i=0; i<sizeA; i++) { 
	                if(dbA.getElem(i) != dbB.getElem(i)) {
	                    return false;
	                }
	            }
	            return true;
	        }
	        else {
	            return false;
	        }
	    } 
	    catch (Exception e) { 
	        System.out.println("Falha ao comparar imagens ...");
	        return  false;
	    }
	}
	
}
