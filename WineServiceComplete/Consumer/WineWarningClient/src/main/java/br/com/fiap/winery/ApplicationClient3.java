package br.com.fiap.winery;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ApplicationClient3 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");

        Service service = Service.create(url, qName);
        WineWarningService wineWarningService = service.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();
        System.out.println("Aviso do servidor:");
        System.out.println(warn);
    }
}
