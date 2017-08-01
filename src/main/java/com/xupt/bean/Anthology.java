package com.xupt.bean;

import java.io.Serializable;

public class Anthology implements Serializable {

    private Integer anthology_id;
    private String anthology_name;
    private Integer anthology_user_id;
    private Integer anthology_essay_number;

    public Anthology() {

    }

    public Integer getAnthology_id() {
        return anthology_id;
    }

    public void setAnthology_id(Integer anthology_id) {
        this.anthology_id = anthology_id;
    }

    public String getAnthology_name() {
        return anthology_name;
    }

    public void setAnthology_name(String anthology_name) {
        this.anthology_name = anthology_name;
    }

    public Integer getAnthology_user_id() {
        return anthology_user_id;
    }

    public void setAnthology_user_id(Integer anthology_user_id) {
        this.anthology_user_id = anthology_user_id;
    }

    public Integer getAnthology_essay_number() {
        return anthology_essay_number;
    }

    public void setAnthology_essay_number(Integer anthology_essay_number) {
        this.anthology_essay_number = anthology_essay_number;
    }

    @Override
    public String toString() {
        return "Anthology{" +
                "anthology_id=" + anthology_id +
                ", anthology_name='" + anthology_name + '\'' +
                ", anthology_user_id=" + anthology_user_id +
                ", anthology_essay_number=" + anthology_essay_number +
                '}';
    }
}
