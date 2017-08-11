package com.xupt.service;

import com.xupt.bean.DynamicThumb;

import java.util.List;

public interface IThumbService {
    public void saveThumb(Integer thumb_user_id, Integer thumb_essay_id);

    public List<DynamicThumb> searchDynamicThumb(Integer thumb_user_id);
}
