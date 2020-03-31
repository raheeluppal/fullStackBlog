package com.zipcode.fullstackblog.repositories;

import com.zipcode.fullstackblog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Post, Long>
{
}