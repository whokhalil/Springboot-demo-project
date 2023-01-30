package com.client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProjectController {
@Autowired
    private ClientInterface ci;
    @PostMapping("/add")
    public void add(@RequestBody Client client){
        this.ci.add(client);

    }

    @PutMapping("/update")
    public Client update(@RequestBody Client client){
       return this.ci.update(client);

    }
    @GetMapping("/get")
    public ArrayList<Client> get(){
        return this.ci.get();
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        return this.ci.delete(Integer.parseInt(id));
    }
}
