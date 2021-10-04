package br.com.viniciusschulz.palindromo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.viniciusschulz.palindromo.dto.PalindromoDto;
import br.com.viniciusschulz.palindromo.service.PalindromoService;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("palindromo")
public class PalindromoController {

	private final PalindromoService palindromoService;

	@Autowired
	public PalindromoController(PalindromoService palindromoService) {
		this.palindromoService = palindromoService;
	}

	@PostMapping(value = "/")
	public ResponseEntity<Boolean> isPalindromo(@RequestBody PalindromoDto palindromo) {

		log.info("Request GET palindromo/");
		Boolean retorno = palindromoService.isPalindromo(palindromo.getTexto());
		log.info("Request GET palindromo/ finalizado ");
		return ResponseEntity.ok().body(retorno);
	}

}
