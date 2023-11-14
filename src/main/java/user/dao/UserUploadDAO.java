package user.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.bean.UserUploadDTO;

@Repository											// 엔티티 객체    , @id 타입
public interface UserUploadDAO extends JpaRepository<UserUploadDTO, Integer>{ // 프라이머리 키가 int형이여서 Integer

	public List<UserUploadDTO> findAllByOrderBySeqDesc(); 

}              
