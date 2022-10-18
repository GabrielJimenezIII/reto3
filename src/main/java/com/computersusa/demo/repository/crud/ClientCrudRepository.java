package com.computersusa.demo.repository.crud;
import com.computersusa.demo.entities.Client;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public interface ClientCrudRepository extends CrudRepository<Client,Integer>{


}