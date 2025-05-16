package br.com.fiap.winery;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WineStockService {
    @WebMethod
    String getMenu();

    @WebMethod
    String placeOrder(String name, int quantity);
}
