package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticePanel extends JPanel
{
	private GUIController appController;
	private JLabel firstLabel;
	private JButton firstButton;
	private JButton otherButton;
	private JButton redButton;
	private SpringLayout appLayout;
	
	public PracticePanel(GUIController appController)
	{
		super(); 
		
		this.appController = appController;
		
		firstLabel = new JLabel("I'm late I'm late");
		firstButton = new JButton("Drink me");
		otherButton = new JButton("Queen of Hearts");
		redButton = new JButton("Painting Roses Red");
		appLayout = new SpringLayout();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void changeBackgroundRandom()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
	private void changeBackgroundRed()
	{
		this.setBackground(new Color(80, 20, 35));
	}
	
	private void setupPanel() //installs components to the panel
	{
		this.setLayout(appLayout);
		this.add(firstButton);
		this.add(firstLabel);
		this.add(otherButton);
		this.add(redButton);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, otherButton, 0, SpringLayout.NORTH, firstButton);
		appLayout.putConstraint(SpringLayout.EAST, otherButton, -6, SpringLayout.WEST, firstButton);
		
		appLayout.putConstraint(SpringLayout.NORTH, redButton, 0, SpringLayout.NORTH, firstButton);
		appLayout.putConstraint(SpringLayout.WEST, redButton, 0, SpringLayout.EAST, firstButton);
		
		appLayout.putConstraint(SpringLayout.SOUTH, firstLabel, -27, SpringLayout.NORTH, firstButton);
		appLayout.putConstraint(SpringLayout.EAST, firstLabel, 0, SpringLayout.EAST, firstButton);
		
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 175, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, -135, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundRandom();
			}
		} );
		redButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeBackgroundRed();
			}
		});
		otherButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				
			}
		} );
	}//end of setupListeners
	
}
