package com.monee.system.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monee.system.dao.TestDao;

/**
 * 测试Service
 * @author monee
 * 2015-09-29 17:00:14
 */
@Service
public class TestService {
	
	private Logger log = LoggerFactory.getLogger(TestService.class);
	
	@Autowired
	private TestDao testDao;
	
	public List<String> findNames() {
		log.debug("开始查询");
//		return null;
		return testDao.findNames();
	}

	@Transactional(readOnly=false)
	public void findInfo() throws Exception {
		
		try {
//			testDao.findInfo();
		} catch (Exception e) {
			throw new Exception(e);
		}
		
	}

	
}
