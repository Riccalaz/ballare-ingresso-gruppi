package discotecag;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("inserisci n di gruppi: ");
		
		int T = myObj.nextInt();
		thread[] th=new thread[T];
		cp c=new cp();
		
		for(int i=0;i<T;i++){
			th[i]= new thread(c);
			th[i].start();
		}
		
		while(true) {
			System.out.println("persone in discoteca: "+ c.getc());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
