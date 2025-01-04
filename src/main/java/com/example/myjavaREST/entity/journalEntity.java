package com.example.myjavaREST.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "journal_table")
public class journalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private String content;

    @Version
    private Integer version; // Add this field for Optimistic Locking


    private journalEntity() {}

    public journalEntity(Integer id, String title, String content) {
       this.id = id;
       this.title = title;
       this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
