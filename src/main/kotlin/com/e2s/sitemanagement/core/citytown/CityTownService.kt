package com.e2s.sitemanagement.core.citytown

import org.springframework.stereotype.Service

@Service
class CityTownService(private val cityRepository: CityRepository,private val townRepository: TownRepository) {

    fun getCityAll() = cityRepository.findAll()

    fun getTownAll() = townRepository.findAll()

    fun getTownByCityId(cityId : Int) = townRepository.findByCityId(cityId)
}