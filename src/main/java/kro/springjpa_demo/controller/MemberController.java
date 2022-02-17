package kro.springjpa_demo.controller;

import kro.springjpa_demo.domain.Member;
import kro.springjpa_demo.repository.MemberRepository;
import kro.springjpa_demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m/")
public class MemberController {

    @Autowired
    private MemberService service;

    @Autowired
    private MemberRepository repository;

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Object add(@RequestBody Member m) {
        return service.add(m);
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public Object list() {
        return service.findAll();
    }

    @RequestMapping(value = "list2",method = RequestMethod.GET)
    public Object list2() {
        return repository.findByPair();
    }


}
