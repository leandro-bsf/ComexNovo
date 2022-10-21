package br.com.comex.ws;


import javax.xml.ws.Endpoint;

public class MainComexWs {

	

	public static void main(String[] args) {
		String url = "http://localhost:8080/ComexWs";
		ComexWs service = new ComexWs();
		
		System.out.println("Servico Rodando" + url + "?wsdl");
		Endpoint.publish(url, service);
		//http://localhost:8080/ComexWs?wsdl
	}

}
