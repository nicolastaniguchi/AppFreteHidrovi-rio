package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;
import br.edu.infnet.AppFreteHidroviario.service.BalsaGraneleiraService;

@Component
public class BalsaGraneleiraLoader implements ApplicationRunner {

	@Autowired
	private BalsaGraneleiraService balsaGraneleiraService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = "balsagraneleira.txt";

			try {

				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					BalsaGraneleira balsaGraneleira = new BalsaGraneleira(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6],campos[7]);

					balsaGraneleiraService.incluir(balsaGraneleira);

					System.out.println("Balsa Graneleira: " + balsaGraneleira.getNome() + ", incluido!");

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
