package rest.template.a.service.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageServiceImpl implements MessageService{


    private RestTemplate restTemplate;

    @Autowired
    public MessageServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public ResponseEntity<String> sendMessage( ) {
        ResponseEntity<String> response = restTemplate.exchange(
                "http://localhost:9090/producer/hello",
                HttpMethod.GET,
                null,
                String.class
        );
        return response;
    }
}
