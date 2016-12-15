package co.com.metrocuadrado.webservice.client;

/**
 *
 * @author Jaime Alfredo Bonilla Perez jaimebp@gmail.com
 */

public class WscargaMasivaImagenesSoapProxy implements co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesSoap {
  private String _endpoint = null;
  private co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesSoap wscargaMasivaImagenesSoap = null;
  
  public WscargaMasivaImagenesSoapProxy() {
    _initWscargaMasivaImagenesSoapProxy();
  }
  
  public WscargaMasivaImagenesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWscargaMasivaImagenesSoapProxy();
  }
  
  private void _initWscargaMasivaImagenesSoapProxy() {
    try {
      wscargaMasivaImagenesSoap = (new co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesLocator()).getWscargaMasivaImagenesSoap();
      if (wscargaMasivaImagenesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wscargaMasivaImagenesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wscargaMasivaImagenesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wscargaMasivaImagenesSoap != null)
      ((javax.xml.rpc.Stub)wscargaMasivaImagenesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.metrocuadrado.webservice.client.WscargaMasivaImagenesSoap getWscargaMasivaImagenesSoap() {
    if (wscargaMasivaImagenesSoap == null)
      _initWscargaMasivaImagenesSoapProxy();
    return wscargaMasivaImagenesSoap;
  }
  
  public java.lang.String redimensionarImagenesOnline(java.lang.String idPortal, java.lang.String fechaCreacion, java.lang.String token, java.lang.String operacion, java.lang.String xmlDatos, java.lang.String contenedor) throws java.rmi.RemoteException{
    if (wscargaMasivaImagenesSoap == null)
      _initWscargaMasivaImagenesSoapProxy();
    return wscargaMasivaImagenesSoap.redimensionarImagenesOnline(idPortal, fechaCreacion, token, operacion, xmlDatos, contenedor);
  }
  
  public java.lang.String redimensionarImagenesOnlineUrl(java.lang.String idPortal, java.lang.String fechaCreacion, java.lang.String token, java.lang.String operacion, java.lang.String urlFileXmlDatos, java.lang.String contenedor) throws java.rmi.RemoteException{
    if (wscargaMasivaImagenesSoap == null)
      _initWscargaMasivaImagenesSoapProxy();
    return wscargaMasivaImagenesSoap.redimensionarImagenesOnlineUrl(idPortal, fechaCreacion, token, operacion, urlFileXmlDatos, contenedor);
  }
  
  
}