package mx.com.sw.services.cancelation;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import mx.com.sw.helpers.BuildSettings;
import mx.com.sw.services.cancelation.responses.CancelationResponse;

public class CancelationTest {
    private BuildSettings settings;
    public CancelationTest(){
        this.settings = new BuildSettings();
    }

    @Test
    public void testCancellationCSD(){
        Cancelation cancelation = new Cancelation(settings.Url, settings.User, settings.Password, null, 0);
        String csdBase64 = settings.Cer;//.Cer en Base64
        String keyBase64 = settings.Key;//.Key en Base64
        String password = settings.CerPassword;//password del CSD
        String rfc = settings.Rfc;
        String uuid = "8D93A20F-E9EF-42CA-A2B9-2986A352DCEC";
        CancelationResponse response = cancelation.cancelar(csdBase64, keyBase64, rfc, password, uuid);
        assertNotNull(response);
        assertNotNull(response.data);
        assertNotNull(response.status);
        assertTrue("success".equalsIgnoreCase(response.status));
    }
    @Test
    public void testCancellationPFX(){
        Cancelation cancelation = new Cancelation(settings.Url, settings.User, settings.Password, null, 0);
        String pfxBase64 = settings.Pfx;//.pfx en Base64
        String password = settings.CerPassword;//password del pfx
        String rfc = settings.Rfc;
        String uuid = "8D93A20F-E9EF-42CA-A2B9-2986A352DCEC";
        CancelationResponse response = cancelation.cancelar(pfxBase64, rfc, password, uuid);
        assertNotNull(response);
        assertNotNull(response.data);
        assertNotNull(response.status);
        assertTrue("success".equalsIgnoreCase(response.status));
    }
    @Test
    public void testCancellationXML(){
        Cancelation cancelation = new Cancelation(settings.Url, settings.User, settings.Password, null, 0);
        String xmlCancelation = settings.Acuse;//Xml cancelation
        CancelationResponse response = cancelation.cancelar(xmlCancelation);
        assertNotNull(response);
        assertNotNull(response.data);
        assertNotNull(response.status);
        assertTrue("success".equalsIgnoreCase(response.status));
    }
    @Test
    public void testCancellationUUID(){
        Cancelation cancelation = new Cancelation(settings.Url, settings.User, settings.Password, null, 0);
        String rfc = settings.Rfc;
        String uuid = "8D93A20F-E9EF-42CA-A2B9-2986A352DCEC";
        CancelationResponse response = cancelation.cancelar(rfc, uuid);
        assertNotNull(response);
        assertNotNull(response.data);
        assertNotNull(response.status);
        assertTrue("success".equalsIgnoreCase(response.status));
    }
}