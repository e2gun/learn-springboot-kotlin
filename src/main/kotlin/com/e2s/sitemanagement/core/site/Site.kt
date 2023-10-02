package com.e2s.sitemanagement.core.site

import com.e2s.sitemanagement.core.citytown.City
import com.e2s.sitemanagement.core.citytown.Town
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "sites", schema = "public")
data class Site (

        @Id
        @GeneratedValue
        var id : Long? = null,

        @field:NotBlank(message = "*")
        var siteName : String = "",

        @field:NotBlank(message = "*")
        var siteNumber : String = "",

        var address : String = "",

        var mapLocation : String? = null,

        var createdAt : LocalDateTime = LocalDateTime.now(),

        var siteBuildingDate : LocalDateTime? = null,

        @ManyToOne
        @JoinColumn(name="City")
        var city : City? = null,

        @ManyToOne
        @JoinColumn(name="Town")
        var town : Town? = null

)