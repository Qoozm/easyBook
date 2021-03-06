package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by colin on 2017/7/21.
 */
public class CollectionEssay implements Serializable {

    private Integer collection_essay_id;
    private Integer user_id;
    private Integer essay_id;
    private Date collection_essay_date;

    public CollectionEssay() {

    }

    public Date getCollection_essay_date() {
        return collection_essay_date;
    }

    public void setCollection_essay_date(Date collection_essay_date) {
        this.collection_essay_date = collection_essay_date;
    }

    public Integer getCollection_essay_id() {
        return collection_essay_id;
    }

    public void setCollection_essay_id(Integer collection_essay_id) {
        this.collection_essay_id = collection_essay_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(Integer essay_id) {
        this.essay_id = essay_id;
    }

    @Override
    public String toString() {
        return "CollectionEssay{" +
                "collection_essay_id=" + collection_essay_id +
                ", user_id=" + user_id +
                ", essay_id=" + essay_id +
                ", collection_essay_date=" + collection_essay_date +
                '}';
    }
}
