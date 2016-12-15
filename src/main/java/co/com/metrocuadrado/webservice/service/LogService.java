package co.com.metrocuadrado.webservice.service;


public interface LogService {
	
	/**
	 * 
	 */
	public void writeLog();
	
	/**
	 * 
	 */
	void appendLog(String logname, String message);
	
	/**
	 * 
	 * @param action
	 * @param features
	 * @param status
	 * @param idProperty
	 * @param idtypeProperty
	 * @param message
	 * @param forSale
	 * @param forRent
	 * @param visitorid
	 */
	void writeLog(String action, String features, String status, String idProperty, int idtypeProperty, 
			String message, String forSale, String forRent, int visitorid);
	
	
	
	

}
