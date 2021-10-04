package br.com.viniciusschulz.palindromo.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromoServiceTest {

	@Test
	public void testIsPalindromoTrue() {

		PalindromoService palindromoService = new PalindromoService();

		assertTrue(palindromoService.isPalindromo("bob"));
		assertTrue(palindromoService.isPalindromo("madam"));
		assertTrue(palindromoService.isPalindromo("mAlAyAlam"));
		assertTrue(palindromoService.isPalindromo("1"));
		assertTrue(palindromoService.isPalindromo("Able was I, ere I saw Elba"));
		assertTrue(palindromoService.isPalindromo("Madam I’m Adam"));
		assertTrue(palindromoService.isPalindromo("Step on no pets."));
		assertTrue(palindromoService.isPalindromo("Top spot!"));
		assertTrue(palindromoService.isPalindromo("02/02/2020"));
		assertTrue(palindromoService.isPalindromo("Rotator"));
	}

	@Test
	public void testIsPalindromoFalse() {

		PalindromoService palindromoService = new PalindromoService();

		assertFalse(palindromoService.isPalindromo("xyz"));
		assertFalse(palindromoService.isPalindromo("elephant"));
		assertFalse(palindromoService.isPalindromo("Country"));
		assertFalse(palindromoService.isPalindromo("Top . post!"));
		assertFalse(palindromoService.isPalindromo("Wonderful-fool"));
		assertFalse(palindromoService.isPalindromo("Wild imagination!"));
	}

}
