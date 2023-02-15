package crud.crudoperation;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class service {

   private static CrudInterface crudinterface;
    public service(CrudInterface crudinterfaces) {
        this.crudinterface=crudinterfaces;
    }
    public Iterable<CrudDAO> getData(){
        return crudinterface.findAll();
    }
    public Iterable<CrudDAO> insertAll(int id, String name, String email){
        CrudDAO cruddao=new CrudDAO();
        cruddao.setId(id);
        cruddao.setName(name);
        cruddao.setEmail(email);
        return Collections.singleton(crudinterface.save(cruddao));
    }

    public static String deleteData(int id){
        CrudDAO cruddao=new CrudDAO();
        cruddao.setId(id);
        crudinterface.delete(cruddao);
        return "true";
    }
}
