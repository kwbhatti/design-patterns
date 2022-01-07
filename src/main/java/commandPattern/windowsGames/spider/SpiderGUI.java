package commandPattern.windowsGames.spider;

import commandPattern.windowsGames.game.AbstractGUI;

public class SpiderGUI extends AbstractGUI {

	public void showNewCard() {
		System.out.println("showing 3 new card");
	}
	
	public void undoNewCard() {
		System.out.println("undo not allowed");
	}
	
}
