package com.computersusa.demo.repository.crud;
import com.computersusa.demo.entities.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}
