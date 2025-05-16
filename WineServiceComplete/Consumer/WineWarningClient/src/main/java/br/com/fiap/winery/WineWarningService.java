package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WineWarningService {
    @WebMethod
    String sendWarn();
}
