package commandPattern.windowsGames.commands;

import commandPattern.windowsGames.game.AbstractGUI;

public class DragCommand extends AbstractCommand implements ICommand {

	private String from = null;
	private String to = null;
	
	public DragCommand(AbstractGUI gameGUI, String from, String to) {
		super(gameGUI);
		this.from = from;
		this.to = to;
	}
	
	@Override
	public void execute() {
		this.gameGUI.moveCard(from, to);
	}

	@Override
	public void undo() {
		this.gameGUI.moveCard(to, from);
	}

}
