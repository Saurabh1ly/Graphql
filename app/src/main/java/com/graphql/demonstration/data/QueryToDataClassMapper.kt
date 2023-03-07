package com.graphql.demonstration.data

import com.graphql.CountriesQuery
import com.graphql.demonstration.domain.CountryModel

fun CountriesQuery.Country.toCountryModel(): CountryModel {
    return CountryModel(
        code = code,
        name = name,
        emoji = emoji
    )
}
