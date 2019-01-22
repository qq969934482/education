package com.atguigu.edu.manager.service;

import com.atguigu.edu.common.bean.EduUser;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ManagerService {

    public EduUser  selectAll(Integer userId);

    List<EduUser> SelectMemberList();

    Integer addEduUser(EduUser eduUser);

    void deleEduUser(Integer userId);
}
