package controller;

import org.kgotla.society.model.Member;
import org.kgotla.society.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/member")
    public Member createQuestion(@Valid @RequestBody Member member) {
        return memberRepository.save(member);
    }
    @GetMapping("/members")
    public Page<Member> getQuestions(Pageable pageable) {
        return memberRepository.findAll(pageable);
    }
}
