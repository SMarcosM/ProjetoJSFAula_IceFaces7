package U2S3;

import java.io.*;
import java.util.TimerTask;

public class RepetidorTimeTarefa extends TimerTask {

	private String arquivo;

	public RepetidorTimeTarefa(String parquivo) {
		this.arquivo = parquivo;
	}

	public void run() {
		System.out.println("Buscando arquivo.");
		try {

			File f = new File(arquivo);
			System.out.println("Arquivo encontrado.");
			if (f.exists() == true) {
				String line = null;
				FileReader fileReader = new FileReader(f);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}