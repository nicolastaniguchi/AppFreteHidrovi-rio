package br.edu.infnet.AppFreteHidroviario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.BalsaCarreteiraService;

@Order(4)
@Component
public class BalsaCarreteiraLoader implements ApplicationRunner {

	@Autowired
	private BalsaCarreteiraService balsaCarreteiraService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			String arq = "balsacarreteira.txt";

			try {

				FileReader fileR = new FileReader(arq);
				BufferedReader leitura = new BufferedReader(fileR);

				String linha = leitura.readLine();
				String[] campos = null;

				while (linha != null) {

					campos = linha.split(";");
					
					Usuario usuario = new Usuario();

					usuario.setId(1);

					BalsaCarreteira balsaCarreteira = new BalsaCarreteira(campos[0], campos[1], Float.valueOf(campos[2]), Float.valueOf(campos[3]), Float.valueOf(campos[4]), Float.valueOf(campos[5]), Integer.valueOf(campos[6]), Boolean.valueOf(campos[7]));

					balsaCarreteira.setUsuario(usuario);
					
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
