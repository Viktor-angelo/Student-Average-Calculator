/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author viktor angelo
 */
public class User {
    private String name;
    private String email;
    private String birth;
    
    public User(String name, String email, String birth){
        this.name = name;
        this.email = email;
        this.birth = birth;
    }
    
    public String getName(){
        return name;
}
    public String getEmail(){
        return email;
    }
    public String getDateOfBirth(){
        return birth;
    }
    
    
    
}
