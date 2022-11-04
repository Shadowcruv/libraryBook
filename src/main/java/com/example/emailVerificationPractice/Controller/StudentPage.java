package com.example.emailVerificationPractice.Controller;

import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Service.ApiStudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/studentspage")
@RestController
public class StudentPage {

   private final ApiStudentsService apiStudentsService;

   @Autowired
    public StudentPage(ApiStudentsService apiStudentsService) {
        this.apiStudentsService = apiStudentsService;
    }


    @GetMapping("/spage")
    public String getStudentsPage(){
        return "Hello Students";
    }

    @GetMapping("/dash")
    public String getDashBoard(){
        return "Students DashBoard";
    }

    @GetMapping("/courses")
    public String getCourses(){
        return "Course available";
    }



    //Student Profile
    @GetMapping(value = "/profile")
    public ApiUser getStudentsProfile(Authentication authentication){
        return apiStudentsService.getuser(authentication.getName());


    }

    //Update Student Profile
    @PutMapping("/current/studentprofile")
    public ApiUser updateMyStudentProfile(Authentication authentication, ApiUser apiUser){

      return apiStudentsService.updateCurrentUser(authentication.getName(), apiUser);

    }

    /*
    @RequestMapping(value = "/username", method = RequestMethod.GET)
  @ResponseBody
  public String currentUserName(Authentication authentication) {
     return authentication.getName();
  }
     */

    @GetMapping("/about")
    public String getAboutFocourse(){
        return "About Focourse app";
    }
}
