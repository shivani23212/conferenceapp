package com.pluralsight.conferencedemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// sb annotation to show we have jpa entity. name refers to table name in db
@Entity(name="sessions")
public class Session {
    @Id // value below identified as PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increments PK
    private Long session_id;
    private String session_name;
    private String session_description;
    private Integer session_length;

    public Session() {
        //
    }

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }
}
