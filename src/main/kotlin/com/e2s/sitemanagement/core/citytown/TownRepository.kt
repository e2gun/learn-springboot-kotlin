package com.e2s.sitemanagement.core.citytown

import org.springframework.data.jpa.repository.JpaRepository

interface TownRepository : JpaRepository<Town,Long>{

    fun findByCityId(cityId : Int) : List<Town>
}