package com.guilhermevilela.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermevilela.cursomc.domain.Categoria;

/*
 * @author Guilherme Vilela
 * @version 1.0.0
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
	public List<Categoria> listar() {
		
		Categoria categoria1 = new Categoria(1, "informática");
		Categoria categoria2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(categoria1);
		lista.add(categoria2);
		
		return lista;
	}

}
