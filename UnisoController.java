package br.uniso;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/uniso/")
public class UnisoController {

    @GetMapping
    @RequestMapping("hello")
    public String helloWorld(){
        return "Viva a Uniso!";
    }

}