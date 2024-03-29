package com.exec.model;

import java.util.*;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Candidate")
public class Candidate extends User{
    
    public List<String> Campaigners;
    public List<String> Seconders;
    public List<String> Proposers;
    public String post;
    public Map<String,Integer> form_link;
    
    public String manifesto_link;
    public List<String> video_links;
    public List<String> poster_links;

    public boolean is_activated;
    public String otp;

    public Candidate(String roll_no, String name, String email, String post) {
        super(roll_no, name, email);
        this.is_activated = false;
        this.Campaigners = new ArrayList<String>();
        this.Seconders = new ArrayList<String>();
        this.Proposers = new ArrayList<String>();
        this.video_links = new ArrayList<String>();
        this.poster_links = new ArrayList<String>();
        this.manifesto_link = null;
        this.form_link = new HashMap<String, Integer>();
        this.post = post;
    }

}
