package co.com.sofka.demo.usuario.infraestructure;

import co.com.sofka.demo.usuario.application.UsuarioService;
import co.com.sofka.demo.usuario.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping(value = "/usuario")
    private Flux<Usuario> findAll() {
        return this.service.findAll();
    }

}
