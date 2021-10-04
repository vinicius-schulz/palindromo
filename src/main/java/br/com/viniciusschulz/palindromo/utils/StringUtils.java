package br.com.viniciusschulz.palindromo.utils;

import java.text.Normalizer;
import java.util.regex.Pattern;

public final class StringUtils {

	private static final Pattern ONLY_ASCII = Pattern.compile("[^\\p{ASCII}]");
	private static final Pattern NO_SPECIAL = Pattern.compile("[^a-zA-Z0-9]");

	private StringUtils() {

	}

	public static String toLowerCase(String word) {

		String passa = "";

		if (!isEmptyOrNull(word)) {
			passa = word.toLowerCase();
		}

		return passa;

	}

	public static boolean isEmptyOrNull(String word) {
		return word == null || word.isEmpty();
	}

	public static String removeSpecialChars(String stringFonte) {
		String passa = "";
		if (!isEmptyOrNull(stringFonte)) {
			passa = ONLY_ASCII.matcher(Normalizer.normalize(stringFonte, Normalizer.Form.NFD)).replaceAll("");
			passa = NO_SPECIAL.matcher(passa).replaceAll("");
		}

		return passa;
	}

	public static String invert(String palavra) {

		String palindromo = "";

		if (!isEmptyOrNull(palavra)) {

			for (int i = palavra.length() - 1; i >= 0; i--) {
				palindromo += palavra.charAt(i);
			}
		}

		return palindromo;
	}

}
