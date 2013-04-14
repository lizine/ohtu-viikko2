/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olutopas.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;

/**
 *
 * @author lini
 */
@Entity
public class Pub {
    
    public Pub(){
    
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBeers(List<Beer> beers) {
        this.beers = beers;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public List<Beer> getBeers() {
        return beers;
    }
      private String name;
    
    @Id
    private Integer id;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Beer> beers;
}
