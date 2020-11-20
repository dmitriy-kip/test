package com.example.test.servingwebcontent.repos;

import com.example.test.servingwebcontent.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
