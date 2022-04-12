package co.com.sofka.demo.usuario.infraestructure;

import co.com.sofka.demo.usuario.domain.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UsuarioRepository extends ReactiveMongoRepository<Usuario, String>{

}
