package co.com.metrocuadrado.webservice.util;

import java.text.MessageFormat;
import java.util.ResourceBundle;

import common.Logger;


//import org.springframework.stereotype.Component;

/**
 * Carga de propiedades desde archivos de propiedades
 */
//@Component
public class ManagerProperties {

	private static final String PATH_FILE_MESSAGE = "webservice-messages";

	private static ManagerProperties instance;
	private final static Logger LOGGER = Logger.getLogger(ManagerProperties.class);

	private ManagerProperties() {

	}

	/**
	 * Genera la instancia singleton de la clase
	 * 
	 * @return instancia de la clase {@link ManagerProperties}
	 */
	public static ManagerProperties getInstance() {
		if (instance == null) {
			synchronized (ManagerProperties.class) {
				if (null == instance) {
					instance = new ManagerProperties();
				}
			}
		}
		return instance;
	}

	/**
	 * Carga una propiedad desde un archivo de propiedades especificado
	 * 
	 * @author c.rodriguez@globant.com
	 * @param key {@link String} con el valor a buscar
	 * @param params lista de parametros opcionales
	 * @return {@link String} con el valor encontrado o null en otro caso
	 */
	private String getProperty(String propertyFileName, String key) {
		String property = null;

		try {
			ResourceBundle r = ResourceBundle.getBundle(propertyFileName);
			property = r.getString(key);
			
		} catch (Exception e) {
			LOGGER.error("La propiedad "+key+" no existe");
			e.getStackTrace();
		} 
		return property;
	}

	/**
	 * Carga una propiedad desde un archivo de propiedades especificado
	 * 
	 * @author c.rodriguez@globant.com
	 * @param key {@link String} con el valor a buscar
	 * @param params lista de parametros opcionales
	 * @return {@link String} con el valor encontrado o null en otro caso
	 */
	private String getProperty(String propertyFileName, String key, Object... params) {
		String property = null;

		try {
			ResourceBundle r = ResourceBundle.getBundle(propertyFileName);
			property = r.getString(key);
			property = MessageFormat.format(property, params);

		} catch (Exception e) {
			LOGGER.error("La propiedad "+key+" no existe");
			e.getStackTrace();
		} 
		return property;
	}

	public static String fileMessagesProperty(String key) {
		return ManagerProperties.getInstance().getProperty(PATH_FILE_MESSAGE, key);
	}

	/**
	 * Encapsula la obteción de propiedades del archivo de propiedades {@value #PATH_FILE_MESSAGE}
	 * 
	 * @author c.rodriguez@globant.com
	 * @param key {@link String} con el valor a buscar
	 * @param params lista de parametros opcionales
	 * @return {@link String} con el valor encontrado o null en otro caso
	 */
	public static String fileMessagesProperty(String key, Object... params) {
		return ManagerProperties.getInstance().getProperty(PATH_FILE_MESSAGE, key, params);
	}
}
