package co.com.metrocuadrado.webservice;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import co.com.pragma.pjr.servlet.PragmaDBServlet;

public class DBPoolInitializer extends PragmaDBServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Retorna el nombre del pool que se debe utilizar para obtener las
	 * conexiones.
	 */
	@Override
	protected String getPoolName() {
		return "m2";
	}

	public String getProjectId() {

		return "metrocuadrado.portal";

	}

	@Override
	public void init(ServletConfig initParam) throws ServletException {

		try {
			
			super.init(initParam);
			
		} catch (Throwable e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
