package gui.controller;

import gui.model.Gnome;
import gui.view.PracticeFrame;
import gui.view.PracticePanel;

public class GUIController 
{
	private Gnome gerome;
	private PracticeFrame appFrame;
	
	public GUIController()
	
	{
		gerome = new Gnome();
		
		appFrame = new PracticeFrame(this);
	}

	public void start()
	{
		
	}
}
