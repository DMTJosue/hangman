package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lettre {
	 private ArrayList<String> words;
     


	 public Lettre() {
		    words = new ArrayList<>(Arrays.asList(
		    		"Paris", "Eiffel", "Louvre", "Baguette", "Croissant", "Bastille", "Champagne",
		            "Camembert", "Provence", "Côte", "Riviera", "Montmartre", "ChampsÉlysées",
		            "Bordeaux", "Normandie", "Alsace", "Versailles", "Marseillaise", "Touraine",
		            "Roquefort", "France", "French", "ArcDeTriomphe", "Napoleon", "Monet", "Renoir",
		            "Cezanne", "Chanel", "Moliere", "Voltaire", "Lafayette", "Citroen", "Renault",
		            "Airbus", "Concorde", "Biarritz", "Nantes", "Nice", "Lyon", "Marseille",
		            "Toulouse", "Strasbourg", "Bretagne", "BastilleDay", "Boulangerie", "Patisserie",
		            "AlsaceLorraine", "Lourdes", "LoireValley", "AixEnProvence", "FrenchRiviera",
		            "NormandyBeaches", "Dordogne", "CannesFilmFestival", "ProvencalMarket",
		            "LavenderFields", "FrenchAlps", "MonaLisa", "ViveLaFrance", "ViveLaRépublique",
		            "LibertéÉgalitéFraternité", "Citroen2CV", "ChampsDeMars", "SaintMichel",
		            "OperaGarnier", "SaintGermainDesPrés", "Sorbonne", "Panthéon", "SainteChapelle",
		            "Trianon", "ChateauDeChambord", "ChateauDeChenonceau", "ChateauDeVersailles",
		            "FleurDeLis", "GaleriesLafayette", "LeMans", "Giverny", "Degas", "Rodin", "Seurat"
		    ));
		}


     public String getRandomWord(){
             return words.get(new Random().nextInt(words.size())).toUpperCase();
     }
}
