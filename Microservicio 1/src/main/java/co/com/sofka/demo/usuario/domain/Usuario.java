package co.com.sofka.demo.usuario.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document(collation = "usuarios")
public class Usuario {
    @Id
    private String clienteID = UUID.randomUUID().toString().substring(0, 10);
    private String nombre;
    private String celular;
    private String documentoIdentidad;

    public Usuario(String clienteID, String nombre, String celular, String documentoIdentidad) {
        this.clienteID = clienteID;
        this.nombre = nombre;
        this.celular = celular;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getClienteID() {
        return clienteID;
    }

    public void setClienteID(String clienteID) {
        this.clienteID = clienteID;
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
}
