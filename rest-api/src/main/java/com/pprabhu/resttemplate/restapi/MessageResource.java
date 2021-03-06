package com.pprabhu.resttemplate.restapi;


import com.pprabhu.resttemplate.api.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageResource {

    @Autowired
    MessageService messageService;

    @GetMapping("/message")
    public String getMessage() {
        return messageService.getMessage().getMessage();
    }

}
