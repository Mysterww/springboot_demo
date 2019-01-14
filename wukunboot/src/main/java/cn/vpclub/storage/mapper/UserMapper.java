package cn.vpclub.storage.mapper;

import cn.vpclub.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserModel> findUserId(Integer id);

    public List<UserModel> listUser();

    public int insertUser(UserModel user);

    public int delete(int id);

    public int Update(UserModel user);

    public List<UserModel> searchByName(String name);

    public List<UserModel> searchPhoneInfo(Integer id);
}

