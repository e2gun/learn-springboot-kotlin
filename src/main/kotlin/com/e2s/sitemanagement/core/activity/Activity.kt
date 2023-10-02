package com.e2s.sitemanagement.core.activity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "activities", schema = "public")
data class Activity(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Long,

        @Column(name = "start_date")
        val start_date: Date,

        @Column(name = "end_date")
        var end_date: Date? = null,

        @Column(name = "note")
        var note: String? = null

        /*
        @ManyToOne
        @JoinColumn(name="activities_type")
        @Column(name = "activities_type_id")
        val activitiesType : ActivityType = ActivityType(),


        @ManyToOne
        @JoinColumn(name = "Person")
        @Column(name="person_id")
        val person : Person
        */
)