package com.guilhermevilela.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author: Guilherme Vilela
 * @version: 1.0.0
 */

/*
 * Inserindo dependencias do controlador Rest
 * Inserindo o Endpoint categorias
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	/*
	 * Mapeando requisições do tipo GET
	 */
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando!";
	}

}
