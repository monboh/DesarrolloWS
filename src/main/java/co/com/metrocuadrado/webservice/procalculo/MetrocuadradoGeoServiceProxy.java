package co.com.metrocuadrado.webservice.procalculo;

public class MetrocuadradoGeoServiceProxy implements co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService {
  private String _endpoint = null;
  private co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService metrocuadradoGeoService = null;
  
  public MetrocuadradoGeoServiceProxy() {
    _initMetrocuadradoGeoServiceProxy();
  }
  
  public MetrocuadradoGeoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMetrocuadradoGeoServiceProxy();
  }
  
  private void _initMetrocuadradoGeoServiceProxy() {
    try {
      metrocuadradoGeoService = (new co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoServiceServiceLocator()).getmetrocuadradoGeoServicePort();
      if (metrocuadradoGeoService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)metrocuadradoGeoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)metrocuadradoGeoService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (metrocuadradoGeoService != null)
      ((javax.xml.rpc.Stub)metrocuadradoGeoService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.metrocuadrado.webservice.procalculo.MetrocuadradoGeoService getMetrocuadradoGeoService() {
    if (metrocuadradoGeoService == null)
      _initMetrocuadradoGeoServiceProxy();
    return metrocuadradoGeoService;
  }
  
  public co.com.metrocuadrado.webservice.procalculo.InmuebleUbicadoDTO ubicarInmuebleSinGuardarEnBd(java.lang.String codigoInmueble, java.lang.String direccion, java.lang.Integer municipio) throws java.rmi.RemoteException, co.com.metrocuadrado.webservice.procalculo.MetrocuadradoServiceException{
    if (metrocuadradoGeoService == null)
      _initMetrocuadradoGeoServiceProxy();
    return metrocuadradoGeoService.ubicarInmuebleSinGuardarEnBd(codigoInmueble, direccion, municipio);
  }
  
  public co.com.metrocuadrado.webservice.procalculo.InmuebleUbicadoDTO ubicarInmueble(java.lang.String codigoInmueble, java.lang.String direccion, java.lang.Integer municipio) throws java.rmi.RemoteException, co.com.metrocuadrado.webservice.procalculo.MetrocuadradoServiceException{
    if (metrocuadradoGeoService == null)
      _initMetrocuadradoGeoServiceProxy();
    return metrocuadradoGeoService.ubicarInmueble(codigoInmueble, direccion, municipio);
  }
  
  
}