package br.com.cariocadev.ProjetoMatrix;

import java.math.BigDecimal;

public class AvaliadorAluno {

	public BigDecimal getMaiorNota(BigDecimal[] notas) {
		BigDecimal mnota = new BigDecimal(0);
		if(notas == null)
			throw new IllegalArgumentException();
		for(int cont=0; cont<= 3; cont ++) {
			if (notas[cont].compareTo(mnota) == 1)
				mnota = notas[cont];
			}
			return mnota.setScale(2);
		
		
	}

	public BigDecimal getMedia(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		BigDecimal Media = new BigDecimal("0.0");

		
		if((nota1!=null && nota2!=null && nota3 != null) &&
		   (nota1.compareTo(new BigDecimal("0"))>0 && nota2.compareTo(new BigDecimal("0"))>0 && nota3.compareTo(new BigDecimal("0"))>0) &&
		   (nota1.compareTo(new BigDecimal("10"))<=0 && nota2.compareTo(new BigDecimal("10"))<=0 && nota3.compareTo(new BigDecimal("10"))<=0))
		{
			
			Media = nota1.add(nota2).add(nota3).divide(new BigDecimal("3"),2, BigDecimal.ROUND_HALF_UP);
						
			return Media.setScale(2);
	     }
		else {
			
			throw new IllegalArgumentException();
		}
	
		
		
		
			
	}

	public String getStatus(BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
		String mensagem;
		BigDecimal media = getMedia(nota1, nota2, nota3);
		
		
		
		if((nota1 !=null && nota2 !=null && nota3 != null) &&
		(nota1.compareTo(new BigDecimal("0"))>0 && nota2.compareTo(new BigDecimal("0"))>0 && nota3.compareTo(new BigDecimal("0"))>0) &&
		(nota1.compareTo(new BigDecimal("10"))<=0 && nota2.compareTo(new BigDecimal("10"))<=0 && nota3.compareTo(new BigDecimal("10"))<=0)) 
		 {
			if(media.compareTo(new BigDecimal("6"))>=1) {
				mensagem="APROVADO";       }
		       else
		    	   if(media.compareTo(new BigDecimal("4"))>=0) {
		   		mensagem="PROVA_FINAL";       }
		       
		       else 
		    	   mensagem="REPROVADO";    
			
			
			   return mensagem;
		 }
		
		throw new IllegalArgumentException();
	
		
	}
		
}
		
		
		
	
	
	


