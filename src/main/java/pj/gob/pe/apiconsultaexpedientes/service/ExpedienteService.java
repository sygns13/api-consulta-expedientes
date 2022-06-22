package pj.gob.pe.apiconsultaexpedientes.service;

import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;

public interface ExpedienteService {

    ExpedienteFull getExpedienteFull(Long id) throws Exception;

    CabExpedienteDTO findByNumeroExpediente(String numeroExpediente) throws Exception;
}
