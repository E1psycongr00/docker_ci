package com.example.docker_ci.repository;


import com.example.docker_ci.entity.MemberEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    boolean existsByEmail(String email);

    Optional<MemberEntity> findByEmail(String email);


}
