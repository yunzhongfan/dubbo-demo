package com.zjw.provider.dubboFilter;

import java.util.ArrayList;
import java.util.List;

public class IpWhiteList {

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public List<String> getAllowedIps() {
		List<String> list= new ArrayList<String>();
		list.add("127.0.0.1");
		list.add("192.168.1.1");
		list.add("192.168.1.2");
		list.add("192.168.1.3");
		return list;
	}

}
