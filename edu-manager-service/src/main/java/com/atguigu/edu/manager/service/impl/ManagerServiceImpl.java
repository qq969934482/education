package com.atguigu.edu.manager.service.impl;

import com.atguigu.edu.common.bean.EduUser;
import com.atguigu.edu.manager.dao.ManagerDao;
import com.atguigu.edu.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ManagerServiceImpl  implements ManagerService {


    @Autowired
    private ManagerDao managerDao;

    @Override
    public EduUser selectAll(Integer userId) {
        return managerDao.selectAll(userId);
    }

    @Override
    public List<EduUser> SelectMemberList() {
        List<EduUser> eduUserList = managerDao.SelectMemberList();

        return eduUserList;
    }

    @Override
    public Integer addEduUser(EduUser eduUser) {
        Date date=new Date();
        System.out.println(date);
        eduUser.setCreateTime(date);
        eduUser.setIsAvalible(1);
        System.out.println(eduUser.toString());
        Integer count =managerDao.addEduUser(eduUser);
        return count;
    }

    @Override
    public void deleEduUser(Integer userId) {
        managerDao.deleEduUser(userId);
    }
}

