package com.jnshu.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Mr_Wang
 */
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 4013412763165230287L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
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
}