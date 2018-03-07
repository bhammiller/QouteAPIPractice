package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {
    /*@GetMapping("/")
    public String apiPractice(){
        public @ResponseBody String showIndex(){
            RestTemplate restTemplate = new RestTemplate();
            Quote quote=restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Quote.class);
            return quote.getValue().getQuote();
        }
        return "index";
    }*/
    @GetMapping("/")
    public @ResponseBody String showIndex(){
        RestTemplate restTemplate = new RestTemplate();
        Quote quote=restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",Quote.class);
        return quote.getValue().getQuote();
    }
}
