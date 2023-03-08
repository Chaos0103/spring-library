package ssafy.library.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberDto {
    private String name;
    private String birth;
    private String phone;
    private String email;
    private String zipcode;
    private String mainAddress;
    private String subAddress;
}
