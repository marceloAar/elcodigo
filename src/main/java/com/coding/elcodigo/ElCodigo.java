//Marcelo Aceituno R
//Full Stack JAVA 0034
//El Codigo
package com.coding.elcodigo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ElCodigo {
	
	
	@RequestMapping("/")
    public String inicio() {
      
      return "index.jsp";
    }
	
	@RequestMapping(value="/codigo", method=RequestMethod.POST)
	public String login(@RequestParam(value="codigo") String codigo) {
		
		String clave = "bushido";
		if (codigo.equalsIgnoreCase(clave)){
			return "codigo.jsp";
		}else {
			return "redirect:/crearError";
		}
		
	}
	
	@RequestMapping("/crearError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "!! Entrena Más Duro !!");
        return "redirect:/";
	}
	
	

}
