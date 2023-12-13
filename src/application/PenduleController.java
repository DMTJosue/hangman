package application;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class PenduleController {
	// Attributs
	
	 @FXML
	    private Pane man;
	    @FXML
	    private Pane base1;
	    @FXML
	    private Pane base2;
	    @FXML
	    private Pane base3;
	    @FXML
	    private Pane pole;
	    @FXML
	    private Pane rod;
	    @FXML
	    private Pane rope1;
	    @FXML
	    private Pane rope2;
	    @FXML
	    private Text text;
	    @FXML
	    private Text hintWord;
	    @FXML
	    private Pane buttons;
	    @FXML
	    private Text winStatus;
	    @FXML
	    private Text realWord;

	    private int mistakes;
	    private int correct;
	    private Lettre word = new Lettre();
	    private String myWord;
	    private List<String> myLetters;
	    private List<String> answer;
	    

	    public PenduleController() throws FileNotFoundException {
	    }

	    public void initialize() {
	        // Initialise l'état du jeu (éléments du pendu, compteurs, etc.)
	        base1.setVisible(false);
	        base2.setVisible(false);
	        base3.setVisible(false);
	        pole.setVisible(false);
	        rod.setVisible(false);
	        rope1.setVisible(false);
	        rope2.setVisible(false);
	        man.setVisible(false);

	        // Réinitialise les compteurs d'erreurs et de lettres correctement trouvées
	        mistakes = 0;
	        correct = 0;

	        // Sélectionne un mot aléatoire
	        myWord = word.getRandomWord();

	        // Génère un indice pour le mot sélectionné
	        String wordHint = word.generateHint(myWord);

	        // Affiche l'indice du mot
	        hintWord.setText("🤔 " + wordHint);

	        // Divise le mot en lettres et initialise la liste des lettres du mot
	        myLetters = Arrays.asList(myWord.split(""));

	        // Initialise la liste de la réponse, alternant des underscores et des espaces
	        answer = Arrays.asList(new String[myLetters.size() * 2]);
	        for (int i = 0; i < myLetters.size() * 2; i++) {
	            if (i % 2 == 0) {
	                answer.set(i, "_");  // Lettre non découverte (underscore)
	            } else {
	                answer.set(i, " ");  // Espace entre les lettres
	            }
	        }

	        // Affiche la réponse initiale (underscore et espaces)
	        String res = String.join("", answer);
	        text.setText(res);

	        // Réinitialise les messages de statut
	        winStatus.setText("");
	        realWord.setText("");

	        // Active les boutons de lettres
	        buttons.setDisable(false);
	    }
	    
	    
	    // Méthode qui gère le mot que l'utilisateur tape
	    
	    public void onClick(ActionEvent event) {
	        // Récupère la lettre choisie par l'utilisateur
	        String letter = ((Button) event.getSource()).getText();
	        
	        // Désactive le bouton correspondant à la lettre choisie
	        ((Button) event.getSource()).setDisable(true);

	        // Vérifie si la lettre est présente dans le mot
	        if (myLetters.contains(letter)) {
	            int occurrences = 0;

	            // Parcourt toutes les occurrences de la lettre dans le mot
	            for (int index = 0; index < myLetters.size(); index++) {
	                if (myLetters.get(index).equals(letter)) {
	                    occurrences++;
	                    // Met à jour la réponse avec la lettre à l'index trouvé
	                    answer.set(index * 2, letter);
	                }
	            }

	            // Incrémente le nombre de lettres correctement trouvées
	            correct += occurrences;

	            // Met à jour l'affichage du mot partiellement découvert
	            String res = String.join("", answer);
	            text.setText(res);
	   
	            // Vérifie si toutes les lettres ont été trouvées
	            if (correct == myLetters.size()) {
	                winStatus.setText("You Win!");
	                buttons.setDisable(true);
	                newGame();
	            }
	        } else {
	            // La lettre choisie n'est pas dans le mot, incrémenter le nombre d'erreurs
	            mistakes++;

	            // Affiche les éléments du pendu en fonction du nombre d'erreurs
	            if (mistakes == 1) base1.setVisible(true);
	            else if (mistakes == 2) base2.setVisible(true);
	            else if (mistakes == 3) base3.setVisible(true);
	            else if (mistakes == 4) pole.setVisible(true);
	            else if (mistakes == 5) rod.setVisible(true);
	            else if (mistakes == 6) rope1.setVisible(true);
	            else if (mistakes == 7) rope2.setVisible(true);
	            else if (mistakes == 8) {
	                rope2.setVisible(false);
	                man.setVisible(true);
	                winStatus.setText("Perdu!");
	                realWord.setText("💡 " + myWord);
	                buttons.setDisable(true);
	            }
	        }
	    }
	    
	    // Méthode qui créer un nouveau jeu
	    public void newGame(){
	        for(int i=0; i<26; i++){
	            buttons.getChildren().get(i).setDisable(false);
	        }
	        initialize();
	    }
}
