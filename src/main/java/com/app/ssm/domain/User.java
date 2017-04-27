package com.app.ssm.domain;

/**
 * Created by Administrator on 2017/4/26.
 */
public class User {
    private Integer id;

    private String useruame;

    private String password;

    private String email;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUseruame() {
        return useruame;
    }

    public void setUseruame(String useruame) {
        this.useruame = useruame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
