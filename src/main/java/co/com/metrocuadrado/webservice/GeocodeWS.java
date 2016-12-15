package co.com.metrocuadrado.webservice;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.log4j.Logger;

import co.com.mapas.m2.services.InmuebleUbicadoDTO;
import co.com.metrocuadrado.webservice.base.ImageUploader;
import co.com.metrocuadrado.webservice.business.logic.BasicValidations;
import co.com.metrocuadrado.webservice.business.logic.Processes;
import co.com.metrocuadrado.webservice.business.logic.ValidateFields;
import co.com.metrocuadrado.webservice.collections.Photos;
import co.com.metrocuadrado.webservice.commons.constants.Constants;
import co.com.metrocuadrado.webservice.model.Photo;
import co.com.metrocuadrado.webservice.model.dto.UserDTO;
import co.com.metrocuadrado.webservice.service.AgentService;
import co.com.metrocuadrado.webservice.service.CityService;
import co.com.metrocuadrado.webservice.service.LogService;
import co.com.metrocuadrado.webservice.service.PropertyService;
import co.com.metrocuadrado.webservice.service.RegionService;
import co.com.metrocuadrado.webservice.util.ManagerProperties;
import co.com.metrocuadrado.webservice.util.Util;
import co.com.metrocuadrado.webservice.util.ValidateURL;
import co.com.pragma.m2.MembresiaVencidaException;
import co.com.pragma.pjr.util.PJRString;

/**
 * <p>
 * * Title: Proyecto Metrocuadrado.com *
 * </p>		
 * <p>
 * * Description: Web Service Metrouadrado.com *
 * </p>
 * <p>
 * * Copyright: Copyright (c) 2006 *
 * </p>
 * <p>
 * * Company: Metrocuadrado.com *
 * </p>
 * 
 * @author Carlos Mario Quintero Abuchar
 * @version 1.0
 */

public class GeocodeWS extends ImageUploader {

	 private static final Logger LOGGER = Logger.getLogger(GeocodeWS.class);
	 

//		@Autowired
		private PropertyService propertyService;
		
//	 	@Autowired
		private LogService logService;
		
//		@Autowired
		private ValidateFields validateFields;
		
//		@Autowired
		private AgentService agentService;
		
//		@Autowired
		private RegionService regionService;
		
//		@Autowired
		private CityService cityService;
	
	private InmuebleUbicadoDTO geocodificarDireccionSinGuardarBD(
			String idInmueble, String direccion, int idCiudad) throws Exception {
		System.out.println("Método private geocodificarDireccionSinGuardarBD()");
		return null;
	}

	/**
	 * Esta funcion valida la direccion en el sistema de Metrocuadrado.com
	 * 
	 * @param country
	 *            pais donde pertenece la direccion
	 * @param city
	 *            ciudad donde pertenece la direccion
	 * @param address
	 *            direccion a validar
	 * @return hashMap con los campos de la ubicacion de la direccion
	 * @throws Exception
	 */
	private HashMap validarDireccion(String country, String city,
			String address, int visitorId, String metodo, String idCiudad)
			throws Exception {

		System.out.println("Método private validarDireccion()");
		return null;

	}

	/**
	 * Valida que el comentario de publicacion contenga maximo 5 valores
	 * numericos
	 * 
	 * @param comentario
	 * @return
	 */

	private String formatearNumerosComentario(String comentario) {
		return "Método formatearNumerosComentario";
	}


	/**
	 * Inserta un inmueble en la base de datos.<br>
	 * Si la ciudad no es en las afueras verifica la direcciï¿½n
	 * 
	 * @param reg
	 *            Los datos del inmueble que serï¿½ insertado.
	 */
	private String insertarInmueble(int visitorId, String idInmueble,
			HashMap reg) throws Exception {
		return "Método insertarInmueble";
	}


	/***
	 * 
	 * Genera la orden de compra para los inmuebles insertados.
	 * 
	 * @param idInmueble
	 * @param visitorId
	 * @throws MembresiaVencidaException
	 * @throws SQLException
	 * @throws Exception
	 */
	private void generarOrdenCompra(String idInmueble, int visitorId)
			{
	}

	/**
	 * Realiza la comprobacion del valor a pagar. Si es cero, se aprueba
	 * automaticamente la orden de compra.
	 * 
	 * 1. Si no tiene que pagar entonces se aprueba la orden de compra
	 * 
	 * @param visitorId
	 * @param idInmueble
	 * @param idOrdenCompra
	 * @throws MembresiaVencidaException
	 * @throws SQLException
	 * @throws Exception
	 */
	private void verificarValorAPagar(int visitorId, String idInmueble,
			int idOrdenCompra) {
	}

	/**
	 * Realiza la publicaciï¿½n de todos los inmuebles (que se puedan publicar)
	 * que fueron importados en esta importaciï¿½n.
	 * 
	 * @exception SQLException
	 *                Cuando ocurre algun problema con el acceso a la base de
	 *                datos.
	 */
	private void publicarInmueble(String idInmueble) throws Exception {

	}

	/**
	 * Genera la orden de compra para los inmuebles insertados.
	 * 
	 * @exception SQLException
	 *                Cuando ocurre algun problema con el accesso a la base de
	 *                datos.
	 * @exception Exception
	 *                Cuando ocurra algun error en la creacio n de las ordenes
	 *                de compra
	 */
	private void borrarOrdenesCompra(String idInmueble) throws SQLException,
			Exception {
	}


	private boolean sePuedeDespublicar(String idInmueble) throws Exception {
		return false;
	}

	/**
	 * 
	 * @param loginid
	 * @return
	 * @throws Exception
	 */

	private ResultSet obtenerContactosInmueble(String idinmueble, String usuario)
			throws Exception {

		return null;
	}

	/**
	 * Meotod que retorna los inmuebles despublicados
	 * 
	 * @param loginid
	 * @return
	 * @throws Exception
	 */
	private ResultSet obtenerInmueblesDespublicadosUsuario(String loginid)
			throws Exception {

		return null;

	}

	/**
	 * Metodo que retorna los inmuebles con fotos insertadas por WS
	 * 
	 * @param loginid
	 * @return
	 * @throws Exception
	 */
	private ResultSet obtenerInmueblesConImagenesInsertadas(String loginid)
			throws Exception {

		return null;

	}

	/**
	 * Normaliza tiempo construido para no tener problemas con la base de datos.
	 * 
	 * @param AnosConstruido
	 * @return
	 * @author monboh
	 */


	/**
	 * Va a comprobar si el inmueble se encuentra eliminado.
	 * 
	 * @param idInmueble
	 * @return
	 * @throws SQLException
	 * @author monboh
	 */

	private boolean inmuebleEliminado(String idInmueble) throws SQLException {

		return false;
	}


	/**
	 * Metodo que se utliza para recuperar el valor del inmueble con el formato
	 * ideal
	 * 
	 * @param valorVenta
	 * @return
	 * @author monboh
	 */

	private static String getValor(String valor) {
		valor = PJRString.replace(valor, ".00", "");
		valor = PJRString.replace(valor, "$", "");
		valor = PJRString.replace(valor, ",", "");
		return valor;
	}

	/**
	 * Metodo que valida la URL enviada
	 * 
	 * @param idInmueble
	 * @param url
	 * @param videoExiste
	 * @return
	 * @throws SQLException
	 * @throws IOException
	 */
	private String procesarUrlVideo(String idInmueble, String url,
			boolean videoExiste) throws SQLException, IOException {

		return "";
	}

	/**
	 * 
	 * @param idInmueble
	 * @return
	 */

	private boolean existeVideo(String idInmueble) throws SQLException {

		return false;

	}

	/**
	 * Metodo Que se utiliza para publicar y actualizar un inmueble Modificado
	 *  
	 * @param usuario
	 * @param clave
	 * @param idTipoInmueble
	 * @param seVende
	 * @param seArrienda
	 * @param idCiudad
	 * @param caracteristicas
	 * @return
	 * @throws Exception
	 * @since 14/08/2013
	 */
	public String procesarInmueble(String usuario, String clave,
			String accionPublicacion, String idInmueble, int idTipoInmueble,
			String seVende, String seArrienda, int idCiudad,
			String caracteristicas) {
		
		StringBuilder returnMessage = new StringBuilder();
		Processes process = new Processes();
		logService.appendLog("metrocuadradoWS","Realizando peticion al metodo procesarInmueble con accion => " + accionPublicacion);
		
		validateFields.dataCompletedProcessProperty(returnMessage, usuario, clave, accionPublicacion, idInmueble, idTipoInmueble, seVende, seArrienda, idCiudad, caracteristicas);
		logService.appendLog("metrocuadradoWS", "Respuesta mensajeGeneral " + returnMessage);
		
		if(returnMessage.toString().isEmpty()){
			BasicValidations basicValidations = new BasicValidations();
			UserDTO userLogin = basicValidations.basicValidations(returnMessage, usuario, clave);
			
			logService.writeLog(accionPublicacion, caracteristicas, "status", idInmueble, idTipoInmueble, "Mensaje", seVende, seArrienda, userLogin.getVisitorID());
			
			process.validateStatusProperty(userLogin, idInmueble, idCiudad);
		}
		System.out.println("Ingreso a método ProcesarInmueble");
		
		return returnMessage.toString();
	}

	/**
	 * Metodo que se utliliza para subir fotos en Azure Metodo modificado monboh
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @param URLs
	 * @return
	 * @since 29/11/2016
	 */

	public String insertarRutaFotos(String usuario, String clave, String idInmueble, String URLs) {
		
		StringBuilder returnMessage = new StringBuilder(); 
		validateFields.dataCompletedInsertPath(returnMessage, usuario, clave, idInmueble, URLs);
		
		if(returnMessage.toString().isEmpty()){
			
			BasicValidations basicValidations = new BasicValidations();
			UserDTO userLogin = basicValidations.basicValidations(returnMessage, usuario, clave);
			
			if(userLogin != null && propertyService.isPropertyBelongsUser(idInmueble, usuario)){
				
				String[] urlsList = URLs.split(";");
				Photos photos=new Photos();
				HashSet<Integer> hs=new HashSet<Integer>();
				int fotosInsertadas = 0;

				for (int i=0; i < urlsList.length; i++) {

				/*Agregar cada foto para luego enviarla a gs Azure:*/
					
					Photo photo = new Photo(idInmueble,urlsList[i], new Integer(i+1).toString());
					
					if (ValidateURL.validURL(urlsList[i])){
						long start = System.currentTimeMillis();							
						photos.add(photo);
						hs.add(i+1);
						fotosInsertadas++;
						long end = System.currentTimeMillis();
						logService.appendLog("metrocuadradoWS", "Tiempo cargando foto "+(end-start)+" MS" );
					}
				}
				
				/*Colocar el xml del envio: Azure*/
				getCarga().setXmlDatos(photos.toXML());
				
				/*Enviar datos a Azure:*/
				uploadData();
				
				/*Regristrar la carga en el log:para Azure*/
				//retorno+=getCarga().toString();
				logService.appendLog("metrocuadradoWS", getCarga().toString());
				int[] fotosArr= Util.toPrimitive(hs.toArray());
				
//				TODO persistencia
//				mi.updateAprobacionesFotos(idInmueble,fotosArr,fotosInsertadas);

				returnMessage.append(fotosInsertadas).append(" links fotos insertadas");
			}else{
//				TODO Inserta registro mwsl.insertarRegistroInmueble(idInmueble, visitorId, accionPublicacion, idTipoInmueble, 
//				  seVende, seArrienda, idCiudad, caracteristicas, mensajeRetorno,
//				  "NO SE PUDO PUBLICAR");
			}
		}
		return returnMessage.toString();
	}

	/**
	 * Esta funcion es la que se publica en el WS y retorna los tipos de
	 * inmuebles
	 * 
	 * @param usuario
	 * @param clave
	 * @param pais
	 * @return
	 * @author monboh
	 * @since 12/12/2016
	 */
	public String obtenerTipoInmueble(String usuario, String clave, int pais) {

		StringBuilder returnMessage = new StringBuilder();
		validateFields.validateLoginFields(returnMessage, usuario, clave);

		if (returnMessage.toString().isEmpty() && pais == Constants.PAIS) {

			BasicValidations basicValidations = new BasicValidations();
			UserDTO userLogin = basicValidations.basicValidations(returnMessage, usuario, clave);
			
			if (userLogin != null) {
				returnMessage.append("success,true;");
				returnMessage.append(Constants.TypeProperty.typePropertytoString());
			}
		}
		System.out.println("Ingreso a método obtenerTipoInmueble");
		return returnMessage.toString();
	}

	/**
	 * Metodo que retorna las Caracteristicas por el tipo de inmueble
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 * @author monboh
	 * @since 14/08/2013
	 */
	public String obtenerCaracteristicas(String usuario, String clave,
			int tipo, int pais, int idTipoInmueble, String seVende,
			String seArrienda) {
		
		StringBuilder returnMessage = new StringBuilder();
		
		int typeBussines = validateFields.dataCompletedGetFeatures(returnMessage, usuario, clave, tipo, pais, idTipoInmueble, seVende, seArrienda);
		
		if(returnMessage.toString().isEmpty()){
			
			BasicValidations basicValidations = new BasicValidations();
			UserDTO userLogin = basicValidations.basicValidations(returnMessage, usuario, clave);
			
			if(userLogin != null){
//				TODO validar membresía
//				TODO Pedir explicación mediante property definir las caracteristicas permitidas (Excel)
//				Validar con el código antiguo
			}
		}
		System.out.println("Ingreso a método obtenerCaracteristicas");
		return returnMessage.toString();
	}

	/**
	 * Metod que retorna las ciudades activas en metrocuadrado
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 * @author monboh
	 * @since 06/12/2016
	 */
	public String obtenerCiudades(String usuario, String clave, String region) {

		StringBuilder returnMessage = new StringBuilder();
		
		validateFields.validateLoginFields(returnMessage, usuario, clave);
		
		if(returnMessage.toString().isEmpty()){
//			TODO validar la membresía
			logService.appendLog("metrocuadradoWS","Este es el valor de idRegion:::"+region+":::");
			int idRegion = Util.parseInt(region);
			String cities = cityService.getCities(idRegion);//TODO validar si es necesario normalizar la cadena
			
			if(cities != null){
				returnMessage.append("success,true;").append(cities);
			}
		}
		System.out.println("Ingreso a método obtenerCiudades");
		return returnMessage.toString();
	}

	/**
	 * Metodo que retorna los inmuebles publicados
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 * @author monboh
	 * @since 14/08/2013
	 */
	public String obtenerInmueblesPublicados(String usuario, String clave) {

		return "Ingreso a método obtenerInmueblesPublicados";
	}

	/**
	 * Retorna contactos de un inmueble
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @return
	 * @author
	 * @since
	 */
	public String obtenerContactos(String usuario, String clave,
			String idinmueble) {

		return "Ingreso a método obtenerContactos";
	}

	/**
	 * Metodo que retorna los inmuebles despublicados
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 * @author monboh
	 */
	public String obtenerInmueblesDespublicados(String usuario, String clave) {

		return "Ingreso a método obtenerInmueblesDespublicados";
	}

	/**
	 * Metodo que se utiliza para despublicar un inmueble
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @return
	 * @author monboh
	 * @since 02/12/2016
	 */

	public String despublicarInmueble(String usuario, String clave,
			String idInmueble) {

		StringBuilder returnMessage = new StringBuilder();
		
		validateFields.dataBasicCompleted(returnMessage, usuario, clave, idInmueble);
		logService.appendLog("metrocuadradoWS", "Va a despublicar el inmueble"+idInmueble);
		
		if(returnMessage.toString().isEmpty()){
			
			BasicValidations basicValidations = new BasicValidations();
			UserDTO userLogin = basicValidations.basicValidations(returnMessage, usuario, clave);
			
			if(userLogin != null && propertyService.isPropertyBelongsUser(idInmueble, usuario)){
				//TODO membresía activa
				//TODO Permisos sobre el inmueble.
				//TODO Servicio PL de despublicación
				logService.appendLog("metrocuadradoWS", "Despublicar el inmueble"+idInmueble);
				
				logService.appendLog("metrocuadradoWS", "inmueble despublicado");
				
				returnMessage.append(ManagerProperties.fileMessagesProperty("INMUEBLE_DESPUBLICADO"));
			}
		}
		return returnMessage.toString();
	}

	/**
	 *  
	 * @param usuario
	 * @param clave
	 * @return
	 * @since 14/08/2013
	 */
	public String obtenerInmueblesConFotosInsertadas(String usuario,
			String clave) {

		return "Ingreso a método obtenerInmueblesConFotosInsertadas";
	}

	/**
	 * Metodo publico para verificar la direccion de ciudades principales
	 * 
	 * @param usuario
	 * @param clave
	 * @param pais
	 * @param idCiudad
	 * @param direccion
	 * @return
	 * @author monboh
	 */

	public String validarDireccionWS2(String usuario, String clave,
			String pais, int idCiudad, String direccion) {

		return "Ingreso a método validarDireccionWS2";
	}

	/**
	 * Metodo publico para verificar la direccion de ciudades principales
	 * 
	 * @param usuario
	 * @param clave
	 * @param pais
	 * @param idCiudad
	 * @param direccion
	 * @return
	 * @author monboh
	 * @since 14/08/2013
	 */

	public String validarDireccion(String usuario, String clave, String pais,
			int idCiudad, String direccion) {

		return "Ingreso a método validarDireccion";
	}

	/**
	 * Metodo que recupera los inmuebles eliminados.
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @return
	 * @author monboh
	 * @since 02/12/2016
	 */

	public String recuperarInmuebleEliminado(String usuario, String clave,
			String idInmueble) {
		
		StringBuilder returnMessage = new StringBuilder();
		
		validateFields.dataBasicCompleted(returnMessage, usuario, clave, idInmueble);
		logService.appendLog("metrocuadradoWS", "Va a despublicar el inmueble"+idInmueble);
		
		if(returnMessage.toString().isEmpty()){
			//TODO VALIDAR QUE EL INMUEBLE LE PERTENEZCA
//			VALIDAR QUE EL INMUEBLE ESTE ELIMINADO
			
		}
		System.out.println("Ingreso a método recuperarInmuebleEliminado");
		return returnMessage.toString();
	}

	/**
	 * Metodo que retorna las regiones activas en metrocuadrado
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 * @author monboh
	 * @since 06/12/2016
	 */
	public String obtenerRegiones(String usuario, String clave) {

		StringBuilder returnMessage = new StringBuilder();
		
		logService.appendLog("metrocuadradoWS", "Va a recuparar las regiones activas en metrocuadrado");
		
		validateFields.validateLoginFields(returnMessage, usuario, clave);
		
		if(returnMessage.toString().isEmpty()){
//			TODO validar membresía.
			String regions = regionService.getRegions();//Validar si es necesario normalizar la cadena para arreglar tildes. 
			if(regions!=null){
				returnMessage.append("success,true;").append(regions);
			}
		}
		System.out.println("Ingreso a método obtenerRegiones");
		return returnMessage.toString();
	}

	/**
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @param nombre
	 * @param telefono
	 * @return
	 */
	public String asociarAgente(String usuario, String clave,
			String idInmueble, String nombre, String telefono) {

		StringBuilder returnMessage = new StringBuilder();

		validateFields.dataBasicCompleted(returnMessage, usuario, clave, idInmueble);
				
		if (returnMessage.toString().isEmpty()) {
			long agentPhone = Long.parseLong(telefono);
			// TODO VALIDAR Verificar que la membresía permita agentes inmobiliarios
			if(agentService.propertyHasAgent(idInmueble)){
				agentService.asociateAgentProperty(idInmueble, nombre, agentPhone);
				returnMessage.append("Se asocio el agente al inmueble");
			}else{
		    	agentService.updateAgentProperty(idInmueble, nombre, agentPhone);
		    	returnMessage.append("Se actualizo el agente del inmueble");
		    }
		}
		System.out.println("Ingreso a método asociarAgente");
		return returnMessage.toString();

	}

	/**
	 * 
	 * @param usuario
	 * @param clave
	 * @param idInmueble
	 * @param url
	 * @return
	 */
	public String insertarVideoInmueble(String usuario, String clave,
			String idInmueble, String url) {
		
		StringBuilder returnMessage = new StringBuilder();
		validateFields.dataCompletedURLVideo(returnMessage, usuario, clave, idInmueble, url);
		
		if(returnMessage.toString().isEmpty()){
//			TODO validar membresía
//			verificarPermisoInmueble
			Processes process = new Processes();
			returnMessage.append(process.processUrlVideo(idInmueble, url));
		}
		System.out.println("Ingreso a método insertarVideoInmueble");
		return returnMessage.toString();
	}
}