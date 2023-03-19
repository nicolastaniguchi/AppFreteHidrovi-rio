package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;
import br.edu.infnet.AppFreteHidroviario.service.EmpurradorService;

@Component
public class EmpurradorLoader implements ApplicationRunner {

	@Autowired
	private EmpurradorService empurradorService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = "empurrador.txt";

			try {

				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");

					Empurrador empurrador = new Empurrador(campos[0], Float.valueOf(campos[1]), Float.valueOf(campos[2]), Float.valueOf(campos[3]), Float.valueOf(campos[4]), Boolean.valueOf(campos[5]), Boolean.valueOf(campos[6]), Integer.valueOf(campos[7]));

					empurradorService.incluir(empurrador);

					System.out.println("Empurrador: " + empurrador.getNome() + ", incluido!");

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
