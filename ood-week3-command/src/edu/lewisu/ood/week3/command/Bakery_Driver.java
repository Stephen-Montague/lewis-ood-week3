package edu.lewisu.ood.week3.command;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 3 - Command
 *
 * Summary:
 *     Demonstrates a Command Pattern using a baking theme.
 *     Slightly mods remote-control themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 *
 * Program Notes:
 *     Uses the Command Pattern to control a kitchen appliance 
 *     that fills a pan with batter, heats the pan, then removes the pan.
 *     Current output:
 *         Injecting batter into pan
 *         Heating pan
 *         Removing pan 
 */

public class Bakery_Driver {
    // Driver to test command objects.

    public static void main(String args[]) {
    	ApplianceControl applianceControl = new ApplianceControl();

    	PanFiller panFiller = new PanFiller();
    	PanHeater panHeater = new PanHeater();
    	PanRemover panRemover = new PanRemover();
    	
    	PanFillCommand panFillCommand = new PanFillCommand(panFiller);
    	PanHeatCommand panHeatCommand = new PanHeatCommand(panHeater);
    	PanRemoveCommand panRemoveCommand = new PanRemoveCommand(panRemover);
    	
    	applianceControl.setCommand(panFillCommand);
    	applianceControl.pressButton();
    	
    	applianceControl.setCommand(panHeatCommand);
    	applianceControl.pressButton();
    	
    	applianceControl.setCommand(panRemoveCommand);
    	applianceControl.pressButton();
        }
}

