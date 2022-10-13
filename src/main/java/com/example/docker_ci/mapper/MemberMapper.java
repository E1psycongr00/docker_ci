package com.example.docker_ci.mapper;

import com.example.docker_ci.dto.MemberDto;
import com.example.docker_ci.dto.RequestMemberDto;
import com.example.docker_ci.dto.ResponseMemberDto;
import com.example.docker_ci.entity.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MemberMapper {

    MemberMapper instance = Mappers.getMapper(MemberMapper.class);

    MemberEntity convertToEntity(MemberDto memberDto);
    MemberDto convertToDto(MemberEntity memberEntity);

    MemberDto convertToDto(RequestMemberDto requestMemberDto);

    ResponseMemberDto convertToResponseDto(MemberDto memberDto);
}
