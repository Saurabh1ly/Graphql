package com.graphql.demonstration

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.graphql.demonstration.domain.CountryClient
import com.graphql.demonstration.domain.CountryModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val countryClient: CountryClient
) : ViewModel() {

    private val _countries = MutableLiveData<List<CountryModel>>()
    val countryList: LiveData<List<CountryModel>>
        get() = _countries

    fun getCountries() {
        viewModelScope.launch {
            _countries.value = countryClient.getCountries()
        }
    }
}