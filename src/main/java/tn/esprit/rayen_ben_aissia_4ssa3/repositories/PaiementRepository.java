package tn.esprit.rayen_ben_aissia_4ssa3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.rayen_ben_aissia_4ssa3.entity.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
