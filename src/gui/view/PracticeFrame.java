package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;


public class PracticeFrame extends JFrame
{
	private GUIController appController;
	private PracticePanel appPanel;
	
	public PracticeFrame(GUIController appController) //constructor
	{
		super();
		
		this.appController = appController;
		this.appPanel = new PracticePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		
		this.setSize(800, 900);
		this.setTitle("Practice GUI");
		this.setResizable(true);
		this.setVisible(true);
	}

}
