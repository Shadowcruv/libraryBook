package com.example.emailVerificationPractice.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table
public class ApiUser {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "api_user_sequence",
            sequenceName = "api_user_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "api_user_sequence"
    )

    private Long Id;
    private String userName;
    private String password;


    //TODO: Update1 : add more properties of the ApiUser
    private String firstName;
    private String lastName;
    private String school;
    private String faculty;
    private String department;
    private String level;
    private Boolean enabled = false;


    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }
   )
    private Collection<ApiRole> authoritiess;

    public ApiUser() {

    }



    public ApiUser( String userName, String password, Collection<ApiRole> authoritiess, Boolean enabled) {

        this.userName = userName;
        this.password = password;
        this.authoritiess = authoritiess;
        this.enabled = enabled;
    }

    public ApiUser(String firstName, String lastName,
                   String school, String faculty, String department,
                   String level) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.school = school;
        this.faculty = faculty;
        this.department = department;
        this.level = level;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<ApiRole> getAuthoritiess() {
        return authoritiess;
    }

    public void setAuthoritiess(Collection<ApiRole> authoritiess) {
        this.authoritiess = authoritiess;
    }

    //TODO: Update1 : add more getters and setters to the properties of the ApiUser

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String LastName){
        this.lastName = LastName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /*
    Things to do
    Encode the url
    check for email validity
    understand how that controller works for a user logging in so that he wouldn't bypass into another user's account
    work on update user details
    if conditions


     */
}
