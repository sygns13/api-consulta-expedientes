package pj.gob.pe.apiconsultaexpedientes.service;

import pj.gob.pe.apiconsultaexpedientes.model.entities.Expediente;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteAlimentos;

public interface ConsultaExpedienteService {

    ExpedienteAlimentos getExpedienteAlimentos(Expediente expediente) throws Exception;
}
