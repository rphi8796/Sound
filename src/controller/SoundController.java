package controller;
import model.Reminder;

public class SoundController
{
	public void start()
	{
		new Reminder(5);
		System.out.println("start");
	}
}
