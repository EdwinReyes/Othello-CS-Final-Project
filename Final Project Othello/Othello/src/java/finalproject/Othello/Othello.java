package java.finalproject.Othello;

import java.awt.Canvas;



public class Othello extends Canvas implements Runnable
{
	
	private static final long serialVersionUID = 1273281369632494595L;

	public static final int WIDTH = 1280, HEIGHT = 720;
	
	public Othello()
	{
		new Menu(WIDTH, HEIGHT, "Othello", this);
	}
	
	public synchronized void start()
	{
		
	}
	
	public void run()
	{
	
	}

	public static void main(String args[])
	{
		new Othello();
	}
}
