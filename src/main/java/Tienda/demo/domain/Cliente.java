
package Tienda.demo.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idcliente;
     private String nombre;
     private String apellido;
     private String correo;
     private String telefono; 
@JoinColumn(name="id_credito",referencedColumnName="id_credito")
@ManyToOne
private Credito credito;
    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String correo, String telefono, Credito credito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.credito = credito;
    }

 
    
}
