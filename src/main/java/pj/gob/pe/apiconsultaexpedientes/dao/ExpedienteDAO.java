package pj.gob.pe.apiconsultaexpedientes.dao;

import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.dto.PartesExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;

import java.util.List;

public interface ExpedienteDAO {

    List<ExpedienteFull> Listar() throws Exception;

    ExpedienteFull BuscarPorId(Long id) throws Exception;

    CabExpedienteDTO findByNumeroExpediente(String numeroExpediente) throws Exception;

    List<PartesExpedienteDTO> findPartesByNumeroExpediente(String numeroExpediente) throws Exception;
}
