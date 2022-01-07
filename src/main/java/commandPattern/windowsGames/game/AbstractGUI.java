package commandPattern.windowsGames.game;

public abstract class AbstractGUI {

	public void moveCard(String from, String to) {
		System.out.println("card moved from " + from  + " to " + to);
	}
	
	public abstract void showNewCard();
	
	public abstract void undoNewCard();

}
