package ssafy.library.service;

import org.springframework.transaction.annotation.Transactional;
import ssafy.library.service.dto.AddMemberDto;
import ssafy.library.service.dto.EditMemberDto;
import ssafy.library.service.dto.MemberDto;

import java.util.List;

@Transactional
public interface MemberService {

    Long addMember(AddMemberDto member);

    @Transactional(readOnly = true)
    List<MemberDto> searchMembers(String name);

    Long editMember(Long memberId, EditMemberDto member);

    Long removeMember(Long memberId);
}
