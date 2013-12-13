package de.scrum_master.bdw;

public class Timer
{
	final private long startTime = System.currentTimeMillis();

	public String toString()
	{
		long t = System.currentTimeMillis() - startTime;
		return String.format(
			"%1d:%02d:%06.3f", t / 3600000, t % 3600000 / 60000,
			t % 60000 / 1000.0);
	}
}
