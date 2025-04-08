package com.entity.view;

import com.entity.JiaoxueziyuanLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教学资源评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiaoxueziyuan_liuyan")
public class JiaoxueziyuanLiuyanView extends JiaoxueziyuanLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jiaoxueziyuan
			/**
			* 教学资源名称
			*/
			private String jiaoxueziyuanName;
			/**
			* 资源类型
			*/
			private Integer jiaoxueziyuanTypes;
				/**
				* 资源类型的值
				*/
				private String jiaoxueziyuanValue;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 教学资源下载
			*/
			private String jiaoxueziyuanFile;
			/**
			* 教学资源详情
			*/
			private String jiaoxueziyuanContent;

		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public JiaoxueziyuanLiuyanView() {

	}

	public JiaoxueziyuanLiuyanView(JiaoxueziyuanLiuyanEntity jiaoxueziyuanLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoxueziyuanLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}













				//级联表的get和set jiaoxueziyuan
					/**
					* 获取： 教学资源名称
					*/
					public String getJiaoxueziyuanName() {
						return jiaoxueziyuanName;
					}
					/**
					* 设置： 教学资源名称
					*/
					public void setJiaoxueziyuanName(String jiaoxueziyuanName) {
						this.jiaoxueziyuanName = jiaoxueziyuanName;
					}
					/**
					* 获取： 资源类型
					*/
					public Integer getJiaoxueziyuanTypes() {
						return jiaoxueziyuanTypes;
					}
					/**
					* 设置： 资源类型
					*/
					public void setJiaoxueziyuanTypes(Integer jiaoxueziyuanTypes) {
						this.jiaoxueziyuanTypes = jiaoxueziyuanTypes;
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
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 教学资源下载
					*/
					public String getJiaoxueziyuanFile() {
						return jiaoxueziyuanFile;
					}
					/**
					* 设置： 教学资源下载
					*/
					public void setJiaoxueziyuanFile(String jiaoxueziyuanFile) {
						this.jiaoxueziyuanFile = jiaoxueziyuanFile;
					}
					/**
					* 获取： 教学资源详情
					*/
					public String getJiaoxueziyuanContent() {
						return jiaoxueziyuanContent;
					}
					/**
					* 设置： 教学资源详情
					*/
					public void setJiaoxueziyuanContent(String jiaoxueziyuanContent) {
						this.jiaoxueziyuanContent = jiaoxueziyuanContent;
					}






















				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
