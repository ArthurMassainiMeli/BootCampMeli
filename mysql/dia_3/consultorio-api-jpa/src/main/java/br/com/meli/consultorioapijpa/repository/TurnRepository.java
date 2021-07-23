package br.com.meli.consultorioapijpa.repository;

import br.com.meli.consultorioapijpa.entity.Turn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnRepository extends JpaRepository<Turn, Integer> {
}
