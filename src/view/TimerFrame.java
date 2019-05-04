package view;

import javax.swing.JFrame;
import controller.TimerController;

public class TimerFrame extends JFrame
{
	private TimerController appController;
	private TimerPanel appPanel;
	
	public TimerFrame(TimerController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new TimerPanel(appController);
		
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
