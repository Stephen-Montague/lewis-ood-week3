package edu.lewisu.ood.week3.command;

public class PanHeatCommand implements Command {
	
	PanHeater oven;
	
	public PanHeatCommand(PanHeater panHeater) {
		this.oven = panHeater;
	}

	public void execute() {
		oven.heatPan();
	}
}
