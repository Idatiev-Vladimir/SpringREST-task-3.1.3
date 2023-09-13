package ru.itmentor.spring.boot_security.demo.dto;


public class UserDTO {

    private String username;

    private String password;

    private String fullName;

    private int age;

    private String email;

    public UserDTO() {
    }

    public UserDTO(String username, String password, String fullName, int age, String email) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
