package priv.dengjl.score.bean;

import java.math.BigDecimal;

public class SmScore {
    private String userId;

    private float score;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}