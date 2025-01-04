package com.example.myjavaREST;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pingAPI {

    @GetMapping("ping")
    public String ping()
    {
        return "pong";
    }

}
