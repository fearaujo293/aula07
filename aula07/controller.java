package API.Atila;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Atila")

public class controller {
	
	@GetMapping	
	public String mensagem() {
		return "Bom dia professor Atila de boa?";
		
	}
}


