package com.techfest.project.repository;

import com.techfest.project.entity.Houses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<Houses,Long> {


}
