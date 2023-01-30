package com.client.client;

import java.util.ArrayList;

public interface ClientInterface {
    String delete(int id);

    ArrayList<Client> get();

    Client update(Client client);

    void add(Client client);
}
