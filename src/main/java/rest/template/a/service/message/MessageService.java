package rest.template.a.service.message;

import org.springframework.http.ResponseEntity;

public interface MessageService {

    public ResponseEntity<String> sendMessage();
}
