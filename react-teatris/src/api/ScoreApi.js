import HTTP from '.'

export default {

    newScore(score) {
        return HTTP.post('/saveScore', {
            name: "test",
            score: score
        });
    },

    getScore() {
        return HTTP.get('/getScoreBord')
    }
}