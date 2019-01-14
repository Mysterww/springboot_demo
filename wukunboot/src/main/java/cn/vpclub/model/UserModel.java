package cn.vpclub.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserModel {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String phone;
    private String address;
    private List<PhoneInfo> phoneInfos;

}
