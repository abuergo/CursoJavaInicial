package com.abuergo.productoservice.controller;


import com.abuergo.productoservice.dto.ProductoDTO;
import org.springframework.web.bind.annotation.*;

// Lo que se define aca se va a exponer afuera, con la url del path definido
@RestController
@RequestMapping(path = "/api/producto")

public class ProductoController {


    // Agrego la notacion de spring para que pueda acceder desde una aplicacion, a este metodo
    @GetMapping("/")
    public String getAll(){
        return "Hola mundo";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id){
        return "Hola mundo con id " + id;
    }

    @PostMapping("/")
    public String crear(@RequestBody ProductoDTO nuevoProducto){
        return "Nombre del producto : " + nuevoProducto.getNombre();
    }

    // le pedimos el id del objeto a actualizar
    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody ProductoDTO productoActualizado){
        return "Producto actualizado : " + productoActualizado.getNombre() + " : " + productoActualizado.getPrecio();
    }






}
