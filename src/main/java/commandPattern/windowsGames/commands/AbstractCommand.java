package commandPattern.windowsGames.commands;

import commandPattern.windowsGames.game.AbstractGUI;

public abstract class AbstractCommand {

	protected AbstractGUI gameGUI = null;

	public AbstractCommand(AbstractGUI gameGUI) {
		this.gameGUI = gameGUI;
	}
}
