import java.util.concurrent.TimeUnit;
import java.util.LinkedList;
import java.util.Queue;

public class asalsayilar extends Thread {

	/**
	 * @param args
	 */
	static long startTime = System.nanoTime();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sinir = 10000;
		int threadSayisi = 5;
		
		int i = 1;
		int a = 2;
		int b=0;
		String t="thread";
		
		while(i<=threadSayisi)
		{	
			int c = (int)sinir / threadSayisi;
			b +=c;
			Prime p = new Prime(a,b,t);
			p.start();
			t = "thread" + Integer.toString(i);
			a+=c;
			i++;
		}
		
		
		
	long estimatedTime = System.nanoTime() - startTime;
	estimatedTime = TimeUnit.MILLISECONDS.convert(estimatedTime, TimeUnit.NANOSECONDS);
	System.out.println("Elapsed Time:" + " " + estimatedTime + "ms");
	

}

public static void Prime(double sinir)
{
	Queue<Integer> queue = new LinkedList<Integer>(); 
	
	int ustsinir = 10000;
	for(int i=2; i<ustsinir; i++)
	{
		if(isPrime(i))
		{
			queue.add(i);
		}
	}
	
	
	while(!queue.isEmpty())
	{
		System.out.println(queue.remove());
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