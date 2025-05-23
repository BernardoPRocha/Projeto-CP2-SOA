package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://winery.fiap.br/", "WineStockServiceImplementationService");

        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);

        String order = wineStockService.placeOrder("Merlot", 3);
        System.out.println("Resposta do pedido: " + order);

        URL url2 = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName2 = new QName("http://winery.fiap.br/", "WineWarningServiceImplementationService");

        Service service2 = Service.create(url2, qName2);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();
        System.out.println("Aviso recebido: " + warn);
    }
}
