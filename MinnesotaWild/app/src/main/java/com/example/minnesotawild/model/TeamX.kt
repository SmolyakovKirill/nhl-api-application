package com.example.minnesotawild.model

data class TeamX(
    val abbreviation: String,
    val active: Boolean,
    val conference: Conference,
    val division: Division,
    val firstYearOfPlay: String,
    val franchise: Franchise,
    val franchiseId: Int,
    val id: Int,
    val link: String,
    val locationName: String,
    val name: String,
    val officialSiteUrl: String,
    val shortName: String,
    val teamName: String,
    val venue: Venue
)