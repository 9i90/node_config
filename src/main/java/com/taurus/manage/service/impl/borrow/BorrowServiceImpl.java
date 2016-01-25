package com.taurus.manage.service.impl.borrow;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taurus.manage.service.borrow.BorrowServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;

@Service("borrowService")
@Transactional
public class BorrowServiceImpl extends CommonServiceImpl implements BorrowServiceI {
	
}