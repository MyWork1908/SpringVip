package org.example.app.service;

import org.example.app.models.entity.Score;

public interface LinkService {
    String addFresherToCenter(String centerCode, String fresherId);

    Score addScore(Score score, String fresherId, String subjectId);
}
