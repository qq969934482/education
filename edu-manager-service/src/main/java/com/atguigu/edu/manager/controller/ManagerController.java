package com.atguigu.edu.manager.controller;

import com.atguigu.edu.common.bean.EduUser;
import com.atguigu.edu.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @RequestMapping("/index/{userId}")
    @ResponseBody
    public EduUser  selectAll(@PathVariable("userId")Integer userId){
//        return managerService.selectAll();
        return managerService.selectAll(userId);
    }

    @RequestMapping("/text")
    @ResponseBody
    public String text(){
        System.out.println("123456");
        return "helle";
    }





        @ResponseBody
        @RequestMapping("member-list")
        public List<EduUser> SelectMemberList(){
            return managerService.SelectMemberList();

    }

    @ResponseBody
    @RequestMapping("insert")
    public Integer addEduUser(@RequestBody EduUser eduUser){
        Integer count = managerService.addEduUser(eduUser);
            return count;
    }
    @ResponseBody
    @RequestMapping("/deleEduUser/{userId}")
    public void  deleEduUser(@PathVariable("userId") Integer userId){
        managerService.deleEduUser(userId);

    }
}
