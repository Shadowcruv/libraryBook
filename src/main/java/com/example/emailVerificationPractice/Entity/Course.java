package com.example.emailVerificationPractice.Entity;

import javax.persistence.*;


@Entity
@Table
public class Course {
  @javax.persistence.Id
  @SequenceGenerator(
          name = "course_sequence",
          sequenceName = "course_sequence",
          allocationSize = 1
  )

  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator =  "course_sequence"
  )

  private Long Id;
  private String name;

/*
    Encoding the Url link
    Maybe removing the return token
    Writing your code so that a user can't bypass another users account
    Changing any many to one or one to many relationship(Differences between them)
    updating api user methods
    if conditions

     */

}
