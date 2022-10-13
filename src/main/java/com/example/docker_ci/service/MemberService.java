package com.example.docker_ci.service;

import com.example.docker_ci.dto.MemberDto;
import com.example.docker_ci.entity.MemberEntity;
import com.example.docker_ci.mapper.MemberMapper;
import com.example.docker_ci.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public MemberDto join(MemberDto memberDto) throws RuntimeException{
        if (memberRepository.existsByEmail(memberDto.getEmail())) {
            throw new RuntimeException("중복 예외");
        }
        MemberEntity memberEntity = MemberMapper.instance.convertToEntity(memberDto);
        MemberEntity savedEntity = memberRepository.save(memberEntity);
        return MemberMapper.instance.convertToDto(savedEntity);
    }

    public MemberDto findMemberByEmail(String email) {
        MemberEntity entity = memberRepository.findByEmail(email)
            .orElseThrow(() -> new RuntimeException("회원 이름을 찾을 수 없습니다"));
        return MemberMapper.instance.convertToDto(entity);
    }
}
