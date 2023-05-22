package rest.template.a.service.message;

import org.springframework.http.ResponseEntity;

public interface MessageService {

     ResponseEntity<String> helloWorld();

     ResponseEntity<String> sendMessage(String message);

     ResponseEntity<String> sendFanoutMessage(String message);

}
