package commandPattern.windowsGames.spider;

import java.util.ArrayList;
import java.util.List;

import commandPattern.windowsGames.commands.DragCommand;
import commandPattern.windowsGames.commands.ICommand;
import commandPattern.windowsGames.commands.NewCardCommand;
import commandPattern.windowsGames.game.AbstractGame;

public class SpiderGame extends AbstractGame {

	SpiderGUI gameGUI = new SpiderGUI();
	List<ICommand> commands = new ArrayList<ICommand>();
	int lastCommandIndex = commands.size() -1;
	
	private void executeCommand(ICommand command) {
		command.execute();
		commands.add(command);
		lastCommandIndex++;
	}
	
	public void moveCard(String from, String to) {
		ICommand command = new DragCommand(gameGUI, from, to);
		executeCommand(command);
	}
	
	public void newCard() {
		ICommand command = new NewCardCommand(gameGUI);
		executeCommand(command);
	}
	
	public void undo() {
		if (lastCommandIndex > -1) {
			commands.get(commands.size() -1).undo();
			commands.remove(lastCommandIndex);
			lastCommandIndex--;
		}
	}
}
