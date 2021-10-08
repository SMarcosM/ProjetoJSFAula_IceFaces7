package U2S3;
import java.util.Timer;

public class RepetidorTimer {
	private Timer timer;
	private RepetidorTimeTarefa tarefa;
	private int pausa;

	public RepetidorTimer()
	{
	
	timer = new Timer();
	pausa = 1000;
	tarefa = new RepetidorTimeTarefa("arquivoDados.txt");
	timer.schedule(tarefa, 0, pausa);
	}

	public static void main(String[] args) {
		RepetidorTimer rt = new RepetidorTimer();
	}

}
