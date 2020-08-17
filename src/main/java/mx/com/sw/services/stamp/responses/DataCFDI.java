package mx.com.sw.services.stamp.responses;

/**
* DataCFDI
* Clase que contiene información acerca del timbrado.
* <p>
* <b>Nota:</b> Este campo puede ser null cuando ha surgido un error.
* @author  Juan Gamez
* @version 0.0.0.1
* @since   2020-08-01
*/
public class DataCFDI {
    private String cfdi;

    /**
     * Constructor de la clase.
     * @param cfdi String cfdi.
     */
    public DataCFDI(String cfdi) {
        this.cfdi = cfdi;
    }

    /**
     * Obtiene el XML del cfdi timbrado.
     * @return String
     */
    public String getCFDI() {
        return this.cfdi;
    }
}
