package com.graphql.demonstration.domain


interface CountryClient {
    suspend fun getCountries() : List<CountryModel>
}