package ssafy.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ssafy.library.repository.MemberRepository;
import ssafy.library.service.MemberService;
import ssafy.library.service.dto.AddMemberDto;
import ssafy.library.service.dto.EditMemberDto;
import ssafy.library.service.dto.MemberDto;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Long addMember(AddMemberDto member) {
        return null;
    }

    @Override
    public List<MemberDto> searchMembers(String name) {
        return null;
    }

    @Override
    public Long editMember(Long memberId, EditMemberDto member) {
        return null;
    }

    @Override
    public Long removeMember(Long memberId) {
        return null;
    }
}
