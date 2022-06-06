package io.goodname01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/view")
@Slf4j
public class MessengerController { 

	@Autowired
	private List<Message> messages;

    @GetMapping
    public String show(Model model) {
        model.addAttribute("messages", this.messages);

		log.warn("Messages so again {}",this.messages);
        return "messenger"; //view
    }

    @PostMapping
    public String sendMessage(
			@RequestParam(name = "name", required = false, defaultValue = "")
			String name, 
            @RequestParam(name = "msg", required = false, defaultValue = "")
            String msg, 
            Model model) {
		Message message = new Message(name, msg);
		this.messages.add(message);
		log.warn("Message added {}",msg);
		log.warn("Messages so far {}",this.messages);
        model.addAttribute("messages", this.messages);
        model.addAttribute("current_user", name);
        return "messenger"; //view
    }

}
