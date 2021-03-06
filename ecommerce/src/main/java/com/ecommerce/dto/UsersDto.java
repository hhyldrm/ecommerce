package com.ecommerce.dto;

import com.ecommerce.model.UserDetails;

import java.util.List;

public class UsersDto {

    private String email;
    private String firstName;
    private String lastName;
    private String middleName;
    private Boolean isActive;

    private List<UserDetailsDto> userDetails;

    public UsersDto(String email, String firstName, String lastName, String middleName, Boolean isActive) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.isActive = isActive;
    }

    public UsersDto(String email, String firstName, String lastName, String middleName, Boolean isActive, List<UserDetailsDto> userDetails) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.isActive = isActive;
        this.userDetails = userDetails;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public List<UserDetailsDto> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(List<UserDetailsDto> userDetails) {
        this.userDetails = userDetails;
    }
}
