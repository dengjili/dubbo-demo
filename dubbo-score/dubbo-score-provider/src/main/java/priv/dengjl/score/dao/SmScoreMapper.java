package priv.dengjl.score.dao;

import org.springframework.stereotype.Repository;

import priv.dengjl.score.bean.SmScore;

@Repository
public interface SmScoreMapper {
	void addSmScore(SmScore smScore);
}