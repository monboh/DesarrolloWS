package co.com.metrocuadrado.webservice.commons.constants;

public interface Constants {

	static final int PAIS = 1;
	/**
	 * Ciudades principales manejadas por metrocuadrado.
	 * @author monboh
	 *
	 */
	public static enum PrincipalCity {

		ARMENIA(11, "Armenia"), BARRANQUILLA(5, "Barranquilla"), BOGOTA(1,
				"Bogotá D.C."), BUCARAMANGA(6, "Bucaramanga"), CALI(4, "Cali"), CARTAGENA(
				7, "Cartagena de Indias"), MANIZALEZ(9, "Manizalez"), MEDELLIN(
				3, "Medellín"), PEREIRA(10, "Pereira"), SANTAMARTA(15,
				"Santa Marta");

		private int id;
		private String name;

		PrincipalCity(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public int getId() {
			return id;
		}

		public static PrincipalCity contains(int id) {
			for (PrincipalCity city : PrincipalCity.values())
				if (city.id == id)
					return city;
			return null;
		}
	}
	
	/**
	 * Acciones que puede solicitarse en procesar inmueble.
	 * @author monboh
	 *
	 */
	public static enum Action{
		PUBLICAR, ACTUALIZAR, DESPUBLICAR
	}
	
	/**
	 * Tipo de inmueble que maneja metrocuadrado.
	 * @author monboh
	 *
	 */
	public static enum TypeProperty{
		APARTAMENTO(1,"Apartamento"), CASA(2,"Casa"), OFICINA(3,"Oficina"), LOTE(4,"Lote o Casalote"),
		CONSULTORIO(5,"Consultorio"), LOCAL(6,"Local Comercial"), FINCA(7, "Finca"), BODEGA(8, "Bodega"),
		EDIFICIOAP(9,"Edificio de Apartamentos"), EDIFICIOOFI(10,"Edificio de Oficinas"), APARTAHOTEL(12,"Apartahoteles");
		
		private int id;
		private String name;
		
		private TypeProperty(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}

		public static TypeProperty containsID(int id) {
			for (TypeProperty type : TypeProperty.values())
				if (type.id == id)
					return type;
			return null;
		}
		
		public static TypeProperty containsName(String name) {
			for (TypeProperty type : TypeProperty.values())
				if (type.name.equals(name))
					return type;
			return null;
		}
		
		public static String typePropertytoString() {
			
			StringBuilder sb = new StringBuilder();
			
			for (TypeProperty type : TypeProperty.values()) {
				sb.append(type.name).append(",").append(type.id).append(";");
			}
			return sb.toString();
		}
	}
	
	public static enum TimeBuild{
		
		SOBREPLANO(1,"Sobre Plano"), ENCONSTRUCCION(2,"En Construcción"), PARAESTRENAR(3,"Para Estrenar"),
		REMODELADO(4,"Remodelado"), ENTRE0Y5ANOS(5,"Entre 0 y 5 a\u00f1os"), ENTRE5Y10ANOS(6, "Entre 5 y 10 a\u00f1os"),
		ENTRE10Y20ANOS(7,"Entre 10 y 20 a\u00f1os"), MASDE20ANOS(8,"M\u00e1s de 20 a\u00f1os") ;
	
		private int id;
		private String name;
		
		private TimeBuild(int id, String name){
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public static TimeBuild containsID(int id) {
			for (TimeBuild timeBuild : TimeBuild.values())
				if (timeBuild.id == id)
					return timeBuild;
			return null;
		}
		
		public static TimeBuild containsName(String name) {
			for (TimeBuild timeBuild : TimeBuild.values())
				if (timeBuild.name.equals(name))
					return timeBuild;
			return null;
		}
	}
	
	public static enum TypeFeatures{
//		GENERAL(1,)
	}
}
