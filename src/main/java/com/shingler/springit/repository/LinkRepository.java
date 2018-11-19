package com.shingler.springit.repository;


import com.shingler.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long>{
}
