package com.jubilantz.services;

import com.jubilantz.entity.EasRole;

import java.util.List;


public interface EasRoleService {
    List<EasRole> getAll();

    String findRoleNameByRoleId(Integer roleid) throws Exception;
}
