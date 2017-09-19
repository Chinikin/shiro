package com.monee.system.dao;

import java.util.List;

import com.monee.system.mybatis.MyBatisDao;

/**
 * 测试接口
 * @author monee
 * 2015-09-29 17:01:29
 */
@MyBatisDao
public interface TestDao {

	public List<String> findNames();

	public void findInfo();
}
