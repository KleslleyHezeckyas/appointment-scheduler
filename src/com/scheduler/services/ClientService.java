package com.scheduler.services;

import com.scheduler.entities.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private List<Client> clients = new ArrayList<>();

    public Client addClient(String name, String phone) {
        int id = clients.size() + 1;
        Client client = new Client(id, name, phone);
        clients.add(client);
        return client;
    }

    public List<Client> listClient() {
        return clients;
    }

    public Client findById(int id) {
        for (Client c : clients) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
