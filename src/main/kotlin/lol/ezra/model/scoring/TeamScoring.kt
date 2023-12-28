package lol.ezra.model.scoring

data class TeamScoring(
    val team: String,
    val robotScores: MutableList<Score>,
//    val judgingSheet: TODO("DataDriven judging system to allow the change per year.")?
) {
}