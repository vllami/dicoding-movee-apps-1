package com.dicoding.submissionsatu.data

data class DetailsEntity(
    var poster: Int,
    var title: String,
    var releaseDate: String,
    var genre: String,
    var duration: String,
    var synopsis: String,
    var owner: String,
    var rating: Double
)