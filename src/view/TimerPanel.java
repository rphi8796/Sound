package view;

import controller.TimerController;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class TimerPanel extends JPanel
{
	private TimerController app;
	private SpringLayout appLayout;
	private JButton trueButton;
	
	public TimerPanel(TimerController app)
	{
		super();
		
		this.app = app;
		appLayout = new SpringLayout();
		trueButton = new JButton("True");
		appLayout.putConstraint(SpringLayout.NORTH, trueButton, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, trueButton, 120, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, trueButton, -112, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, trueButton, 310, SpringLayout.WEST, this);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupListeners()
	{
		trueButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				TimerController.check = true;
			}
		});
		
	}

	private void setupLayout()
	{
		
	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(trueButton);
	}
}
