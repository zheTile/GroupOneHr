package com.groupone.gohr.entity;

import java.util.List;

/**
 * className:SysRole
 * discriptoin:
 * author:朱得鑫
 * createTime:2018-11-20 10:19
 */
public class SysRole {
    private List<User> users;
    private String role;//role_name
    private List<SysPermission> permissions;

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
