package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.JiaoxueziyuanEntity;

import com.service.JiaoxueziyuanService;
import com.entity.view.JiaoxueziyuanView;
import com.service.YonghuService;
import com.service.JiaoshiService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 教学资源
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jiaoxueziyuan")
public class JiaoxueziyuanController {
    private static final Logger logger = LoggerFactory.getLogger(JiaoxueziyuanController.class);

    @Autowired
    private JiaoxueziyuanService jiaoxueziyuanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;
    @Autowired
    private JiaoshiService jiaoshiService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("学生".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = jiaoxueziyuanService.queryPage(params);

        //字典表数据转换
        List<JiaoxueziyuanView> list =(List<JiaoxueziyuanView>)page.getList();
        for(JiaoxueziyuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiaoxueziyuanEntity jiaoxueziyuan = jiaoxueziyuanService.selectById(id);
        if(jiaoxueziyuan !=null){
            //entity转view
            JiaoxueziyuanView view = new JiaoxueziyuanView();
            BeanUtils.copyProperties( jiaoxueziyuan , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JiaoxueziyuanEntity jiaoxueziyuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jiaoxueziyuan:{}",this.getClass().getName(),jiaoxueziyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        Wrapper<JiaoxueziyuanEntity> queryWrapper = new EntityWrapper<JiaoxueziyuanEntity>()
            .eq("jiaoxueziyuan_name", jiaoxueziyuan.getJiaoxueziyuanName())
            .eq("jiaoxueziyuan_types", jiaoxueziyuan.getJiaoxueziyuanTypes())
            .eq("zan_number", jiaoxueziyuan.getZanNumber())
            .eq("cai_number", jiaoxueziyuan.getCaiNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxueziyuanEntity jiaoxueziyuanEntity = jiaoxueziyuanService.selectOne(queryWrapper);
        if(jiaoxueziyuanEntity==null){
            jiaoxueziyuan.setCreateTime(new Date());
            jiaoxueziyuanService.insert(jiaoxueziyuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JiaoxueziyuanEntity jiaoxueziyuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,jiaoxueziyuan:{}",this.getClass().getName(),jiaoxueziyuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        //根据字段查询是否有相同数据
        Wrapper<JiaoxueziyuanEntity> queryWrapper = new EntityWrapper<JiaoxueziyuanEntity>()
            .notIn("id",jiaoxueziyuan.getId())
            .andNew()
            .eq("jiaoxueziyuan_name", jiaoxueziyuan.getJiaoxueziyuanName())
            .eq("jiaoxueziyuan_types", jiaoxueziyuan.getJiaoxueziyuanTypes())
            .eq("zan_number", jiaoxueziyuan.getZanNumber())
            .eq("cai_number", jiaoxueziyuan.getCaiNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxueziyuanEntity jiaoxueziyuanEntity = jiaoxueziyuanService.selectOne(queryWrapper);
        if("".equals(jiaoxueziyuan.getJiaoxueziyuanPhoto()) || "null".equals(jiaoxueziyuan.getJiaoxueziyuanPhoto())){
                jiaoxueziyuan.setJiaoxueziyuanPhoto(null);
        }
        if("".equals(jiaoxueziyuan.getJiaoxueziyuanFile()) || "null".equals(jiaoxueziyuan.getJiaoxueziyuanFile())){
                jiaoxueziyuan.setJiaoxueziyuanFile(null);
        }
        if(jiaoxueziyuanEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      jiaoxueziyuan.set
            //  }
            jiaoxueziyuanService.updateById(jiaoxueziyuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        jiaoxueziyuanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isEmpty(role)){
            return R.error(511,"权限为空");
        }
        else if("学生".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        else if("教师".equals(role)){
            params.put("jiaoshiId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = jiaoxueziyuanService.queryPage(params);

        //字典表数据转换
        List<JiaoxueziyuanView> list =(List<JiaoxueziyuanView>)page.getList();
        for(JiaoxueziyuanView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JiaoxueziyuanEntity jiaoxueziyuan = jiaoxueziyuanService.selectById(id);
            if(jiaoxueziyuan !=null){
                //entity转view
                JiaoxueziyuanView view = new JiaoxueziyuanView();
                BeanUtils.copyProperties( jiaoxueziyuan , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JiaoxueziyuanEntity jiaoxueziyuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jiaoxueziyuan:{}",this.getClass().getName(),jiaoxueziyuan.toString());
        Wrapper<JiaoxueziyuanEntity> queryWrapper = new EntityWrapper<JiaoxueziyuanEntity>()
            .eq("jiaoxueziyuan_name", jiaoxueziyuan.getJiaoxueziyuanName())
            .eq("jiaoxueziyuan_types", jiaoxueziyuan.getJiaoxueziyuanTypes())
            .eq("zan_number", jiaoxueziyuan.getZanNumber())
            .eq("cai_number", jiaoxueziyuan.getCaiNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JiaoxueziyuanEntity jiaoxueziyuanEntity = jiaoxueziyuanService.selectOne(queryWrapper);
        if(jiaoxueziyuanEntity==null){
            jiaoxueziyuan.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      jiaoxueziyuan.set
        //  }
        jiaoxueziyuanService.insert(jiaoxueziyuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }





}

