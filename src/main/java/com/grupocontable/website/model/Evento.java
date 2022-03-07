package com.grupocontable.website.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id_evento")
    Integer idEvento;

    @Column(name="nombre")
    String nombre;
    @Column(name="fecha")
    String fecha;
    @Column(name="descripcion")
    String descripcion;
    @Column(name="fotografia")
    String fotografia;
    @Column(name="fg_virtual")
    String fg_virtual;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_idusuario")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Usuario usuario;

}
