package model;

import java.util.Timer;
import java.util.TimerTask;

import controller.TimerController;

import java.util.ArrayList;

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
		if (TimerController.check == true)
		{
			TimerController.words.add("yes");
			System.out.println("\n");
			TimerController.check = false;
		}
		else
		{
			TimerController.words.add("no");
			System.out.println(0);
		}
		timer.cancel();
		for (String word : TimerController.words)
		{
			System.out.println(word);
		}
	}
}
