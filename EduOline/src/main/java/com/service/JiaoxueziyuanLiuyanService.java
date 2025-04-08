package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoxueziyuanLiuyanEntity;
import java.util.Map;

/**
 * 教学资源评价 服务类
 */
public interface JiaoxueziyuanLiuyanService extends IService<JiaoxueziyuanLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}