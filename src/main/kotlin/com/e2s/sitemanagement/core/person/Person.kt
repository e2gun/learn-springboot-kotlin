package com.e2s.sitemanagement.core.person

import com.e2s.sitemanagement.core.apartment.Apartment
import com.e2s.sitemanagement.core.job.Job
import com.e2s.sitemanagement.core.person.type.PersonType
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.*

@Entity
@Table(name = "persons", schema = "public")
data class Person(

        @Id
        @GeneratedValue
        var id: Long? = null,

        @field:NotBlank(message="*")
        var userName: String? = "",

        @field:NotBlank(message="*")
        @field:Size(min = 8,message = "En Az 8 Karakter Girmelisiniz")
        var passwrd: String? = "",

        @field:NotBlank(message="*")
        var firstName: String = "",

        @field:NotBlank(message="*")
        var lastName: String = "",

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        var birthDate: LocalDateTime? = null,

        @field:Email(message = "Doğru Mail Adresi Girmelisiniz")
        var email: String? = null,

        var telephone: String? = null,

        @field:NotBlank(message="*")
        var cellPhone: String? = null,

        var gender: String = "",

        var note: String? = null,

        var isBlackList : Boolean = false,

        @ManyToOne
        @JoinColumn(name="Job")
        var job : Job? = null,

        @ManyToOne
        @JoinColumn(name="Apartment")
        @field:NotNull(message="*")
        var apartment : Apartment? = null,

        @ManyToOne
        @JoinColumn(name="PersonType")
        @field:NotNull(message="*")
        var personType : PersonType? = null,

        var lastLoginTime: LocalDateTime? = null

){
        enum class Gender(val description : String){
                MAN("Bay"),
                WOMEN("Bayan")
        }
}
