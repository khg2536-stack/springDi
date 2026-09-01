package com.oraclejava.springdi;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void registerStudent(String name){
        System.out.println(name + "학생이 등록되었습니다.");
    }

    public void deleteStudent(String name){
        System.out.println(name + "학생이 삭제되었습니다.");
    }

    public void updateStudent(String name){
        System.out.println(name + "학생이 갱신되었습니다.");
    }
}
