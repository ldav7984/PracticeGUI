package gui.controller;

import gui.model.Gnome;
import gui.view.PracticeFrame;
import gui.view.PracticePanel;

public class GUIController 
{
	private Gnome theGnome;
	private PracticeFrame appFrame;
	
	public GUIController()
	
	{
		theGnome = new Gnome();
		
		appFrame = new PracticeFrame(this);
	}

	public void start()
	{
		
	}
}
