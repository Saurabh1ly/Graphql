package com.graphql.demonstration.data

import com.apollographql.apollo3.ApolloClient
import com.graphql.CountriesQuery
import com.graphql.demonstration.domain.CountryClient
import com.graphql.demonstration.domain.CountryModel

class ApolloCountryClient(
    private val apolloClient: ApolloClient
) : CountryClient {

    override suspend fun getCountries(): List<CountryModel> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map { it.toCountryModel() }
            ?: emptyList()
    }
}