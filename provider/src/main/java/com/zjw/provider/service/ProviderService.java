package com.zjw.provider.service;

import java.util.List;

/**
 * dubbo服务接口
 * 
 * */
public interface ProviderService {
	public String sayHello(String name);
    public List getUsers() ;
}
