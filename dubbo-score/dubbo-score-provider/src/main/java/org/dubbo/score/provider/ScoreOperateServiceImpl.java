package org.dubbo.score.provider;

import org.dubbo.score.api.IScoreOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.dengjl.score.bean.SmScore;
import priv.dengjl.score.dao.SmScoreMapper;

@Service
public class ScoreOperateServiceImpl implements IScoreOperateService {

	@Autowired
	private SmScoreMapper smScoreMapper;

	@Override
	public String addScore(String userId, int count) {
		SmScore smScore = new SmScore();
		smScore.setUserId(userId);
		smScore.setScore(count);
		smScoreMapper.addSmScore(smScore);
		return userId + " - " + count;
	}

	@Override
	public String queryScore(String userId) {
		// 只做功能测试
		return "true";
	}

}
