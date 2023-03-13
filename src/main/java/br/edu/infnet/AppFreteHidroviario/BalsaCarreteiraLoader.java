/*package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.service.BalsaCarreteiraService;

@Component
public class BalsaCarreteiraLoader implements ApplicationRunner {

	@Autowired
	private BalsaCarreteiraService balsaCarreteiraService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = ".txt";

			try {

				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					BalsaCarreteira balsaCarreteira = new BalsaCarreteira(campos[0], campos[1], campos[2], campos[3], campos[4], campos[5]);

					balsaCarreteiraService.incluir(balsaCarreteira);

					System.out.println("Balsa Carreteira: " + balsaCarreteira.getNome() + ", incluido!");

					linha = leitura.readLine();
				}

				leitura.close();
				fileR.close();
			} catch (IOException e) {
				System.out.println("[ERRO]" + e.getMessage());
			}
		} finally {
			System.out.println("Realizado com sucesso!");
		}
	}
}
*/			