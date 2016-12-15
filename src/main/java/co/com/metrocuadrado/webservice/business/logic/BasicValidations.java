package co.com.metrocuadrado.webservice.business.logic;

import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Value;




import co.com.metrocuadrado.webservice.model.dto.UserDTO;
import co.com.metrocuadrado.webservice.service.LogService;

/**
 * This class performs validations basics for login, membership and permissions
 * 
 * @author monboh
 * 
 */
public class BasicValidations {

	private static final Logger LOGGER = Logger.getLogger(BasicValidations.class);
	
//	@Value(value = "${usuario.invalido}")
	private static String USER_ERROR;
	
// 	@Autowired
	private LogService logService;

	/**
	 * llama a validar si el usuario y clave son correctos, de ser así valida que el usuario tenga permisos de WS 
	 * y finalmente valida el tipo de membresía.
	 */
	public UserDTO basicValidations(StringBuilder returnMessage, String user, String pass) {
		boolean permissionsFlag = false;

		UserDTO userLogin = validateLogin(returnMessage, user, pass);

		if (userLogin != null && validatePermissionsWS()) {

			switch (userLogin.getMembershiptype()) {
			// TODO Según la memebresía validar si tiene peticiones disponibles.
			case 1:
				if (validateCreditMembership()) {
					permissionsFlag = true;
				}
				break;
			case 2:
				if (validateMembershipOnAir()) {
					permissionsFlag = true;
				}
				break;
			case 3:
				if (validateMermbershipMix()) {
					permissionsFlag = true;
				}
				break;
			default:
				permissionsFlag = false;
			}
		}
		return (permissionsFlag) ? userLogin : null;
	}

	/**
	 * Valida que el usuario esté dentro de la DB y que la contraseña sea la correcta.
	 */
	private UserDTO validateLogin(StringBuilder returnMessage, String user, String pass) {
		// TODO implementar
		returnMessage.append(USER_ERROR);
		logService.writeLog();
		
		return new UserDTO();
	}

	/**
	 * Valida la membresía por céditos
	 */
	private static boolean validateCreditMembership() {
		// TODO implementar método
		return false;
	}

	/**
	 * Validar si tiene permiso de WS
	 */
	private static boolean validatePermissionsWS() {
		// TODO implementar método
		
		return false;
	}

	/**
	 * Valida tipo de membresía Inmueble al aire 
	 */
	private static boolean validateMembershipOnAir() {
		// TODO implementar método
		return false;
	}

	/**
	 * Valida tipo de membresía Mixta.
	 */
	private static boolean validateMermbershipMix() {
		// TODO implementar método
		return false;
	}
	
	/**
	 * Valida que el prefijo que tiene el usuario logueado corresponda al prefijo con el que 
	 * quiere crear el inmueble.
	 * @param prefix
	 * @param idProperty
	 * @return
	 */
	public static boolean validatePrefix(String prefix, String idProperty){
	
		String prefixProperty = idProperty.toLowerCase().substring(0, idProperty.indexOf("-"));
		return (prefixProperty.equals(prefix.toLowerCase()));
	}
	
	/**
	 * Se utiliza para generara el IdTipoNegocio del inmueble que se esta
	 * procesando
	 * 
	 * @param seVende
	 * @param seArrienda
	 * @return
	 * @author monboh
	 */

	public int getIdTypeBussines(String seVende, String seArrienda) {
		
//		TODO Revisar si se puede optimizar 
		int idTypeBussines = 0;
		logService.appendLog("metrocuadradoWS", "Inmueble seVende= " + seVende + " seArrienda=" + seArrienda);
		
		if (seVende.equals("S") && seArrienda.equals("N")) {
			idTypeBussines = 1;
			logService.appendLog("metrocuadradoWS", "seVende == S " + idTypeBussines);
		}
		if (seArrienda.equals("S") && seVende.equals("N")) {
			idTypeBussines = 2;
			logService.appendLog("metrocuadradoWS", "seArrienda == S " + idTypeBussines);
		}
		if (seArrienda.equals("S") && seVende.equals("S")) {
			idTypeBussines = 3;
			logService.appendLog("metrocuadradoWS", "seArrienda == S && seVende == S "
					+ idTypeBussines);
		}
		logService.appendLog("metrocuadradoWS", "Inmueble idTipoNegocio= " + idTypeBussines);

		return idTypeBussines;
	}
}
