package view;

import javax.swing.JFrame;
import controller.TimerController;

public class TimeFrame extends JFrame
{
	private TimerController appController;
	private TimePanel appPanel;
	
	public TimeFrame(TimerController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new TimePanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle("Chat GUI");
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
