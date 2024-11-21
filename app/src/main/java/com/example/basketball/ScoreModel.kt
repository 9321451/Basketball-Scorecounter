package com.example.basketball

class ScoreModel {
    private var teamA:Int=0
    private var teamB:Int=0

    fun plusOne(team:String){
        when (team){
            "A"->teamA+=1
            "B"->teamB+=1
            else -> "No team found"
        }
    }
    fun plusTwo(team:String){
        when (team){
            "A"->teamA+=2
            "B"->teamB+=2
            else -> "No team found"
        }
    }
    fun plusThree(team:String){
        when (team){
            "A"->teamA+=3
            "B"->teamB+=3
            else -> "No team found"
        }
    }

    fun getTotal(team:String):Int{
        return when(team) {
            "A" -> teamA
            "B"-> teamB
            else -> 0
        }
    }
}