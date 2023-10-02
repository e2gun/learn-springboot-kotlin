package com.e2s.sitemanagement

import com.e2s.sitemanagement.core.apartment.Apartment
import com.e2s.sitemanagement.core.apartment.ApartmentRepository
import com.e2s.sitemanagement.core.citytown.City
import com.e2s.sitemanagement.core.citytown.CityRepository
import com.e2s.sitemanagement.core.citytown.Town
import com.e2s.sitemanagement.core.citytown.TownRepository
import com.e2s.sitemanagement.core.job.Job
import com.e2s.sitemanagement.core.job.JobRepository
import com.e2s.sitemanagement.core.person.type.PersonType
import com.e2s.sitemanagement.core.person.type.PersonTypeRepository
import com.e2s.sitemanagement.core.site.Site
import com.e2s.sitemanagement.core.site.SiteRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.time.LocalDateTime

@SpringBootApplication
class SiteManagementApplication {

    @Bean
    fun runner(jobRepository: JobRepository,
               personTypeRepository: PersonTypeRepository,
               apartmentRepository: ApartmentRepository,
               cityRepository: CityRepository,
               townRepository: TownRepository,
               siteRepository: SiteRepository) = ApplicationRunner {
        with(jobRepository) {
            save(Job(name = "İş 1"))
            save(Job(name = "İş 2"))
            save(Job(name = "İş 3"))
            save(Job(name = "İş 4"))
        }
        with(personTypeRepository){
            save(PersonType(personTypeName = "Yönetici"))
            save(PersonType(personTypeName = "Apartman Sakini"))
            save(PersonType(personTypeName = "Kapıcı"))
        }

        with(townRepository){
            save(Town(townName = "İlkadım",city =  cityRepository.save(City(cityName = "Samsun"))))
        }

        with(siteRepository){
            save(Site(
                    siteName = "StarTower Apartmanı",
                    siteNumber = "A",
                    address = "ÇayırAlan Sok.",
                    mapLocation = "28.000,41.000",
                    siteBuildingDate = LocalDateTime.now()))
        }

        with(apartmentRepository){
            save(Apartment(blockName= "A",numberOfFloors="16",apartmanNo="27",status = true,numberOfRoom="4+1"))
        }
    }
}

fun main(args: Array<String>) {
    runApplication<SiteManagementApplication>(*args)
}
