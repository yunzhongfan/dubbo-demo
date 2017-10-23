package com.zjw.provider.dubboFilter;

import java.util.List;

import org.apache.log4j.Logger;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Result;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.RpcResult;


/**
 * dubbo Filter  传递上下文状态、以及接口添加白名单
 * @author nbc
 *
 */
public class DubboContextFilter implements Filter {
	
	private static final Logger LOGGER = Logger.getLogger(DubboContextFilter.class);  


	private IpWhiteList ipWhiteList;  
	  
    //dubbo通过setter方式自动注入  
    public void setIpWhiteList(IpWhiteList ipWhiteList) {  
        this.ipWhiteList = ipWhiteList;  
    }  
	
	
	public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
		/* String var= RpcContext.getContext().getAttachment(从Aop中放入的);  
        //todo 其他相关处理  
        return invoker.invoke(invocation);  */
		
		
		
		if (!ipWhiteList.isEnabled()) {  
            LOGGER.debug("白名单禁用");  
            return invoker.invoke(invocation);  
        }  
  
        String clientIp = RpcContext.getContext().getRemoteHost();  //服务端的访问地址：192.168.60.135
        LOGGER.debug("访问ip为{}"+clientIp);  //clientIpip地址为192.168.60.135
        List<String> allowedIps = ipWhiteList.getAllowedIps();  
        if (allowedIps.contains(clientIp)) {  
            return invoker.invoke(invocation);  
        } else {  
            return new RpcResult();  
        }  
		
		
	}

}
