package ch.rihs.test;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class BlogEntity extends PanacheEntity {
    public String name;
    
    public BlogEntity(String name) {
        this.name = name;
    }
  
}
