package com.example.emailVerificationPractice.Controller;


import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Service.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/registration")
@RestController
public class RegistrationPage {

    private final ApiServiceImpl apiService;

    @Autowired
    public RegistrationPage(ApiServiceImpl apiService) {
        this.apiService = apiService;
    }

    @PostMapping
    public void saveCApiUser(@RequestBody ApiUser apiUser){
        apiService.saveApiUser(apiUser);
        System.out.println("Added Successfully");
    }

    //Confirming the token
    @GetMapping(path = "confirm")
    public String confirmToken(@RequestParam("token") String token){
        return apiService.confirmTokenn(token);
    }

}
