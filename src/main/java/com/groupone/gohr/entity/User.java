package com.groupone.gohr.entity;

import java.io.Serializable;
import java.util.List;

/**
 * className:User
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-20 10:09
 */

public class User  {
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    private List<SysRole> roleList;
    private String passWord;
    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }
}
