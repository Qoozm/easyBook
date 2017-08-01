package com.xupt.service;

import com.xupt.bean.Anthology;

import java.util.List;

public interface IAnthologyService {

    public void initUserAnthology(Integer anthology_user_id);

    public void newAnthology(Integer anthology_user_id, String anthology_name);

    public List<Anthology> loadAnthology(Integer anthology_user_id);
}
