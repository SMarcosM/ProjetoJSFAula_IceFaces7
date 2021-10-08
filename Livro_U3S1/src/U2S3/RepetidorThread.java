package U2S3;

public class RepetidorThread implements Runnable{

	private int pausa;
	private boolean executa;
	private Thread th;

	public RepetidorThread() {
		pausa = 1000;
		executa = true;
		th = new Thread(this);
		th.start();
	}

	public void run() {
		try {
			Thread.sleep(pausa);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (executa) {
			// faz o processamento
			try {
				Thread.sleep(pausa);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
