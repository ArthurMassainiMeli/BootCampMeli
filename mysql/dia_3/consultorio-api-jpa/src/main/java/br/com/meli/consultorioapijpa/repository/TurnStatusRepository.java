package br.com.meli.consultorioapijpa.repository;

import br.com.meli.consultorioapijpa.entity.TurnStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnStatusRepository extends JpaRepository<TurnStatus, Integer> {
}
