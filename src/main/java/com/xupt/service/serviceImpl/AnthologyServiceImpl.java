package com.xupt.service.serviceImpl;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import com.xupt.dao.IAnthologyDao;
import com.xupt.service.IAnthologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnthologyServiceImpl implements IAnthologyService {

    @Autowired
    private IAnthologyDao anthologyDao;

    private final int ANTHOLOGY_TABLE_COUNT = 5;
    private String PRE_ANTHOLOGY_TABLE_NAME = "ebanthology_";

    public void initUserAnthology(Integer anthology_user_id) {
        int tableCount = anthology_user_id % ANTHOLOGY_TABLE_COUNT;
        String tableName = PRE_ANTHOLOGY_TABLE_NAME + tableCount;

        Anthology diary = new Anthology();
        diary.setAnthology_user_id(anthology_user_id);
        diary.setAnthology_name("日记");

        Anthology informalEssay = new Anthology();
        informalEssay.setAnthology_name("随笔");
        informalEssay.setAnthology_user_id(anthology_user_id);

        anthologyDao.saveAnthology(tableName, diary);
        anthologyDao.saveAnthology(tableName, informalEssay);
    }

    public void newAnthology(Integer anthology_user_id, String anthology_name) {
        int tableCount = anthology_user_id % ANTHOLOGY_TABLE_COUNT;
        String tableName = PRE_ANTHOLOGY_TABLE_NAME + tableCount;

        Anthology anthology = new Anthology();
        anthology.setAnthology_name(anthology_name);
        anthology.setAnthology_user_id(anthology_user_id);

        anthologyDao.saveAnthology(tableName, anthology);
    }

    public List<Anthology> loadAnthology(Integer anthology_user_id) {
        int tableCount = anthology_user_id % ANTHOLOGY_TABLE_COUNT;
        String tableName = PRE_ANTHOLOGY_TABLE_NAME + tableCount;

        List<Anthology> anthologies = anthologyDao.findUserAnthology(tableName, anthology_user_id);
        return anthologies;
    }
}
