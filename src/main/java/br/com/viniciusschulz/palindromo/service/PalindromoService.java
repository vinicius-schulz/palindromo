package br.com.viniciusschulz.palindromo.service;

import org.springframework.stereotype.Service;

import br.com.viniciusschulz.palindromo.utils.StringUtils;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PalindromoService {

	public Boolean isPalindromo(String texto) {

		log.info("Texto original: {}", texto);
		String retorno = StringUtils.replaceSpecialChars(texto);

		log.info("Texto sem caracteres especiais: {}", retorno);

		retorno = StringUtils.toLowerCase(retorno);
		log.info("Texto com case sensitive ignorado: {}", retorno);

		String palindromo = StringUtils.invert(retorno);
		log.info("Palindromo esperado: {}", palindromo);

		return retorno.equals(palindromo);

	}

}
