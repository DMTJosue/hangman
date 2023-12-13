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
	        wordHints.put("soleil", "Astre du jour");
	        wordHints.put("chat", "Animal domestique");
	        wordHints.put("pizza", "Plat italien");
	        wordHints.put("ordinateur", "Appareil électronique");
	        wordHints.put("foret", "Ensemble d'arbres");
	        wordHints.put("chanson", "Composition musicale");
	        wordHints.put("voyage", "Déplacement lointain");
	        wordHints.put("cle", "Outil d'ouverture");
	        wordHints.put("plage", "Bord de mer");
	        wordHints.put("livre", "Volume imprimé");
	        wordHints.put("avion", "Moyen de transport aérien");
	        wordHints.put("football", "Sport collectif");
	        wordHints.put("etoile", "Astre lumineux");
	        wordHints.put("rose", "Fleur parfumée");
	        wordHints.put("montagne", "Élévation naturelle");
	        wordHints.put("film", "Œuvre cinématographique");
	        wordHints.put("ecole", "Institution éducative");
	        wordHints.put("clavier", "Dispositif d'entrée");
	        wordHints.put("fete", "Célébration joyeuse");
	        wordHints.put("chocolat", "Douceur sucrée");
	        wordHints.put("velo", "Deux-roues");
	        wordHints.put("musique", "Art sonore");
	        wordHints.put("jardin", "Espace végétal");
	        wordHints.put("bouteille", "Récipient liquide");
	        wordHints.put("etoile", "Astre lumineux");
	        wordHints.put("photo", "Image fixe");
	        wordHints.put("cœur", "Organe vital");
	        wordHints.put("telephone", "Appareil de communication");
	        wordHints.put("ciel", "Espace atmosphérique");
	        wordHints.put("cuisine", "Art culinaire");
	        wordHints.put("cheval", "Animal équin");
	        wordHints.put("carte", "Représentation géographique");
	        wordHints.put("piano", "Instrument musical");
	        wordHints.put("nuit", "Période obscurcie");
	        wordHints.put("danse", "Expression corporelle");
	        wordHints.put("arbre", "Organisme végétal");
	        wordHints.put("train", "Moyen de transport ferroviaire");
	        wordHints.put("arcade", "Construction architecturale");
	        wordHints.put("sourire", "Expression faciale joyeuse");
	        wordHints.put("pluie", "Précipitation liquide");
	        wordHints.put("lune", "Satellite naturel");
	        wordHints.put("reve", "Phénomène onirique");
	        wordHints.put("theatre", "Scène artistique");
	        wordHints.put("horloge", "Instrument de mesure du temps");
	        wordHints.put("etoile", "Astre lumineux");
	        wordHints.put("guitare", "Instrument à cordes");
	        wordHints.put("cadeau", "Présent offert");
	        wordHints.put("fleur", "Plante florale");
	        wordHints.put("ocean", "Étendue marine");
	        wordHints.put("ecran", "Surface visuelle");
	        wordHints.put("silence", "Absence de bruit");
	        wordHints.put("fruit", "Produit comestible");
	        wordHints.put("sable", "Particules minérales");
	        wordHints.put("voiture", "Moyen de transport routier");
	        wordHints.put("papillon", "Insecte ailé");
	        wordHints.put("argent", "Monnaie");
	        wordHints.put("coucher de soleil", "Fin du jour");
	        wordHints.put("rivieres", "Cours d'eau");
	        wordHints.put("mot", "Unité linguistique");
	        
		    
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
