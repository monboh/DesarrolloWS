package co.com.metrocuadrado.webservice.business.logic;

import co.com.metrocuadrado.webservice.business.logic.BasicValidations;
import co.com.metrocuadrado.webservice.business.logic.ValidateFields;
import co.com.metrocuadrado.webservice.model.Inmueble;
import co.com.metrocuadrado.webservice.model.dto.UserDTO;
import co.com.metrocuadrado.webservice.service.LogService;
import co.com.metrocuadrado.webservice.service.PropertyService;
import co.com.metrocuadrado.webservice.service.VideoService;


/**
 * 
 * @author monboh
 *
 */
public class Processes {

//	@Autowired
	private PropertyService propertyService; 
	
// 	@Autowired
	private LogService logService;
	
//	@Autowired
	private VideoService videoService;
	
	
	
	
	public Processes(){
		
	}
	/**
	 * Valida el estado 
 		sí no existe lo publica,
 		Sí está despublicado valida regla de los 30 días y dado caso republica.
 		Si existe y está publicado lo actualiza. 
	 * @param userLogin
	 * @param idProperty
	 * @param idCity
	 * @return
	 */
	public void validateStatusProperty(UserDTO userLogin, String idProperty, int idCity){

		Inmueble property = propertyService.consultProperty(idProperty);
		
		if(property!= null){
			if(property.getEstapublicado().equals("S")){
				updateProperty();
			}else if(property.getEstapublicado().equals("N")){
//				TODO Validar regla de los 30 días.
				republicarProperty();
			}
		}else if(BasicValidations.validatePrefix(userLogin.getPrefix(), idProperty)){ //Validar prefijo
				publishProperty(userLogin, idProperty, idCity);
			}
		}
	
	/**
	 * 
	 */
	private void publishProperty(UserDTO userLogin, String idProperty, int idCity){
		
		if(ValidateFields.validatePrincipalCity(idCity)){
//		TODO Código para ciudad principal
		}
//		Creado + Publicado: actualiza informacion 
//		*Creado + Despublicado: regla 30 dias (+exception), Inmueble Eliminado (+exception), Publica 
//		*No existe: Llamado Prefijo del inmueble asociado al usuario, Llamar Formato que debe cumplir idinmueble
		
		
		
	}
	
	/**
	 * 
	 */
	private void republicarProperty(){
		
//		*Validar la existencia del inmueble (+error)
//	    -Creado + Publicado: actualiza informacion
//	    -Creado + Despublicado: regla 30 dias (+exception), Llamar Inmueble Eliminado, Republica
//		
	}
	
	
	private void updateProperty(){
		
	}
	
	
	public Inmueble consultProperty(String idProperty, String user){
	
		Inmueble property = propertyService.propertyBelongsUser(idProperty, user);
		return property;

	}
	
	
	/**
	 * Metodo que valida la URL enviada
	 * @param idProperty
	 * @param urlVideo
	 * @param videoExiste 
	 * @return
	 * @throws SQLException
	 * @throws IOException 
	 */
	public String processUrlVideo(String idProperty, String urlVideo) {

		StringBuilder message = new StringBuilder() ;
		boolean existVideo = videoService.existVideo(idProperty);
		
		if (existVideo) {
			if (urlVideo == null || urlVideo.equals("")) {
				boolean eliminado = videoService.deleteVideoPproperty(idProperty);
				if (eliminado) {
					videoService.approveVideo("N", "N", idProperty);
					message.append("Se elimino el video asociado.");
				} else {
					message.append("No se pudo eliminar el video.");
				}
			} else {
				videoService.updateVideoProperty(idProperty, urlVideo);
				videoService.approveVideo("S", "S", idProperty);
				message.append("Video actualizado.");
			}
		} else {
			boolean insertado = videoService.insertVideoProperty(idProperty, urlVideo);
			if (insertado) {
				videoService.approveVideo("S", "S", idProperty);
				message.append("Video insertado.");
			} else {
				message.append("el video no fue insertado. Por vafor valide la informacion enviada.");
			}
		}
		return "mensaje, " + message.append(";");
	}
}