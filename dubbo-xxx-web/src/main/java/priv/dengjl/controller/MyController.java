package priv.dengjl.controller;

import org.dubbo.order.api.IOrderQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class MyController {
	@Autowired
	private IOrderQueryService orderQueryService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		String orderId = orderQueryService.doOrder("test");
		mv.addObject("orderId", orderId);
		mv.setViewName("index");
		return mv;
	}
}