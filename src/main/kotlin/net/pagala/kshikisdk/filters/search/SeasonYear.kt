package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.Season

class SeasonYear {
    private var season: Season?
    private var year: Int
    private var yearFrom: Int
    private var yearTo: Int

    constructor(season: Season?, year: Int) {
        this.season = season
        this.year = year
        yearFrom = 0
        yearTo = 0
    }

    constructor(year: Int) {
        season = null
        this.year = year
        yearFrom = 0
        yearTo = 0
    }

    constructor(yearFrom: Int, yearTo: Int) {
        season = null
        year = 0
        this.yearFrom = yearFrom
        this.yearTo = yearTo
    }

    override fun toString(): String {
        if (season != null && year != 0) {
            return season.toString() + "_" + year
        } else if (season == null && year != 0) {
            return year.toString()
        } else if (yearFrom != 0 && yearTo != 0) {
            return yearFrom.toString() + "_" + yearTo.toString()
        }
        return ""
    }
}
