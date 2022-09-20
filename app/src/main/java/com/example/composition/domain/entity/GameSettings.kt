package com.example.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val mainCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)