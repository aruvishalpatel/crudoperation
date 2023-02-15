package crud.crudoperation;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crudController {
    private service servicecall;
    public crudController(service serv){
        this.servicecall=serv;
    }
    @GetMapping("/")
    public static String defoult(){
        System.out.println("Hello crud: ");
        return "Hello crud: ";
    }
    @GetMapping("/getdata")
    public Iterable<CrudDAO> userData(){
        return  servicecall.getData();
    }

    @GetMapping("/delete")
    public String delete(HttpServletRequest request){
        return service.deleteData(Integer.parseInt(request.getParameter("id")));
    }
    @GetMapping("/insertdata")
    public Iterable<CrudDAO> insertData(HttpServletRequest request,HttpServletResponse response){
        return servicecall.insertAll(Integer.parseInt(request.getParameter("id")),request.getParameter("name"),request.getParameter("email"));
    }


}


