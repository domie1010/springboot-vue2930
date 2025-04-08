package com.entity.view;

import com.entity.JiaoxueziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教学资源
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoxueziyuan")
public class JiaoxueziyuanView extends JiaoxueziyuanEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 资源类型的值
		*/
		private String jiaoxueziyuanValue;



	public JiaoxueziyuanView() {

	}

	public JiaoxueziyuanView(JiaoxueziyuanEntity jiaoxueziyuanEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoxueziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 资源类型的值
			*/
			public String getJiaoxueziyuanValue() {
				return jiaoxueziyuanValue;
			}
			/**
			* 设置： 资源类型的值
			*/
			public void setJiaoxueziyuanValue(String jiaoxueziyuanValue) {
				this.jiaoxueziyuanValue = jiaoxueziyuanValue;
			}













}
