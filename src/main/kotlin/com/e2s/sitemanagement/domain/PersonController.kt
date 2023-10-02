package com.e2s.sitemanagement.domain

import com.e2s.sitemanagement.core.job.JobService
import org.slf4j.LoggerFactory
import com.e2s.sitemanagement.core.person.Person
import com.e2s.sitemanagement.core.person.PersonService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@Controller
@RequestMapping(value="/persons")
class PersonController(private val personService: PersonService,
                       private val jobService: JobService) {

    private val log = LoggerFactory.getLogger(PersonController::class.java)

    @GetMapping(value = "/add")
    fun person(model: Model) : String {
        model["gender"] =  Person.Gender.values()
        model["job"] = jobService.getAll()
        model["personType"] = personService.getPersonTypes()
        model["person"] =  Person()

        return "person/add"
    }

    @GetMapping(value = "/list")
    fun personList(model: Model) : String {
        model["persons"] = personService.getAll()
        return "person/list"
    }

    @PostMapping
    fun save(@Valid @ModelAttribute person: Person, bindingResult: BindingResult,model: Model): String {
        if (bindingResult.hasErrors()) {
            model["person"] = person
            /*
            model.addAttribute("gender", Person.Gender.values())
            model.addAttribute("job",jobService.getAll())
            model.addAttribute("personType",personService.getPersonTypes())
            model.addAttribute("person", )
            */
            return "person/add"
        }else {
            personService.save(person)
            return "person/add"
        }
    }

}