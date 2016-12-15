package co.com.metrocuadrado.webservice.service;

import co.com.metrocuadrado.webservice.model.Inmueble;

public interface PropertyService {

/**
 * Retorna el inmueble a partir del id inmueble.
 * @param idProperty
 * @return
 */
	public Inmueble consultProperty(String idProperty);
	
	
	public Inmueble propertyBelongsUser(String idProperty, String user);
	
	public boolean isPropertyBelongsUser(String idProperty, String user);
}
