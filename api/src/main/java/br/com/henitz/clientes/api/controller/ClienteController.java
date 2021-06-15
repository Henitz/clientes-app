package br.com.henitz.clientes.api.controller;

import br.com.henitz.clientes.api.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @GetMapping
    public List<Cliente> getAll(){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Henrique");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("André");

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Maria");

        return Arrays.asList(cliente1, cliente2, cliente3);
    }



    public String postExample(){
        return "Chamou um post";
    }
}
