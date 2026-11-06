package com.netflix.rest;

import com.netflix.dao.FilmDao;
import com.netflix.dao.FilmDaoImpl;
import com.netflix.model.Film;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FilmWS")
public class FilmWS {

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Film f){

        FilmDao fD= new FilmDaoImpl();
        fD.save(f);

        return new ResponseEntity<String>("Inserimento effettuato", HttpStatus.OK);


    }
   @GetMapping
    public ResponseEntity<List<Film>> serch(@RequestParam String regista){
        FilmDao fD= new FilmDaoImpl();

        List<Film> res= fD.search(regista);

        return new ResponseEntity<List<Film>>(res, HttpStatus.OK);
    }
}
