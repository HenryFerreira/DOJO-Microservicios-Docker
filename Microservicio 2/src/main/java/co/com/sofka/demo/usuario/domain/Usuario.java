package co.com.sofka.demo.usuario.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document("usuarios")
public class Usuario {
    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String nombre;
    private String celular;
    private String documentoIdentidad;

    public Usuario(String id, String nombre, String celular, String documentoIdentidad) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", celular='" + celular + '\'' +
                ", documentoIdentidad='" + documentoIdentidad + '\'' +
                '}';
    }
}
