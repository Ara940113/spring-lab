package site.metacoding.dbproject.domain.user;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import org.hibernate.criterion.NotNullExpression;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

// JPA 라이브러리는 Java(자바언어) Persistence(DB에 영구적인 저장) API(노출되어 있는 메서드)
// 1. CRUD 메서드를 기본 제공
// 2. 자바코드로 DB를 자동생성 - 이거해보자
// 3. ORM제공!! - (Object Realation Mapping)

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity // 서버 실행시 해당 클래스로 테이블을 생성하라는 어노테이션
@EntityListeners(AuditingEntityListener.class) // 현재시간을 입력을 위해 필요한 어노테이션
public class User {
    // identity 전략은 db에게 번호증가 전략을 위임하는 것 - 알아서 디비에 맞게 찾아준다.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // 프라이머리키

    // 길이 20 유니크
    @Column(length = 20, unique = true)
    private String username; // ssar 아이디

    // 12자, not null 걸기
    @Column(length = 12, nullable = false)
    private String password;

    @Column(length = 16000000)
    private String email;

    @CreatedDate // insert
    private LocalDateTime createDate;
    @LastModifiedDate // insert.update
    private LocalDateTime updateDate;
}
