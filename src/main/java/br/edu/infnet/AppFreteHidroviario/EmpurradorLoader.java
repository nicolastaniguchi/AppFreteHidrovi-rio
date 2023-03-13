package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;
import br.edu.infnet.AppFreteHidroviario.service.EmpurradorService;

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

					Empurrador empurrador = new Empurrador(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5],campos[6],campos[7]);

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
