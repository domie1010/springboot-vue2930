package com.dao;

import com.entity.JiaoxueziyuanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueziyuanLiuyanView;

/**
 * 教学资源评价 Dao 接口
 *
 * @author 
 */
public interface JiaoxueziyuanLiuyanDao extends BaseMapper<JiaoxueziyuanLiuyanEntity> {

   List<JiaoxueziyuanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
