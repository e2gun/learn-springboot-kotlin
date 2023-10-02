package com.e2s.sitemanagement.core.citytown

import javax.persistence.*

@Entity
@Table(name = "city", schema = "public")
data class City (

    @Id
    @GeneratedValue
    var id : Int? = null,

    var cityName : String = ""

)