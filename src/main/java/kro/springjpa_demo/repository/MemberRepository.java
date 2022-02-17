package kro.springjpa_demo.repository;

import kro.springjpa_demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {

    @Query("SELECT m FROM member m WHERE m.mbrNo > 2")
    List<Member> findByPair();
}
