package commandPattern.windowsGames.commands;

import commandPattern.windowsGames.game.AbstractGUI;

public class NewCardCommand extends AbstractCommand implements ICommand {

	
	public NewCardCommand(AbstractGUI gameGUI) {
		super(gameGUI);
	}

	@Override
	public void execute() {
		this.gameGUI.showNewCard();
	}

	@Override
	public void undo() {
		this.gameGUI.undoNewCard();
	}

}
