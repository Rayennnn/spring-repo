package tn.esprit.rayen_ben_aissia_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.rayen_ben_aissia_4ssa3.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {
}
