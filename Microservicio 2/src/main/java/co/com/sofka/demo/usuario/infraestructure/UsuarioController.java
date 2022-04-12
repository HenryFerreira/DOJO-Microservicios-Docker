package co.com.sofka.demo.usuario.infraestructure;

import co.com.sofka.demo.usuario.application.UsuarioService;
import co.com.sofka.demo.usuario.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping("/crear")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Usuario> create(@RequestBody Usuario usuario){
        return this.service.crearUsuario(usuario);
    }

    @GetMapping(value = "/cliente")
    private Flux<Usuario> findAll() {
        return this.service.findAll();
    }

}
