package com.atguigu.shopmanager.dao;

import com.atguigu.shopmanager.bean.AccountRole;
import com.atguigu.shopmanager.bean.AccountRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountRoleMapper {
    long countByExample(AccountRoleExample example);

    int deleteByExample(AccountRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AccountRole record);

    int insertSelective(AccountRole record);

    List<AccountRole> selectByExample(AccountRoleExample example);

    AccountRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AccountRole record, @Param("example") AccountRoleExample example);

    int updateByExample(@Param("record") AccountRole record, @Param("example") AccountRoleExample example);

    int updateByPrimaryKeySelective(AccountRole record);

    int updateByPrimaryKey(AccountRole record);
}