package com.e2s.sitemanagement.core.person

import com.e2s.sitemanagement.core.person.type.PersonTypeRepository
import org.springframework.stereotype.Service

@Service
class PersonService(private val personRepository: PersonRepository, private val personTypeRepository: PersonTypeRepository) {

    fun getAll() = personRepository.findAll()

    fun save(person: Person) = personRepository.save(person)

    fun delete(person: Person) = personRepository.delete(person)

    fun getPersonTypes() = personTypeRepository.findAll()

}