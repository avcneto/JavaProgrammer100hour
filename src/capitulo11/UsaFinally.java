package capitulo11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UsaFinally {
	public static void abrirArquivo() throws IOException {
		File file = null;
		InputStream is = null;
		try {
			file = new File("Arquivo.txt");
			is = new FileInputStream(file);
		} catch (Exception e) {
			// tratamento
		} finally {
			is.close();
		}
	}

}
