package efp.ret.consulta;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsultaTrabajadorClienteApplication {
	
	static String url = "http://localhost:8080/consulta";
	static String curp;
	static String nss;	

	public static void main(String[] args) {
		curp = args[0];
		nss  = args[1];
		
		Request solicitud = new Request();
		
		solicitud.setCurp(curp);
		solicitud.setNss(nss);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		RestTemplate restTemplate = new RestTemplate();
		
        HttpEntity<Request> entidad = new HttpEntity<Request>(solicitud,headers);
		
		System.out.println(entidad.toString());
		System.out.println("-------------------");
		
		ResponseEntity<Response> respuesta = restTemplate.postForEntity(url,entidad,Response.class);
		
		System.out.println("Respuesta HTTP: "+respuesta.getStatusCode());
		System.out.println(respuesta.toString());
		
		System.out.println("CURP: "+respuesta.getBody().getCurp());
		System.out.println("REGIMEN: "+respuesta.getBody().getRegimen());
		System.out.println("NSS: "+respuesta.getBody().getNti());
		System.out.println("DIAGNOSTICO: "+respuesta.getBody().getDiagnostico());
		System.out.println("DESC_DIAGNOSTICO: "+respuesta.getBody().getDescDiagnostico());
	}

}
