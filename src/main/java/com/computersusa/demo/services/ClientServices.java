package com.computersusa.demo.services;

import java.util.List;
import java.util.Optional;

import com.computersusa.demo.entities.Client;
import com.computersusa.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){return clientRepository.getClientAll(); }
    public Optional<Client> getProduct(int id){return clientRepository.getClientId(id); }
    public Client save (Client p){
        if (p.getIdClient()==null){
            return clientRepository.save(p);
        } else{
            Optional<Client> e = clientRepository.getClientId(p.getIdClient());
            if (e.isPresent()){
                return p;
            }else {
                return clientRepository.save(p);
            }
        }
    }
    public Client update(Client p){
        if(p.getIdClient()!=null){
            Optional<Client>q = clientRepository.getClientId(p.getIdClient());
            if(q.isPresent()){
                if(p.getName()!=null) {
                    q.get().setName(p.getName());
                }
                        clientRepository.save(q.get());
                        return q.get();
            }else {
                return p;
            }
        }else{
                return p;
            }
        }

        public boolean delete(int id){
            boolean flag=false;
            Optional<Client>p= clientRepository.getClientId(id);
            if(p.isPresent()){
                clientRepository.delete(p.get());
                flag=true;
            }
            return flag;
        }
    }


