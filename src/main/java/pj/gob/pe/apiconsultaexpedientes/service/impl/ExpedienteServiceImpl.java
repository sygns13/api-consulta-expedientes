package pj.gob.pe.apiconsultaexpedientes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pj.gob.pe.apiconsultaexpedientes.dao.ExpedienteDAO;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;
import pj.gob.pe.apiconsultaexpedientes.service.ExpedienteService;

@Service
public class ExpedienteServiceImpl implements ExpedienteService {

    @Autowired
    private ExpedienteDAO expedienteDAO;


    @Override
    public ExpedienteFull getExpedienteFull(Long id) throws Exception {
        return expedienteDAO.BuscarPorId(id);
    }

    @Override
    public CabExpedienteDTO findByNumeroExpediente(String numeroExpediente) throws Exception {
        return expedienteDAO.findByNumeroExpediente(numeroExpediente);
    }
}
