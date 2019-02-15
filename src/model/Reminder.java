package model;
import java.util.Timer;
import model.RemindTask;

public class Reminder
{
	Timer timer;
	public Reminder(int seconds)
	{
		timer = new Timer();
		timer.schedule(new RemindTask(timer), seconds*1000);
	}
}
	


