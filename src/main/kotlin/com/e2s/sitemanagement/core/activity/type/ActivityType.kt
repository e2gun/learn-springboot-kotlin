package com.e2s.sitemanagement.core.activity.type

import javax.persistence.*

@Entity
@Table(name = "activities_type", schema = "public")
class ActivityType(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Short = 0,

        @Column(name = "activities_type_name")
        val activities_type_name: String = ""

)