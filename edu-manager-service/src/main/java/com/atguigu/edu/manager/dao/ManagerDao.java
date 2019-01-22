package com.atguigu.edu.manager.dao;

import com.atguigu.edu.common.bean.EduUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ManagerDao {

    //@Select("select * from t_member where USER_ID=#{userId}")
    public EduUser  selectAll(@PathVariable("userId") Integer userId);
    public List<EduUser> SelectMemberList();

    Integer addEduUser(EduUser eduUser);


    void deleEduUser(Integer userId);
}
