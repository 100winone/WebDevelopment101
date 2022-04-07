package com.example.demo.persistence;

import com.example.demo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    // JpaRepositoru<T, ID>
    // 첫 번째 매개변수 T  -> 테이블 매핑되는 엔티티 클래스
    // 두 번째 매개변수 ID -> 기본 키의 id 타입

//    @Query("select * from Todo t where t.userid =?1")
    List<TodoEntity> findByUserId(String userId);



}
