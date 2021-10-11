
package com.prueba.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hola") 
public class PruebaControlador {
    
    @GetMapping
    public String hola(){
        return "hola mundo oracle";
    } 
    
}
