package br.com.meli.consultorioapijpa.repository;

import br.com.meli.consultorioapijpa.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaryRepository extends JpaRepository<Diary, Integer> {
}
