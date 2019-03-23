package priv.dengjl.controller;

import org.dubbo.order.api.IOrderOperateService;
import org.dubbo.rule.api.IRuleOperateService;
import org.dubbo.rule.api.RuleResult;
import org.dubbo.score.api.IScoreOperateService;
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
	
	@Autowired
	private IScoreOperateService scoreOperateService;
	
	@Autowired
	private IRuleOperateService ruleOperateService;
	
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		String userId = userOperateService.createUser("张三");
		String orderId = orderOperateService.createOrder(userId, "商品订购");
		String score = scoreOperateService.addScore(userId, 100);
		mv.addObject("userId", userId);
		mv.addObject("orderId", orderId);
		mv.addObject("score", score);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/check")
	public ModelAndView check() {
		ModelAndView mv = new ModelAndView();
		RuleResult result = ruleOperateService.checkRuleByCode("ADD_OFFER");
		mv.addObject("code", result.getCode());
		mv.addObject("message", result.getMessage());
		mv.setViewName("check");
		return mv;
	}
}