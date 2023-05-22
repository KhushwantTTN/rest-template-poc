package rest.template.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rest.template.a.service.message.MessageService;

@RestController
@RequestMapping("/rest")
public class MessageController {

    @Autowired
    MessageService messageService;
    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld( ) {
        return messageService.helloWorld();
    }

    @GetMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/message/fanout")
    public ResponseEntity<String> sendFanoutMessage(@RequestParam("message") String message) {
        return messageService.sendFanoutMessage(message);
    }
}
