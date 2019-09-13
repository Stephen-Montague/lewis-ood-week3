package edu.lewisu.ood.week3.command;

public class ApplianceControl {
	Command option;
	
	public void setCommand(Command command) {
		option = command;
	}
	
	public void pressButton() {
		option.execute();
	}
}
