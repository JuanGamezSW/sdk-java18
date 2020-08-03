package mx.com.sw.services.stamp.responses;

import mx.com.sw.entities.IResponse;

/**
* <h1>StampResponseV3</h1>
* Clase que contiene información acerca del timbrado con datos versión 3.
* <p>
* <b>Nota:</b> Se recomienda revisar el campo "getStatus()" para saber si el campo "getData()" contiene datos o en
* su lugar mirar los mensajes de error, los cuales están contenidos en los campos "getMessage()" y "getMessageDetail()".
* @author  Juan Gamez
* @version 0.0.0.1
* @since   2020-08-01
*/
public class StampResponseV3 extends IResponse {
    private DataCFDI data;

    /**
     * Constructor de la clase.
     * @param status
     * @param message
     * @param messageDetail
     * @param data
     */
    public StampResponseV3(String status, String message, String messageDetail, DataCFDI data) {
        super(status, message, messageDetail);
        this.data = data;
    }

    /**
     * Obtiene los datos del cfdi timbrado.
     * <b>Nota:</b> Este valor puede ser null cuando
     * termino con status "error" la petición.
     */
    public DataCFDI getData() {
        return this.data;
    }
}
