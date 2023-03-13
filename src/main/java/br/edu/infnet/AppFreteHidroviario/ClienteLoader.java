package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;
import br.edu.infnet.AppFreteHidroviario.service.ClienteService;

@Component
public class ClienteLoader implements ApplicationRunner {

	@Autowired
	private ClienteService clienteService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = "cliente.txt";

			try {

				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;									

				while (linha != null) {

					campos = linha.split(";");

					Cliente cliente = new Cliente(campos[0], campos[1], campos[2]);

					clienteService.incluir(cliente);

					System.out.println("Cliente: " + cliente.getNome() + ", incluido!");

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
