package com.computersusa.demo.repository.crud;
import com.computersusa.demo.entities.Message;
import org.springframework.data.repository.CrudRepository;



public interface MessageCrudRepository extends CrudRepository<Message, Integer> {

}
