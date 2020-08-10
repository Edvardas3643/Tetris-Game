package lt.tetris.controller;

import lt.tetris.entity.Score;
import lt.tetris.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping("/getScoreBord")
    private List<Score> getAllTheScores() {
        return scoreService.getAllScores();
    }

    @PostMapping("/saveScore")
    private List<Score> saveNewScore(@RequestBody Score score) {
        scoreService.saveScore(score);
        return scoreService.getAllScores();
    }
}
