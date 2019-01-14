package cn.vpclub.services.impl;

import cn.vpclub.model.UserModel;
import cn.vpclub.storage.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMappper;

    public List<UserModel> findUserId(Integer id) {
        return userMappper.findUserId(id);
    }

    public List<UserModel> listUser() {
        return userMappper.listUser();
    }

    public UserModel insertUser(UserModel user) {
        userMappper.insertUser(user);
        return user;
    }

    public int Update(UserModel user) {
        return userMappper.Update(user);
    }

    public int delete(int id) {
        return userMappper.delete(id);
    }

    public List<UserModel> findAllByPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);
        return userMappper.listUser();
    }

    public List<UserModel> searchByName(String name) {
        return userMappper.searchByName(name);
    }

    public List<UserModel> searchPhoneInfo(Integer id)
    {
        return userMappper.searchPhoneInfo(id);
    }


}
