package pe.gob.mef.cloud.moroccoserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/hola/server")
public class HolaResource {
	
	
	@GetMapping
	public String hola() {
		return "Hola CJAVA desde el servidor";
	}	

}
