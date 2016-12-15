package co.com.metrocuadrado.webservice;

import java.sql.Connection;
import java.util.HashMap;

import co.com.m2.services.inmuebles.SingletonWS;
import co.com.pragma.pjr.db.JDBCConnectionManager;
import co.com.pragma.pjr.util.Log;
import co.com.pragma.pjr.util.PJRString;
import co.com.pragma.pjr.util.ProjectsManager;

/**
 * <p>
 * Title: Proyecto Metrocuadrado.com
 * </p>
 * <p>
 * Description: Web Service Procalculo Metrouadrado.com
 * </p>
 * <p>
 * Copyright: Copyright (c) 2011
 * </p>
 * <p>
 * Company: Metrocuadrado.com
 * </p>
 * 
 * @author Carlos Mario Quintero Abuchar
 * @version 1.0
 */

public class ProcalculoWS {

	private Connection connection = null;

	private Connection getConeccion() {
		Connection c = null;
		try {
			c = getConnection();
		} catch (Exception ex) {
		}
		return c;
	}

	/**
	 * Retorna el nombre del pool que se debe utilizar para obtener las
	 * conexiones.
	 */
	public String getPoolName() {
		return "m2";
	}

	public String getProjectId() {

		return "metrocuadrado.portal";

	}

	private void setPuedeEnviar(boolean enviar) {
		SingletonWS s1 = SingletonWS.getInstance();
		s1.setPuedeEnviar(enviar);
	}

	private void insertarPeticion() {
		SingletonWS s1 = SingletonWS.getInstance();
		s1.insertarPeticion();
		// appendLog("webservicemetro",
		// "ocupando: numero de peticiones actuales:"+
		// String.valueOf(getPeticionesActuales()));
	}

	private void liberarPeticion() {
		SingletonWS s1 = SingletonWS.getInstance();
		s1.liberarPeticion();
		// appendLog("webservicemetro","liberando: numero de peticiones actuales:"+
		// String.valueOf(getPeticionesActuales()));
	}

	public String prueba() {
		appendLog("wsprocalculo", "va a insertar peticion");
		return "prueba procalculo service 2";
	}

	private int getPeticionesActuales() {
		SingletonWS s1 = SingletonWS.getInstance();
		return s1.getPeticionesActuales();
	}

	/**
	 * Semaforo para enviar inmuebles en lote
	 * 
	 * @return
	 */
	public boolean puedeEnviar() {
		SingletonWS s1 = SingletonWS.getInstance();
		return s1.puedeEnviar();
	}

	/*
	 * private void publicarInmueble(String idInmueble) throws Exception {
	 * 
	 * MInmuebles mi = new MInmuebles(connection);
	 * mi.ponerEnPublicacion(idInmueble); // pone el inmueble //
	 * enPublicacion='S' mi.publicar(idInmueble, false); }
	 */

	/**
	 * Esta funcion retorna las ciudades registradas
	 * 
	 * @param pais
	 *            id del pais a buscar
	 * @return Hashmap con los ids y los nombres de los tipo de inmueble
	 * @throws Exception
	 */
	private HashMap obtenerCiudades() throws Exception {
		return null;
	}

	/**
	 * Esta funcion es la que se publica en el WS y retorna las ciudades
	 * 
	 * @param usuario
	 *            usuario registrado en el sistema
	 * @param clave
	 *            clave del usuario registrado en el sistema
	 * @return String con la informacion de las ciudades activas en el sistena
	 * @throws Exception
	 */
	public String obtenerCiudades(String usuario, String clave) {

		return "M�todo ObtenerCiudades";
	}

	/**
	 * Reemplaza las tildes en una cadena
	 * 
	 * @param cadena
	 * 
	 *            cadena a reemplazar
	 * @return
	 */
	private String normalizarCadena(String cadena) {

		return PJRString.replaceIgnoreCase(
				PJRString.replaceIgnoreCase(PJRString.

				replaceIgnoreCase(PJRString.replaceIgnoreCase(PJRString.

				replaceIgnoreCase(
						PJRString.replaceIgnoreCase(cadena, "ñ", "ni"), "ú",

						"u"), "ó", "o"), "í", "i"), "é", "e"), "á", "a");

	}

	// /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	protected final Connection getConnection() throws Exception {
		return JDBCConnectionManager.getConnection(getFullPoolName());
	}

	protected final String getFullPoolName() {
		return getProjectId() + "." + getPoolName();
	}

	protected void appendLog(String logname, String message) {
		Log.append(getProjectId(), logname, message);
	}

	protected final String getProperty(String properties, String property) {
		return ProjectsManager
				.getProperty(getProjectId(), properties, property);
	}

	protected final String getProperty(String property) {
		return ProjectsManager.getProperty(getProjectId(), getProjectId(),
				property);
	}

	protected void releaseConnection(Connection c) throws Exception {
		JDBCConnectionManager.releaseConnection(getFullPoolName(), c);
	}

	public String actualizarInmueble(String idInmueble, int ciudad, int zona,
			int sector, double latitud, double longitud, String barrio,
			String direccionEstandar, int estrato) throws Exception {
		return "M�todo actualizarInmueble";

	}

	public String actualizarInmueble2(String idInmueble, int ciudad, int zona,
			int sector, int latitud, int longitud, String barrio,
			String direccionEstandar, int estrato) throws Exception {

		return "Inmueble actualizarInmueble2";

	}

	public String consultarClaveTemporal(String idInmueble) throws Exception {
		return "M�todo consultarClaveTemporal";
	}

}
