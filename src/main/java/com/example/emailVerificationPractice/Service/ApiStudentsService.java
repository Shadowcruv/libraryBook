package com.example.emailVerificationPractice.Service;

import com.example.emailVerificationPractice.Entity.ApiUser;
import com.example.emailVerificationPractice.Repository.ApiUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApiStudentsService {

    private final ApiUserRepository apiUserRepository;

   @Autowired
    public ApiStudentsService(ApiUserRepository apiUserRepository) {
        this.apiUserRepository = apiUserRepository;
    }

    public ApiUser getuser(String username){
       return apiUserRepository.findByuserName(username);

    }


    public ApiUser updateCurrentUser(String name, ApiUser apiUser) {
       ApiUser apiCurrentUser =  apiUserRepository.findOptionUserName(name).
                orElseThrow(()-> new IllegalStateException("Such User don't exist"));


        apiCurrentUser.setSchool(apiUser.getSchool());
        apiCurrentUser.setFaculty(apiUser.getFaculty());
        apiCurrentUser.setDepartment(apiUser.getDepartment());
        apiCurrentUser.setLevel(apiUser.getLevel());

        return apiUserRepository.save(apiCurrentUser);
    }
}
