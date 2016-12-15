package co.com.metrocuadrado.webservice.business.logic;

//import org.springframework.stereotype.Component;

import java.net.HttpURLConnection;
import java.net.URL;

import co.com.metrocuadrado.webservice.commons.constants.Constants;
import co.com.metrocuadrado.webservice.service.LogService;
import co.com.metrocuadrado.webservice.util.ManagerProperties;
import co.com.metrocuadrado.webservice.util.Util;
import co.com.metrocuadrado.webservice.util.ValidateURL;
import common.Logger;

//@Component
public class ValidateFields {
	

// 	@Autowired
	private LogService logService;
	private static final Logger LOGGER = Logger.getLogger(ValidateFields.class);
	private static final String NO_APLICA = "No Aplica";
	
	/**
	 * 
	 * @param idCity
	 */
	public static boolean validatePrincipalCity(int idCity){
		
		Constants.PrincipalCity city =  Constants.PrincipalCity.contains(idCity);
		return (city != null)? true : false;
	}

	/**
	 * Valida si la solicitud contiene formatos correctos para el tipo de negocio (Venta, arriendo y venta y arriendo), 
	 * valida que dentro de las caracteristicas contenga los valores de venta, arriendo o venta y arriendo según corresponda.
	 * @param forSale
	 * @param forRent
	 */
private static int validateTypeBussines(StringBuilder message, String forSale, String forRent, String features){
		
	int idTypeBussines = 0;
	
	try {
		if (forSale != null && forRent != null) {
			if (forSale.equals("S") && forRent.equals("N")) {
				idTypeBussines = 1;

			} else if (forSale.equals("N") && forRent.equals("S")) {
				idTypeBussines = 2;

			} else if (forSale.equals("S") && forRent.equals("S")) {
				idTypeBussines = 3;
			}else {
				message.append("'seArrienda' o 'seVende' debería venir en 'S' | ");
			}
		} else {
			message.append("Uno o los dos parametros (sevende y searrienda) debe estar en 'S' | ");
		}
		
		if(idTypeBussines != 0 && !features.equals(NO_APLICA)){
			
			switch(idTypeBussines){
			
			case 1:
				message.append(Util.containsPrice("valorVenta,", features));
				break;
			case 2:
				message.append(Util.containsPrice("valorArriendo,", features));
				break;
			case 3:
				message.append(Util.containsPrice("valorVenta,", features));
				message.append(Util.containsPrice("valorArriendo,", features));
				break;
			}
		}

	} catch (StringIndexOutOfBoundsException ex) {
		ex.getStackTrace();
		message.append("'caracteristicas'  | ");
	}

	return idTypeBussines;
	}
	
	/**
	 * Valida formato de las caracteristicas y que no contenga Sobre Plano ni En construcción.
	 * @param features
	 */
	private static void validateFeatures(StringBuilder message, String features){
		
		features = features.toLowerCase();
		
		if(features == null){
			LOGGER.error("metrocuadradoWS No tiene caracteristicas");
			message.append("'caracteristicas'.");
		}else if((features+";").matches("^[A-Za-z]{1,}[\\,].+[\\;]") && !features.contains("sobreplano") && !features.contains("enconstruccion")){
 
		}else{
			LOGGER.error("metrocuadradoWS No tiene caracteristicas o no tienen el formato correcto");
			message.append("'caracteristicas'.");
		}
	}
	
	/**
	 * Valida que los datos de usuario y contraseña contengan información válida.
	 * 
	 * @param message
	 * @param user
	 * @param pass
	 */
	public void validateLoginFields(StringBuilder message, String user, String pass){
		
		if(user == null || user.isEmpty()){
			LOGGER.error("metrocuadradoWS No tiene usuario");
			message.append("'usuario' | ");
			logService.appendLog("metrocuadradoWS", "ERROR : Usuario [" + user + "] no esta registrado en Metrocuadrado.com");
		}
		if(pass == null || pass.isEmpty()){
			LOGGER.error("metrocuadradoWS No tiene clave");
			message.append("'clave' | ");
			logService.appendLog("metrocuadradoWS", ManagerProperties.fileMessagesProperty("CLAVE_INVALIDA"));	
		}
	} 
	
	/**
	 * Valida el tipo de acción de la solicitud para continuar con el proceso.
	 * @param message
	 * @param action
	 */
	private static void validateAction(StringBuilder message, String action){
		
		if(action == null || action.isEmpty()){
			LOGGER.error("metrocuadradoWS No tiene accionPublicacion");
			message.append("'accionPublicacion' ('Publicar','Actualizar','Despublicar') | ");
		}else{
			try{
				Constants.Action.valueOf(action.toUpperCase());
			}catch(IllegalArgumentException ex){
				LOGGER.error("metrocuadradoWS No tiene accionPublicacion formato indicado");
				message.append("'accionPublicacion' ('Publicar','Actualizar','Despublicar') | ");
			}
		}
	}
	
	/**
	 * Valida que el idInmueble no esté vacío ni sea null y que tenga su formato sea válido. 
	 * @param idProperty
	 */
	private static void validateIdProperty(StringBuilder message, String idProperty){
		
		if(idProperty == null || idProperty.isEmpty()){
			LOGGER.error("metrocuadradoWS No tiene idInmueble");
			message.append("'idInmueble' | ");
		}
//		else{
//			if(!idProperty.matches("^[A-Za-z0-9]{1,9}[\\-][0-9]{2,10}")){
//				LOGGER.error("metrocuadradoWS idInmueble No tiene  el formato requerido");
//				message.append("'idInmueble' No tiene el formato requerido | ");
//			}
//		}
	}
	
	
	/**
	 * Valida que el tipo de inmueble sea válido y esté dentro de los formatos que maneja la aplicación.
	 * @param returnMessage
	 * @param idTypeProperty
	 */
	private static void validateIdTypeProperty(StringBuilder returnMessage, int idTypeProperty){

		if(Constants.TypeProperty.containsID(idTypeProperty) == null){
			LOGGER.error("metrocuadradoWS No tiene idTipoInmueble válido");
			returnMessage.append("'idTipoInmueble' puede ver el metodo obtenerTipoInmueble | ");
		}
	}
	
	/**
	 * 
	 * @param message
	 * @param urls
	 */
	private static void validateURLPhotos(StringBuilder message, String urls){
		
		if(urls!= null && ValidateURL.validURL(urls)){
			if(urls.split(";").length > 20){
				LOGGER.error("la URL tiene más de 20 imagenes");
				message.append("'URL' Máximo 20 imágenes | ");
			}
		}else{
			message.append("'URL' | ");
			LOGGER.error("Error en la url");
		}
	}
	
	
	private void validatePhone(StringBuilder returnMessage, String phone){
	
		if(phone == null || phone.isEmpty() || !phone.matches("^[0-9]{7,10}")){
			LOGGER.error("metrocuadradoWS, telefono de agente inválido" + phone);
			returnMessage.append("'idTipoInmueble' puede ver el metodo obtenerTipoInmueble | ");
		}else{
			
		}
	}
	
	/**
	 * Valida que la url del vídeo cumpla con la estructura y que sea de youtube
	 * @param returnMessage
	 * @param url
	 * @return
	 */
	private void validateURLVideo(StringBuilder returnMessage, String url){
		
		if (url.toLowerCase().contains("youtube.com") || url.toLowerCase().contains("youtu.be")) {
			try {
				URL u = new URL(url);
				HttpURLConnection huc = (HttpURLConnection) u.openConnection();
				huc.setRequestMethod("GET");
				huc.connect();
				boolean httpOk = (huc.getResponseCode() == HttpURLConnection.HTTP_OK);
				
				if(!httpOk){
					returnMessage.append("La url ingresada no cumple con la estructura. Solo se permiten videos de YouTube.com");
				}
			} catch (Exception e) {
				e.getStackTrace();
				LOGGER.error("Problema al validar la url ingresada: " + e.getMessage());
			}
		}
	}
	
	
	/**
	 * Recibe todos los datos de la solicitud para validar que vengan completos y con los formatos que corresponde a cada uno
	 * para continuar con la solicitud.
	 * @param user
	 * @param pass
	 * @param action
	 * @param idProperty
	 * @param idTypeProperty
	 * @param forSale
	 * @param forRent
	 * @param idCity
	 * @param features
	 * @return
	 */
	public void dataCompletedProcessProperty(StringBuilder returnMessage, String user, String pass,
			String action, String idProperty, int idTypeProperty,
			String forSale, String forRent, int idCity, String features) {

		StringBuilder message = new StringBuilder();
		
		dataBasicCompleted(message, user, pass, idProperty);
		validateAction(message, action);
		validateIdTypeProperty(message, idTypeProperty);
		validateFeatures(message, features);
		validateTypeBussines(message, forSale, forRent, features);

		if (idCity <= 0) {
			LOGGER.error("metrocuadradoWS No tiene idCiudad");
			message.append("'idCiudad' puede ver el metodo obtenerCiudades | ");
		}
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
	}
	
	/**
	 * Valida los datos de entrada del servicio insertarRutaFotos
	 * @param user
	 * @param pass
	 * @param idProperty
	 * @param urlPhotos
	 * @return
	 */
	public void dataCompletedInsertPath(StringBuilder returnMessage,
			String user, String pass, String idProperty, String urlPhotos) {

		StringBuilder message = new StringBuilder();
		
		dataBasicCompleted(message, user, pass, idProperty);
		validateURLPhotos(message, urlPhotos);
		
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
	}
	
	/**
	 * 
	 */
	public void dataCompletedAgent(StringBuilder returnMessage, String user, String pass,
			String idProperty, String name, String tel){
		
		StringBuilder message = new StringBuilder();
		
		validateLoginFields(message, user, pass);
		validateIdProperty(message, idProperty);
		validatePhone(returnMessage, tel);
		
		if(name == null || name.isEmpty()){
			LOGGER.error("metrocuadradoWS No tiene nombre de agente");
			message.append("'nombre agente' | ");
		}
		
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
	} 
	
	
	
	public void dataCompletedURLVideo(StringBuilder returnMessage, String user,
			String pass, String idProperty, String urlVideo) {
		
		StringBuilder message = new StringBuilder();

		validateLoginFields(message, user, pass);
		validateIdProperty(message, idProperty);
		validateURLVideo(returnMessage, urlVideo);
		
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
	}
	
	/**
	 * Valida los datos básicos 
	 * @param returnMessage
	 * @param user
	 * @param pass
	 * @param idProperty
	 */
	public void dataBasicCompleted(StringBuilder returnMessage, String user, String pass, String idProperty){
		
		StringBuilder message = new StringBuilder();
		
		validateLoginFields(message, user, pass);
		validateIdProperty(message, idProperty);
		
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
	}
	
	public int dataCompletedGetFeatures(StringBuilder returnMessage, String user, String pass, int idTypeFeatures, int country, int idTypeProperty, String forSale, String forRent){
		
		StringBuilder message = new StringBuilder();
		int typeBussines;
		
		validateLoginFields(message, user, pass);
		validateIdTypeProperty(returnMessage, idTypeProperty);
		typeBussines = validateTypeBussines(message, forSale, forRent, NO_APLICA);
		message.append((country != Constants.PAIS)?" 'pais' |": "");
		
		if(typeBussines == 0){
			message.append(ManagerProperties.fileMessagesProperty("inmueble.sin.tiponegocio"));
		}
		
		if (!message.toString().isEmpty()) {
			returnMessage.append("mensaje,error en el parametro ").append(message).append(" Verifique que se este enviando correctamente.");
		}
		
		return typeBussines;
	}
}
