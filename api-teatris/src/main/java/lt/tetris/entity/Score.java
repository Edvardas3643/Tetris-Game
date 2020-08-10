package lt.tetris.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "score_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "game_score")
    private Long gameScore;
}
