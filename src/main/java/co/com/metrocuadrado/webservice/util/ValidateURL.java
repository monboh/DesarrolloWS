package co.com.metrocuadrado.webservice.util;

import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;

import co.com.metrocuadrado.webservice.service.LogService;

public class ValidateURL {

	// @Autowired
	private static LogService logService;
	private static final Logger LOGGER = Logger.getLogger(ValidateURL.class);

	static String urlPattern = "^.+\\.[(jpg|jpeg|png|JPG|JPEG|PNG)]{3,4}+\\;";

	public static boolean validURL(String URLName) {
		System.out.println("Inicia la validacion");
		logService.appendLog("metrocuadradoWS",	"Va a valida que la URL tenga la estructura:: " + URLName);

		if (URLName.matches(urlPattern)) {
			System.out
					.println("Verifica la estructura de la url para saber si es una foto");
			if (URLName.toLowerCase().contains("http://")
					|| URLName.toLowerCase().contains("https://")) {
				System.out.println("Verifica protocolos http:// https://");
				try {
					logService.appendLog("metrocuadradoWS",	"Pasa los filtros de estructura y de protoco http o https");
					URL u = new URL(URLName);
					System.out.println("Prepara la URL " + u);

					HttpURLConnection huc = (HttpURLConnection) u.openConnection();

					huc.setRequestMethod("GET");
					huc.connect();
					System.out.println("Respuesta pagina "+ huc.getResponseCode());
					logService.appendLog("metrocuadradoWS",	"Codigo de respuesta:: " + huc.getResponseCode());
					logService.appendLog("metrocuadradoWS","Retorno "+ (huc.getResponseCode() == HttpURLConnection.HTTP_OK));
					return (huc.getResponseCode() == HttpURLConnection.HTTP_OK);

				} catch (Exception e) {
					System.out.println(e.getMessage());
					LOGGER.error(e.getMessage());
					e.printStackTrace();
					return false;
				}
			} else
				return true;
		} else
			return false;
	}
}
