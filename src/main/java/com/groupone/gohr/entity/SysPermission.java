package com.groupone.gohr.entity;

import java.util.List;

/**
 * className:SysPermission
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-20 10:20
 */
public class SysPermission {
    private List<SysRole> roles;
    private String permission;//权限字符串

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
