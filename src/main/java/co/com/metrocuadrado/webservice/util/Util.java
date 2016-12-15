package co.com.metrocuadrado.webservice.util;

//TODO Eliminar dependencia de pragma
import co.com.pragma.pjr.util.PJRString;

public class Util {

	/**
	 * Valida que la cadena recibida sea un n�mero entero sin comas ni puntos.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\d+)?");
	}

	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int[] toPrimitive(Object[] array) {

		if (array == null) {
			return null;
		} else if (array.length == 0) {
			return new int[0];
		}
		final int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			result[i] = ((Integer) array[i]).intValue();
		}
		return result;
	}

	/**
	 * Reemplaza las tildes en una cadena
	 * 
	 * @param cadena
	 * 
	 *            cadena a reemplazar
	 * @return
	 */
	public static String normalizarCadena(String cadena) {

		return PJRString.replaceIgnoreCase(PJRString.replaceIgnoreCase(
				PJRString.replaceIgnoreCase(
						PJRString.replaceIgnoreCase(PJRString
								.replaceIgnoreCase(PJRString.replaceIgnoreCase(
										cadena, "ñ", "ni"), "ú", "u"), "ó",
								"o"), "í", "i"), "é", "e"), "á", "a");

	}

	/**
	 * Valida que la cadena sea un entero para poder ser procesada, de lo
	 * contrario retorna cero.
	 * 
	 * @param valor
	 * @return
	 */
	public static int parseInt(String valor) {
		try {
			return Integer.parseInt(valor);
		} catch (NumberFormatException nfe) {
			return 0;
		}
	}

/**
 * Valida que la cadena de caracteristicas contenga el valor seg�n el tipo de negocio
 * (ValorVenta o ValorArriendo)
 * @param nameBussines
 * @param features
 * @return
 */
	public static String containsPrice(String nameBussines, String features) {

		String saleValue = features.substring(features.indexOf(nameBussines)
				+ nameBussines.length(), features.length());
		saleValue = saleValue.substring(0, saleValue.indexOf(";"));

		if (!isNumeric(saleValue)) {
			return "'" + nameBussines.substring(0, nameBussines.length() - 1) + "' | ";
		}
		return "";
	}

}
