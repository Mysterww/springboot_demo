package cn.vpclub.controller;

import cn.vpclub.model.UserModel;
import cn.vpclub.services.impl.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value = "/crud", method = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping(value = "/crud")
@Slf4j
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping("/delete")
    public String delete(int id) {
        int result = userservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping("/update")
    public String update(UserModel user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }


    }

    @RequestMapping( "/insert")
    public UserModel insert(UserModel user) {
        return userservice.insertUser(user);
    }

    @RequestMapping("/listUser")
    public List<UserModel> ListUser() {
        return userservice.listUser();
    }

    @RequestMapping("/listUserById")
    public List<UserModel> listUserById(Integer id) {
        return userservice.findUserId(id);
    }

    @RequestMapping("/findAllByPage")
    public List<UserModel> findAllByPage(int page,int pageSize)
    {
        return userservice.findAllByPage(page,pageSize);
    }

    @RequestMapping("/searchByName")
    public  List<UserModel> searchByName(String name)
    {
        return userservice.searchByName(name);
    }

    @RequestMapping("/searchPhoneInfo")
    public List<UserModel> searchPhoneInfo(Integer id){
        return userservice.searchPhoneInfo(id);
    }



}


