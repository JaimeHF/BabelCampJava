package es.curso.modelo.controlador;

import es.curso.modelo.entidad.Juego;
import es.curso.modelo.persistencia.DaoJuego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ControladorJuego {

    @Autowired
    private DaoJuego dj;


    @GetMapping(path="juegos/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Juego> getJuego(@PathVariable("id") int id){
        System.out.println("Buscando juego con id: " + id);
        Juego j=dj.get(id);
        if(j!=null){
            return new ResponseEntity<Juego>(j, HttpStatus.OK);
        }else{
            return new ResponseEntity<Juego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
        }
    }

    @PostMapping(path = "juegos",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Juego> altaJuego(@RequestBody Juego j){
        System.out.println("altaJuego: objeto Juego: " + j);
        dj.add(j);
        return new ResponseEntity<Juego>(j,HttpStatus.CREATED);
    }

    @DeleteMapping(path = "juegos/{id}")
    public ResponseEntity<Juego> borrarJuego(@PathVariable int id){
        System.out.println("ID a borrar: " + id);
        Juego j=dj.delete(id);
        if(j!=null){
            return new ResponseEntity<Juego>(j, HttpStatus.OK);
        }else{
            return new ResponseEntity<Juego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
        }
    }

    @PutMapping(path = "juegos/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Juego> modificarJuego(@PathVariable("id") int id, @RequestBody Juego j){
        System.out.println("ID a modificar: " + id);
        System.out.println("Datos a modificar: " + j);
        j.setId(id);
        Juego jUpdate = dj.update(j);
        if(j!=null){
            return new ResponseEntity<Juego>(j, HttpStatus.OK);
        }else{
            return new ResponseEntity<Juego>(HttpStatus.NOT_FOUND);//404 NOT FOUND
        }
    }


    @GetMapping(path = "juegos",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Juego>> listaJuegos(@RequestParam(name="nombre",required=false) String nombre,
                                                   @RequestParam(name="compania",required=false) String compa){

        List<Juego> listaJuegos = null;
        if(nombre==null&&compa==null){
            System.out.println("Listando los juegos");
            listaJuegos = dj.list();
        }else if(nombre==null){
            System.out.println("Listando los juegos de la compañia: "+compa);
            listaJuegos=dj.listByCompani(compa);

        }else{
            System.out.println("Listando los juegos de nombre: "+nombre);
            listaJuegos=dj.listByName(nombre);
        }
        System.out.println(listaJuegos);
        return new ResponseEntity<List<Juego>>(listaJuegos,HttpStatus.OK);
    }

    @GetMapping(path = "precio",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> precioJuegos(){
        List<String> listaJuegos = null;
        listaJuegos=dj.precios();
        return  new ResponseEntity<List<String>>(listaJuegos,HttpStatus.OK);
    }
 }
