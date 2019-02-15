package model;

import java.util.Timer;
import java.util.TimerTask;

public class RemindTask extends TimerTask
{
	private Timer timer;
	
	public RemindTask(Timer timer)
	{
		super();
		this.timer = timer;
	}
	
	public void run()
	{
		System.out.println("end");
		timer.cancel();
	}
}
