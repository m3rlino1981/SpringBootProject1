package it.belli.demo.controller.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/main")
public class MainController {
 
 
 
    @GetMapping("/ciao")
    public ResponseEntity<?> helloWorld() {
    	return ResponseEntity.ok().body("{ \"HelloWorld\":\"1\"}");
    }
 
  
}