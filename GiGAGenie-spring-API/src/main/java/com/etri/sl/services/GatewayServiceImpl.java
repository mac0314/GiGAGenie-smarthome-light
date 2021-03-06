package com.etri.sl.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.etri.sl.models.Gateway;

@Service("gatewayService")
public class GatewayServiceImpl implements GatewayService{
	private static final AtomicInteger counter = new AtomicInteger();
	
	private static List<Gateway> gateways;
	
	static {
		//gateways= setDummyGateways();
	}
	

	@Override
	public Gateway findByGid(int gid) {
		for(Gateway gateway : gateways) {
			if(gateway.getGid() == gid) {
				return gateway;
			}
		}
		return null;
	}


	@Override
	public void saveGateway(Gateway gateway) {
		gateway.setGid(counter.incrementAndGet());
		gateways.add(gateway);
	}


	@Override
	public void updateGateway(Gateway gateway) {
		int index = gateways.indexOf(gateway);
		gateways.set(index, gateway);
	}


	@Override
	public void deleteGatewayByGid(int gid) {
		for(Iterator<Gateway> iterator = gateways.iterator(); iterator.hasNext(); ) {
			Gateway gateway = iterator.next();
			if(gateway.getGid() == gid) {
				iterator.remove();
			}
		}
	}


	@Override
	public List<Gateway> findAllGateways() {
		return gateways;
	}


	@Override
	public void deleteAllGateways() {
		gateways.clear();
	}


	@Override
	public boolean isGatewayExist(Gateway gateway) {
		return findByGid(gateway.getGid()) != null;
	}
	
	
	private static List<Gateway> setDummyGateways(){
		int gatewayNum = 8;
		String ip = "13.124.195.114";
		String port = "9000";
		
        List<Gateway> gateways = new ArrayList<Gateway>();
        
        gateways.add(new Gateway(gatewayNum, ip, port));
        gateways.add(new Gateway(counter.incrementAndGet(), "192.168.0.2", "8080"));
        gateways.add(new Gateway(counter.incrementAndGet(), "192.168.0.3", "8080"));
        gateways.add(new Gateway(counter.incrementAndGet(), "192.168.0.4", "8080"));
        
        return gateways;
    }
}
