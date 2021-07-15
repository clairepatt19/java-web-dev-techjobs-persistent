package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    private List<Job>jobs = new ArrayList<>();
    
    public String description;

    public Skill(){}

    public String getDescription() {
        return description;
    }

    public Job getjobs() {
        return jobs;
    }

    public Job setjobs(Job jobs) {
        return this.jobs = jobs;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
