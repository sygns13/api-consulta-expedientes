package pj.gob.pe.apiconsultaexpedientes.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;

public interface ExpedienteRepo extends JpaRepository<ExpedienteFull, Long> {


}
