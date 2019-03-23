package org.dubbo.order.provider;

import java.util.Random;

import org.dubbo.order.api.IOrderOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.dengjl.order.bean.OmOrder;
import priv.dengjl.order.dao.OmOrderMapper;

@Service
public class OrderOperateServiceImpl implements IOrderOperateService {
	
	@Autowired
	private OmOrderMapper omOrderMapper;
	
	@Override
	public String createOrder(String userId, String busiCode) {
		String orderId = "1789079787" + new Random().nextInt(10000);
		OmOrder omOrder = new OmOrder();
		omOrder.setId(orderId);
		omOrder.setBusiName(busiCode);
		omOrder.setUserId(userId);
		omOrderMapper.addOmOrder(omOrder);
		return orderId;
	}

	@Override
	public String queryOrder(String userId) {
		// 只做功能测试
		return "true";
	}
}
