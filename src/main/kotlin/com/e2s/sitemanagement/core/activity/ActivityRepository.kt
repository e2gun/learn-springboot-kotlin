package com.e2s.sitemanagement.core.activity

import org.springframework.data.jpa.repository.JpaRepository

interface ActivityRepository : JpaRepository<Activity, Long>