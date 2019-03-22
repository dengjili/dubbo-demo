package priv.dengjl.controller;

import org.dubbo.order.api.IOrderOperateService;
import org.dubbo.user.api.IUserOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class MyController {
	
	@Autowired
	private IUserOperateService userOperateService;
	
	@Autowired
	private IOrderOperateService orderOperateService;
	
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		String userId = userOperateService.createUser("张三");
		String orderId = orderOperateService.createOrder(userId, "商品订购");
		mv.addObject("userId", userId);
		mv.addObject("orderId", orderId);
		mv.setViewName("index");
		return mv;
	}
}