package U2S3;

public class Contador {
	private int quantidadeAlunosCurso;

	public synchronized void incrementa() {
		quantidadeAlunosCurso++;
	}

	public synchronized void decrementa() {
		quantidadeAlunosCurso--;
	}
}
