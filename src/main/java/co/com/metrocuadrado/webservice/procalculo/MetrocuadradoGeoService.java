/**
 * MetrocuadradoGeoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.metrocuadrado.webservice.procalculo;

public interface MetrocuadradoGeoService extends java.rmi.Remote {
    public co.com.metrocuadrado.webservice.procalculo.InmuebleUbicadoDTO ubicarInmuebleSinGuardarEnBd(java.lang.String codigoInmueble, java.lang.String direccion, java.lang.Integer municipio) throws java.rmi.RemoteException, co.com.metrocuadrado.webservice.procalculo.MetrocuadradoServiceException;
    public co.com.metrocuadrado.webservice.procalculo.InmuebleUbicadoDTO ubicarInmueble(java.lang.String codigoInmueble, java.lang.String direccion, java.lang.Integer municipio) throws java.rmi.RemoteException, co.com.metrocuadrado.webservice.procalculo.MetrocuadradoServiceException;
}
