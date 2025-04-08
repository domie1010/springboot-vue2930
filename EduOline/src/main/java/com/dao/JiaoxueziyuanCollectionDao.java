package com.dao;

import com.entity.JiaoxueziyuanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoxueziyuanCollectionView;

/**
 * 教学资源收藏 Dao 接口
 *
 * @author 
 */
public interface JiaoxueziyuanCollectionDao extends BaseMapper<JiaoxueziyuanCollectionEntity> {

   List<JiaoxueziyuanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
