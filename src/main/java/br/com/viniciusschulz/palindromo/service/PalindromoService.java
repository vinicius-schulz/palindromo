package br.com.viniciusschulz.palindromo.service;

import org.springframework.stereotype.Service;

import br.com.viniciusschulz.palindromo.utils.StringUtils;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PalindromoService {

	public Boolean isPalindromo(String texto) {

		log.info("Objeto: {}", texto);

		String retorno = StringUtils.removeSpecialChars(texto);
		retorno = StringUtils.toLowerCase(retorno);
		String palindromo = StringUtils.invert(retorno);

		return retorno.equals(palindromo);

	}

}
