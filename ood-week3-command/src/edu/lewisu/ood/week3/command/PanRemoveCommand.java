package edu.lewisu.ood.week3.command;

public class PanRemoveCommand implements Command {
	
	PanRemover panRemover;
	
	public PanRemoveCommand (PanRemover panRemover) {
		this.panRemover = panRemover;
	}
	
	public void execute() {
		panRemover.removePan();
	}
}
