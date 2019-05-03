package controller;
import java.util.ArrayList;

import model.Reminder;
import view.TimeFrame;

public class TimerController
{
	public static boolean check = false;
	public static ArrayList<String> words = new ArrayList<String>();
	private TimeFrame appFrame;
	public TimerController()
	{
		appFrame = new TimeFrame(this);
	}
	public void start()
	{
		for (int i = 2; i <= 10; i = i + 2)
		{
			new Reminder(i);
			System.out.println("Hamburger");
		}
		

	}
}
