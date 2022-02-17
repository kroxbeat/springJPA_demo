package kro.springjpa_demo.service;

import kro.springjpa_demo.domain.Member;
import kro.springjpa_demo.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MemberService {

    @Autowired
    private MemberRepository repository;

    public Member add(Member m) {
        log.info("called ..");
        return repository.save(m);
    }

    public List<Member> findAll() {
        log.info("called ..");
        return repository.findAll();
    }

}
