package controller;
import java.util.ArrayList;

import model.Reminder;
import view.TimerFrame;

public class TimerController
{
	public static boolean check = false;
	public static ArrayList<String> words = new ArrayList<String>();
	private TimerFrame appFrame;
	public TimerController()
	{
		appFrame = new TimerFrame(this);
	}
	public void start()
	{
		for (int i = 2; i <= 10; i = i + 2)
		{
			new Reminder(i);
		}
	}
}
