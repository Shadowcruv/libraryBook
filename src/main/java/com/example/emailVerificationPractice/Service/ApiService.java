package com.example.emailVerificationPractice.Service;


import com.example.emailVerificationPractice.Entity.ApiUser;

import java.util.List;

public interface ApiService {
    void saveApiUser(ApiUser apiUser);
    ApiUser retrieveUser(String username);
    List<ApiUser> retrieveUsers();
    void  deleteUser(String username);

    String confirmTokenn(String token);
}
