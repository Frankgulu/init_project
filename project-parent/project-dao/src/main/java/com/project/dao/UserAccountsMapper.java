package com.project.dao;

import com.project.model.UserAccounts;

public interface UserAccountsMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserAccounts record);

    int insertSelective(UserAccounts record);

    UserAccounts selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserAccounts record);

    int updateByPrimaryKey(UserAccounts record);
}