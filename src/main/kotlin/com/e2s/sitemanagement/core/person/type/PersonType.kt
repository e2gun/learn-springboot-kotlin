package com.e2s.sitemanagement.core.person.type

import javax.persistence.*

@Entity
@Table(name = "person_type", schema = "public")
class PersonType(

        @Id
        @GeneratedValue
        @Column(name = "id")
        var id: Short? = null,

        @Column(name = "person_type_name")
        var personTypeName: String = "",

        @Column(name = "display")
        var display: Boolean = true

)