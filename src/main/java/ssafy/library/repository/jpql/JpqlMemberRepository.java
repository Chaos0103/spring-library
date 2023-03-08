package ssafy.library.repository.jpql;

import org.springframework.stereotype.Repository;
import ssafy.library.repository.MemberRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class JpqlMemberRepository implements MemberRepository {

    @PersistenceContext
    private EntityManager em;
}
