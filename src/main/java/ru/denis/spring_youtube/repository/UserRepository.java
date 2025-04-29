package ru.denis.spring_youtube.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select * from users where email = :email",  nativeQuery = true)
    Optional<User> findByEmail(String email);

//    @Query(value = "select u from User u where u.email = :email")
//    User findByEmail(){};

//    User findByEmailAndAgeAfterAndBirth(String email, Integer ageAfter, LocalDate birth);
}
