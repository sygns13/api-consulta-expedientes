package pj.gob.pe.apiconsultaexpedientes.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pj.gob.pe.apiconsultaexpedientes.dao.ExpedienteDAO;
import pj.gob.pe.apiconsultaexpedientes.dao.repo.ExpedienteRepo;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pj.gob.pe.apiconsultaexpedientes.model.dto.PartesExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;

import java.util.List;

@Repository
@Component
public class ExpedienteDAOImpl implements ExpedienteDAO {

    Logger logger = LoggerFactory.getLogger(ExpedienteDAOImpl.class);

    @Autowired
    private ExpedienteRepo expedienteRepo;

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<ExpedienteFull> Listar() throws Exception {
        return expedienteRepo.findAll();
    }

    @Override
    public ExpedienteFull BuscarPorId(Long id) throws Exception {
        return expedienteRepo.findById(id).orElse(null);
    }

    @Override
    public CabExpedienteDTO findByNumeroExpediente(String numeroExpediente) throws Exception {
        TypedQuery<CabExpedienteDTO> query = entityManager.createNamedQuery("ExpedienteFullQuery", CabExpedienteDTO.class);
        query.setParameter("numeroExpediente", numeroExpediente);
        CabExpedienteDTO cabExpediente = null;

        try {
            cabExpediente = query.getSingleResult();
        }catch (Exception ignored){
            logger.warn("No se encontró datos");
        }

        return cabExpediente;
    }

    @Override
    public List<PartesExpedienteDTO> findPartesByNumeroExpediente(String numeroExpediente) throws Exception {

        return entityManager.createNamedQuery("PartesExpedienteQuery", PartesExpedienteDTO.class)
                .setParameter("numeroExpediente", numeroExpediente)
                .getResultList();
    }

}
