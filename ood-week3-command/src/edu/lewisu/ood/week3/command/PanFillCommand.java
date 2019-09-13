package edu.lewisu.ood.week3.command;

public class PanFillCommand implements Command {
	
	PanFiller batterInjector;
	
	public PanFillCommand(PanFiller panFiller) {
		this.batterInjector = panFiller;
	}

	public void execute() {
		batterInjector.fillPan();
	}
}
