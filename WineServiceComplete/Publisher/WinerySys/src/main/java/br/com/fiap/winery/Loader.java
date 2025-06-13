package br.com.fiap.winery;

import javax.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);

        System.out.println("Serviços publicados:");
        System.out.println("http://localhost:8085/WineStockService?wsdl");
        System.out.println("http://localhost:8086/WineWarningService?wsdl");
    }
}
