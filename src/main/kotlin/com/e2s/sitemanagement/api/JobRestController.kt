package com.e2s.sitemanagement.api

import com.e2s.sitemanagement.core.job.Job
import com.e2s.sitemanagement.core.job.JobService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/jobs")
class JobRestController(private val jobService: JobService) {

    @GetMapping
    fun getAllJob() = jobService.getAll()

    @GetMapping("/{job}")
    fun getById(@PathVariable job: Job) = job

    @PostMapping
    fun save(@RequestBody job: Job) = jobService.save(job)

    @PutMapping("/{job}")
    fun update(@RequestBody job: Job) = jobService.save(job)

    @DeleteMapping("/{job}")
    fun delete(@RequestBody job: Job) = jobService.delete(job)
}