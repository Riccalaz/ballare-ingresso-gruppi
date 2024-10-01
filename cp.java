package discotecag;

public class cp {
	private int c;
	
	public cp() {
		c=0;
	}
	
	public synchronized void entra(int n){
		c+=n;
	}

	public synchronized void esce(int n) {
		c-=n;
	}
	public int getc() {
		return c;
	}
}
