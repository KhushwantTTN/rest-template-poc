package rest.template.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rest.template.a.service.message.MessageService;

@RestController
@RequestMapping("/rest/template")
public class MessageController {

    @Autowired
    MessageService messageService;
    @GetMapping
    public ResponseEntity<String> getMessage( ) {
        return messageService.sendMessage();
    }
}
