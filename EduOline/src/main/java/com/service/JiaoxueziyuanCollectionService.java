package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueziyuanCollectionEntity;
import java.util.Map;

/**
 * 教学资源收藏 服务类
 */
public interface JiaoxueziyuanCollectionService extends IService<JiaoxueziyuanCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}