package com.spring.ai.first_project.controllers;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ChatController {

    private ChatClient chatClient;

    public ChatController(ChatClient.Builder builder)
    {
        this.chatClient = builder.build();
    }

    @GetMapping("/check")
    public String check(){
        return "Working!";
    }

    // @GetMapping("/chat")
    // public ResponseEntity<String> chat(@RequestParam(required = true) String q){
    //     String result = chatClient.prompt(q).call().content();
    //     return ResponseEntity.ok(result);
    // }
}
