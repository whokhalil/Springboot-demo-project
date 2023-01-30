package com.client.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ClientInterfaceImpl implements ClientInterface{
@Autowired
    private jpaDemo jp;
    @Override
    public String delete(int id) {
        if(jp.findById(id) != null) {
            jp.delete(jp.findById(id).get());
            return "Successfully deleted";
        }
        else{
            return "Error occured";
        }
    }

    @Override
    public ArrayList<Client> get() {
       return (ArrayList<Client>) jp.findAll();
    }

    @Override
    public Client update(Client client) {
        jp.findById(client.getId()).get().setName(client.getName());
         jp.findById(client.getId()).get().setCity(client.getCity());
        jp.findById(client.getId()).get().setCountry(client.getCountry());
        return jp.findById(client.getId()).get();
    }

    @Override
    public void add(Client client) {
        jp.save(client);
    }
}
