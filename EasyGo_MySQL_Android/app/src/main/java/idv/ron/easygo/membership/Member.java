package idv.ron.easygo.membership;

import java.io.Serializable;
import java.sql.Timestamp;

public class Member implements Serializable {
    private String user_Id;
    private String user_password;
    private String user_cellphone;
    private String user_name;
    private String user_email;
    private String user_avater;
    private Timestamp user_create_time;
    private String user_status;
    private String user_identity;
    private Integer user_store;

    public Member(String user_Id, String user_password, String user_cellphone, String user_name, String user_email, String user_avater, Timestamp user_create_time, String user_status, String user_identity, Integer user_store) {
        this.user_Id = user_Id;
        this.user_password = user_password;
        this.user_cellphone = user_cellphone;
        this.user_name = user_name;
        this.user_email = user_email;
        this.user_avater = user_avater;
        this.user_create_time = user_create_time;
        this.user_status = user_status;
        this.user_identity = user_identity;
        this.user_store = user_store;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_cellphone() {
        return user_cellphone;
    }

    public void setUser_cellphone(String user_cellphone) {
        this.user_cellphone = user_cellphone;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_avater() {
        return user_avater;
    }

    public void setUser_avater(String user_avater) {
        this.user_avater = user_avater;
    }

    public Timestamp getUser_create_time() {
        return user_create_time;
    }

    public void setUser_create_time(Timestamp user_create_time) {
        this.user_create_time = user_create_time;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_identity() {
        return user_identity;
    }

    public void setUser_identity(String user_identity) {
        this.user_identity = user_identity;
    }

    public Integer getUser_store() {
        return user_store;
    }

    public void setUser_store(Integer user_store) {
        this.user_store = user_store;
    }
}
