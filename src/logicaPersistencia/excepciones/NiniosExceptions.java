package logicaPersistencia.excepciones;

public class NiniosExceptions {
	private int codigoError;

	public NiniosExceptions(int cod) {
		codigoError = cod;
	}

	public String getMensajePersistenciaExcep() {
		String mensaje = "";

		switch (codigoError) {
		case 1:
			mensaje = "El niño ya existe";
			break;
		case 2:
			mensaje = "El niño no existe";
			break;
		case 3:
			mensaje  = "";
			break;
		default:
			mensaje = "Error no especificado";
		}
		
		return mensaje;
	}
}
