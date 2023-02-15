package crud.crudoperation;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@Table(schema = "crudschema",name="user")
//@Table(schema="crudschema",name="user")
public class CrudDAO {


    @Id
    @Column(name="id")
    private int id;
    @Column(name="username")
    private String name;
    @Column(name="email")
    private String email;


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }



}
