package mx.com.sw.services.cancelation.responses;

import mx.com.sw.entities.IResponse;

/**
 * <h1>CancelationResponse</h1> Respuesta de cancelación con la información de la misma.
 * @author Juan Gamez
 * @version 0.0.0.1
 * @since 2020-08-01
 */
public class CancelationResponse extends IResponse {
    /**
     * Datos de la cancelación cuando está fue "success".
     */
    public CancelationData data;
}
