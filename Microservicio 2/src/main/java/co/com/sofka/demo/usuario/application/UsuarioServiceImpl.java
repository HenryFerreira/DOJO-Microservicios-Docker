package co.com.sofka.demo.usuario.application;

import co.com.sofka.demo.usuario.domain.Usuario;
import co.com.sofka.demo.usuario.infraestructure.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository repository;

    @Override
    public Flux<Usuario> findAll() {
        return this.repository.findAll();
    }
}
