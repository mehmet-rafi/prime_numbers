import java.util.LinkedList;
import java.util.Queue;


public class Prime extends Thread {

	private int a;
	private int b;
	private String thread;
	public Prime(int a,int b, String thread)
	{
		this.a = a;
		this.b = b;
		this.thread = thread;
		
	}
	
	public void run()
	{
		Queue<Integer> queue = new LinkedList<Integer>(); 
		
		int ustsinir = b;
		for(int i=a; i<ustsinir; i++)
		{
			if(isPrime(i))
			{
				queue.add(i);
			}
		}
		
		
		while(!queue.isEmpty())
		{
			System.out.println(queue.remove() + thread);
		}
	}
		
	
	public static boolean isPrime(int a)
	{
		int sayac = 0;
		for(int i=2; i<a; i++)
		{	
			if(a%i==0)
			{
				sayac++;
				
			}
				
		}
		
		if(sayac==0)
		{
			return true;
		}else{
			return false;
		}
	}
	
}

