package com.e2s.sitemanagement.core.citytown

import javax.persistence.*

@Entity
@Table(name = "town", schema = "public")
data class Town (

        @Id
        @GeneratedValue
        var id : Int? = null,

        var townName : String = "",

        @ManyToOne
        @JoinColumn(name = "City")
        var city: City? = null

)