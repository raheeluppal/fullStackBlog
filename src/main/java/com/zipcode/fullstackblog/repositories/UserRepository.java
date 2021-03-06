package com.zipcode.fullstackblog.repositories;

import com.zipcode.fullstackblog.models.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}
