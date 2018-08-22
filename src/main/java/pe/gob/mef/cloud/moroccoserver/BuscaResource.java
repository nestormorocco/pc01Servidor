package pe.gob.mef.cloud.moroccoserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/busca/server/{codigo}")
public class BuscaResource {	

	@GetMapping
	public String busca(@PathVariable("codigo") int codigo) { 
		if (codigo == 1) {
			return "juan";
		} else if (codigo == 2) {
			return "carlos";
		} else {
			return "no encontrado";
		}
		
	}
}
