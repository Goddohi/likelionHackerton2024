package Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepositroy extends JpaRepository<Member, Long> {
}

