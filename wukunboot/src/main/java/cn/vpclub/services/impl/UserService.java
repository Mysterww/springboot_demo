package cn.vpclub.services.impl;

import cn.vpclub.model.UserModel;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    public List<UserModel> findUserId(Integer id);

    public List<UserModel> listUser();

    public UserModel insertUser(UserModel user);

    public int delete(int id);

    public int Update(UserModel user);

    public List<UserModel> findAllByPage(int page, int pageSize);

    public List<UserModel> searchByName(String name);

    public List<UserModel> searchPhoneInfo(Integer id);
}
