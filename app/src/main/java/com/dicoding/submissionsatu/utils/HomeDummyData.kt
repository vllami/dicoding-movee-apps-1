package com.dicoding.submissionsatu.utils

import com.dicoding.submissionsatu.R.drawable
import com.dicoding.submissionsatu.data.HomeEntity

object HomeDummyData {

    fun generateHomeMoviesData(): List<HomeEntity> {
        val moviesList = ArrayList<HomeEntity>()
        with(moviesList) {
            add(
                HomeEntity(
                    drawable.movies_alita_battle_angel,
                    "Alita: Battle Angel",
                    "2h 2m",
                    "Robert Rodriguez",
                    7.3,
                )
            )
            add(
                HomeEntity(
                    drawable.movies_aquaman,
                    "Aquaman",
                    "2h 23m",
                    "James Wan",
                    6.9
                )
            )
            add(
                HomeEntity(
                    drawable.movies_avengers_infinity_war,
                    "Avengers: Infinity War",
                    "2h 29m",
                    "Joe Russo, Anthony Russo",
                    8.4
                )
            )
            add(
                HomeEntity(
                    drawable.movies_cold_pursuit,
                    "Cold Pursuit",
                    "1h 59m",
                    "Hans Petter Moland",
                    6.2
                )
            )
            add(
                HomeEntity(
                    drawable.movies_glass,
                    "Glass",
                    "2h 9m",
                    "M. Night Shyamalan",
                    6.7
                )
            )
            add(
                HomeEntity(
                    drawable.movies_master_z_ip_man_legacy,
                    "Master Z: Ip Man Legacy",
                    "1h 47m",
                    "Yuen Woo-Ping",
                    6.5
                )
            )
            add(
                HomeEntity(
                    drawable.movies_mortal_engines,
                    "Mortal Engines",
                    "2h 9m",
                    "Christian Rivers",
                    6.1
                )
            )
            add(
                HomeEntity(
                    drawable.movies_ralph_breaks_the_internet,
                    "Ralph Breaks the Internet",
                    "1h 52m",
                    "Phil Johnston, Rich Moore",
                    7.0
                )
            )
            add(
                HomeEntity(
                    drawable.movies_spiderman_into_the_spiderverse,
                    "Spider-Man: Into the Spider-Verse",
                    "1h 57m",
                    "Peter Ramsey, Rodney Rothman, Bob Persichetti",
                    8.4
                )
            )
            add(
                HomeEntity(
                    drawable.movies_creed_ii,
                    "Creed II",
                    "2h 10m",
                    "Steven Caple Jr.",
                    7.1
                )
            )
        }

        return moviesList
    }

    fun generateHomeTvShowsData(): List<HomeEntity> {
        val tvShowsList = ArrayList<HomeEntity>()
        with(tvShowsList) {
            add(
                HomeEntity(
                    drawable.tv_shows_arrow,
                    "Arrow",
                    "42m",
                    "Greg Berlanti, Marc Guggenheim, Andrew Kreisberg",
                    7.5
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_doom_patrol,
                    "Doom Patrol",
                    "49m",
                    "Jeremy Carver",
                    7.9
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_family_guy,
                    "Family Guy",
                    "22m",
                    "Seth MacFarlane",
                    8.1
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_greys_anatomy,
                    "Grey's Anatomy",
                    "43m",
                    "Shonda Rhimes",
                    7.6
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_hanna,
                    "HANNA",
                    "50m",
                    "David Farr",
                    7.5
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_ncis,
                    "NCIS",
                    "45m",
                    "Donald P. Bellisario, Don McGill",
                    7.7
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_riverdale,
                    "Riverdale",
                    "45m",
                    "Roberto Aguirre-Sacasa",
                    6.9
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_the_flash,
                    "The Flash",
                    "44m",
                    "Greg Berlanti, Geoff Johns, Andrew Kreisberg",
                    7.7
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_the_simpsons,
                    "The Simpsons",
                    "22m",
                    "Matt Groening",
                    8.6
                )
            )
            add(
                HomeEntity(
                    drawable.tv_shows_the_umbrella_academy,
                    "The Umbrella Academy",
                    "55m",
                    "Steve Blackman",
                    8.0
                )
            )
        }

        return tvShowsList
    }

}