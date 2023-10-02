package com.e2s.sitemanagement.domain

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/")
    fun index(): String {
        return "dashboard/index"
    }
}