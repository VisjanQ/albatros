package com.techfest.project.repository;

import com.techfest.project.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Jobs,Long> {




}
