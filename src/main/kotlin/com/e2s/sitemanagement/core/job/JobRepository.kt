package com.e2s.sitemanagement.core.job

import org.springframework.data.jpa.repository.JpaRepository

interface JobRepository : JpaRepository<Job, Long>