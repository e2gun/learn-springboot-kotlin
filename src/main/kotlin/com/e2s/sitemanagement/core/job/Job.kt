package com.e2s.sitemanagement.core.job

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Job(

        @Id
        @GeneratedValue
        var id: Long? = null,

        @Column(name = "\"name\"")
        var name: String? = null
)