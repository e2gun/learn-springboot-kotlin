package com.e2s.sitemanagement.api

import com.e2s.sitemanagement.core.person.Person
import com.e2s.sitemanagement.core.person.PersonService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/persons")
class PersonRestController(private val personService: PersonService) {

    @GetMapping
    fun getAllPerson() = personService.getAll()

    @GetMapping("/{person}")
    fun getById(@PathVariable person: Person) = person

    @PostMapping
    fun save(@RequestBody person: Person) = personService.save(person)

    @PutMapping("/{person}")
    fun update(@RequestBody person: Person) = personService.save(person)

    @DeleteMapping("/{person}")
    fun delete(@RequestBody person: Person) = personService.delete(person)
}