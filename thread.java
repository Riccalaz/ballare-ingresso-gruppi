package discotecag;

import java.util.Random;

public class thread extends Thread{
	private cp contatore;
	private int npersone;  //numero di persone per gruppo
	
	public thread(cp c){
		contatore=c;
		
		Random ran = new Random();
		
		npersone=ran.nextInt(10)+1; //genero casulamento il numero di persone di un gruppi
	}
	
	public void run() {
		
		Random ran = new Random();
		System.out.println("persone nel gruppo: "+npersone); //stampo a schermo la prima volta il numero di persone presenti in un gruppi
		
		while(true) {
			contatore.entra(npersone);
			try {
				Thread.sleep(ran.nextInt(1000)+100);  //attendo un numero casuale di millisecondi
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contatore.esce(npersone);
			try {
				Thread.sleep(ran.nextInt(1000)+100); //attendo un numero casuale di millisecondi
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
