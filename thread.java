package discotecag;

import java.util.Random;

public class thread extends Thread{
	private cp contatore;
	private int npersone;
	
	public thread(cp c){
		contatore=c;
		
		Random ran = new Random();
		
		npersone=ran.nextInt(10)+1;
	}
	
	public void run() {
		
		Random ran = new Random();
		System.out.println("persone nel gruppo: "+npersone);
		
		while(true) {
			contatore.entra(npersone);
			try {
				Thread.sleep(ran.nextInt(1000)+100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contatore.esce(npersone);
			try {
				Thread.sleep(ran.nextInt(1000)+100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
