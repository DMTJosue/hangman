package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lettre {
	// déclaration de l'attribut wordHints , un dictionnaire ayant pour clé le mot à deviner et valeur son indice
	private Map <String, String> wordHints;
    
	// Constructeur sans paramètre Initialisant  la classe Lettre en ajoutant des mots avec leurs indices correspondants
	 public Lettre() {
		 
		    wordHints = new HashMap<>();
		    // Add each word with its index here
		    wordHints.put("paris", "Capitale française");
	        wordHints.put("eiffel", "Tour emblématique");
	        wordHints.put("louvre", "Musée célèbre");
		    
		}

	 // Méthode qui un mot au hasard
	 public String getRandomWord() {
		    Random random = new Random();
		    int randomIndex = random.nextInt(wordHints.size());
		    return wordHints.keySet().toArray(new String[0])[randomIndex].toUpperCase();
		}
     
	// Méthode qui retourne l'indice associé au mot
     public String generateHint(String word) {
    	    
    	    return wordHints.get(word.toLowerCase());
     }
}
