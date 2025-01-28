package com.amc.ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.InMemoryChatMemory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.amc.ollama.services.MarkdownService;


@Controller
public class ChatController {

    private final ChatClient chatClient;
    private final MarkdownService markdown;

    public ChatController(ChatClient.Builder builder, MarkdownService markdown) {

        this.chatClient = builder.defaultAdvisors(
                new MessageChatMemoryAdvisor(new InMemoryChatMemory())).build();

        this.markdown = markdown;
    }

    @GetMapping("/")
    public String chat() {
        return "index";
    }

    @PostMapping("/chat")
    public String response(@RequestParam("query") String query, Model model) {

        var result = chatClient.prompt()
                .user(query)
                .call()
                // .chatResponse().getResult().getOutput().getContent();
                .content();

        model.addAttribute("chat", markdown.toHtml(result));
        model.addAttribute("query", query);

        return "response";
    }

}