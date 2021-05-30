package com.simei.demo.service.impl;

import com.simei.demo.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * description
 *
 * @author faming.yang@hand-china.com 2021-05-30 21:01
 */
@Component
public class UserServiveImpl implements IUserService {
	@Override
	public void save() {
		System.out.println("保存用户");
	}
}
