import React, {useState, useEffect} from 'react';
import {StyledTetrisWrapper} from "../../components/styles/StyledTetris";
import ScoreApi from "../../api/ScoreApi";
import StartButton from "../../components/StartButton";
import "./menu.css"

export default () => {

    const [leaderboard, setLeaderboard] = useState([]);

    useEffect(() => {
        ScoreApi.getScore().then(r => setLeaderboard(r.data))
    }, [])

    console.log(leaderboard)

    return (
        <StyledTetrisWrapper>
            <div className="scoreBord">
                <div className="score-container">
                    <div>Name</div>
                    <div>Score</div>
                </div>
                {leaderboard.map(score => (
                    <div className="score-container" key={score.id}>
                        <div>{score.name}</div>
                        <div>{score.gameScore}</div>
                    </div>
                ))}
            </div>
            <div className="btn-container">
                <StartButton/>
            </div>
        </StyledTetrisWrapper>
    )
}
