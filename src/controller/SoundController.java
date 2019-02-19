package controller;
import model.Reminder;

public class SoundController
{
	public void start()
	{
		for (int i = 2; i <= 20; i = i + 2)
		{
			new Reminder(i);
			System.out.println("start");
		}
	}
}
