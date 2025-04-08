package com.entity.model;

import com.entity.JiaoxueziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教学资源
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaoxueziyuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教学资源名称
     */
    private String jiaoxueziyuanName;


    /**
     * 资源类型
     */
    private Integer jiaoxueziyuanTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教学资源名称
	 */
    public String getJiaoxueziyuanName() {
        return jiaoxueziyuanName;
    }


    /**
	 * 设置：教学资源名称
	 */
    public void setJiaoxueziyuanName(String jiaoxueziyuanName) {
        this.jiaoxueziyuanName = jiaoxueziyuanName;
    }
    /**
	 * 获取：资源类型
	 */
    public Integer getJiaoxueziyuanTypes() {
        return jiaoxueziyuanTypes;
    }


    /**
	 * 设置：资源类型
	 */
    public void setJiaoxueziyuanTypes(Integer jiaoxueziyuanTypes) {
        this.jiaoxueziyuanTypes = jiaoxueziyuanTypes;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：教学资源下载
	 */
    public String getJiaoxueziyuanFile() {
        return jiaoxueziyuanFile;
    }


    /**
	 * 设置：教学资源下载
	 */
    public void setJiaoxueziyuanFile(String jiaoxueziyuanFile) {
        this.jiaoxueziyuanFile = jiaoxueziyuanFile;
    }
    /**
	 * 获取：教学资源详情
	 */
    public String getJiaoxueziyuanContent() {
        return jiaoxueziyuanContent;
    }


    /**
	 * 设置：教学资源详情
	 */
    public void setJiaoxueziyuanContent(String jiaoxueziyuanContent) {
        this.jiaoxueziyuanContent = jiaoxueziyuanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
