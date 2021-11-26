package co.com.sofka.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list(){
        return service.list();
    }
    @PostMapping(value = "api/{id}/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }
    @PutMapping(value = "api/{id}/todo")
    public Todo update(@RequestBody Todo todo) {
        if (todo.getId() != null) {
            return service.save(todo);
        } else {
            throw new RuntimeException("No existe el id para actualizar");
        }
    }
    @DeleteMapping(value ="api/{id}/todo")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @GetMapping(value = "api/{id}/todo")
    public Todo get(@PathVariable("id") Long id){
        return service.get(id);
    }

}
