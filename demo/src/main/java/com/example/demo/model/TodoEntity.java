package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Todo") // 테이블 이름 추가, 지정하지 않을 시 클래스의 이름을 테이블 이름으로 간주
public class TodoEntity {
    @Id
    @GeneratedValue(generator = "system-uuid") // ID 자동으로 생성시킴
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;      // 이 오브젝트의 아이디
    private String userId;  // 이 오브젝트를 생성한 사용자의 아이디
    private String title;   // Todo 타이틀 (예: 운동하기)
    private boolean done;   // true - todo를 완료한 경우(checked)
}
