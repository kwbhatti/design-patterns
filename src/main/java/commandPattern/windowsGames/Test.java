package commandPattern.windowsGames;

import commandPattern.windowsGames.solitaire.SolitaireGame;
import commandPattern.windowsGames.spider.SpiderGame;

public class Test {

	public static void main(String[] args) {

		SolitaireGame solitaireGame = new SolitaireGame();
		solitaireGame.moveCard("1", "2");
		solitaireGame.moveCard("3", "5");
		solitaireGame.newCard();
		solitaireGame.moveCard("4", "5");
		solitaireGame.moveCard("3", "7");
		solitaireGame.undo();
		solitaireGame.undo();
		solitaireGame.newCard();
		solitaireGame.moveCard("3", "5");
		solitaireGame.moveCard("9", "5");
		solitaireGame.undo();
		solitaireGame.undo();
		solitaireGame.newCard();
		solitaireGame.undo();
		solitaireGame.newCard();
		solitaireGame.newCard();
		solitaireGame.newCard();
		solitaireGame.undo();
		
		SpiderGame spiderGame = new SpiderGame();
		spiderGame.moveCard("1", "2");
		spiderGame.moveCard("3", "5");
		spiderGame.newCard();
		spiderGame.moveCard("4", "5");
		spiderGame.moveCard("3", "7");
		spiderGame.undo();
		spiderGame.undo();
		spiderGame.newCard();
		spiderGame.moveCard("3", "5");
		spiderGame.moveCard("9", "5");
		spiderGame.undo();
		spiderGame.undo();
		spiderGame.newCard();
		spiderGame.undo();
		spiderGame.newCard();
		spiderGame.newCard();
		spiderGame.newCard();
		spiderGame.undo();
	}

}
