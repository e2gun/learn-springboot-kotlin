package com.e2s.sitemanagement.core.apartment

import com.e2s.sitemanagement.core.site.Site
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name = "apartment", schema = "public")
data class Apartment (

        @Id
        @GeneratedValue
        var id : Long? = null,

        @ManyToOne
        @JoinColumn(name = "Site")
        var site : Site? = null,

        @field:NotBlank(message = "*")
        var blockName : String = "",

        @field:NotBlank(message = "*")
        var numberOfFloors : String = "",

        @field:NotBlank(message = "*")
        var apartmanNo : String = "",

        var status : Boolean = false,

        var numberOfRoom : String = "",

        var createdAt : LocalDateTime = LocalDateTime.now()

)