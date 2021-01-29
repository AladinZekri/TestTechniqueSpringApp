package com.pfe.testTechnique;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TextService {
	
	public int countPunctuation(String text)
	{
		
		int k = 0 ;
		List<Character> Symbols = new ArrayList<>(List.of('.',',',';',':','?','!')); // liste des caractéres de ponctuation
		
		
		for (char ch: text.toCharArray()) 	 // parcourir le texte 
		{
			if(Symbols.contains(ch))		
			{
			k+=1;							// incrémentation de k lorsque le caractére appartient à la liste
			}
		}
		return k;
	}

	
}
