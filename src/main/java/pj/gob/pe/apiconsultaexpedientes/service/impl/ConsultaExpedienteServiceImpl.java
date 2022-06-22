package pj.gob.pe.apiconsultaexpedientes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pj.gob.pe.apiconsultaexpedientes.dao.ExpedienteDAO;
import pj.gob.pe.apiconsultaexpedientes.exception.ModeloNotFoundException;
import pj.gob.pe.apiconsultaexpedientes.exception.ValidationServiceException;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.dto.PartesExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.Expediente;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteAlimentos;
import pj.gob.pe.apiconsultaexpedientes.service.ConsultaExpedienteService;

import java.util.List;

@Service
public class ConsultaExpedienteServiceImpl implements ConsultaExpedienteService {

    @Autowired
    private ExpedienteDAO expedienteDAO;

    @Override
    public ExpedienteAlimentos getExpedienteAlimentos(Expediente expediente) throws Exception {

        this.validateExpediente(expediente);

        //Inicio de Consulta
        CabExpedienteDTO cabExpedienteDTO = expedienteDAO.findByNumeroExpediente(expediente.getNumeroExpediente());
        if(cabExpedienteDTO == null) {
            throw new ModeloNotFoundException("No se encontró el expediente");
        }

        List<PartesExpedienteDTO> partesExpedienteDTO = expedienteDAO.findPartesByNumeroExpediente(expediente.getNumeroExpediente());

        ExpedienteAlimentos expedienteAlimentos = new ExpedienteAlimentos();
        expedienteAlimentos.setNumeroExpediente(expediente.getNumeroExpediente());
        expedienteAlimentos.setAnio(expediente.getAnio());
        expedienteAlimentos.setNumero1(expediente.getNumero1());
        expedienteAlimentos.setNumero2(expediente.getNumero2());
        expedienteAlimentos.setSecuencia1(expediente.getSecuencia1());
        expedienteAlimentos.setSecuencia2(expediente.getSecuencia2());
        expedienteAlimentos.setSecuencia3(expediente.getSecuencia3());
        expedienteAlimentos.setSecuencia4(expediente.getSecuencia4());
        expedienteAlimentos.setDatosExpediente(cabExpedienteDTO);
        expedienteAlimentos.setPartesExpediente(partesExpedienteDTO);
        //Fin de Ejecucion de Consulta

        return expedienteAlimentos;
    }

    public void validateExpediente(Expediente expediente) {

        String []parts = expediente.getNumeroExpediente().split("-");

        if (parts.length != 7) {
            throw new ValidationServiceException("El número de expediente no es válido");
        }

        if(parts[0].length() != 5) {
            throw new ValidationServiceException("La primera parte del número de expediente no es válida (secuencia de 5 caracteres)");
        }
        expediente.setSecuencia1(parts[0]);

        if(parts[1].length() != 4) {
            throw new ValidationServiceException("La segunda parte del número de expediente no es válida (Año)");
        }

        Integer anio = this.tryParseNumber(parts[1]);
        if(anio == null) {
            throw new ValidationServiceException("La segunda parte del número de expediente no es válida (Año)");
        }
        expediente.setAnio(anio);

        if(parts[2].length() > 4) {
            throw new ValidationServiceException("La tercera parte del número de expediente no es válida (Número 1-4 dígitos)");
        }

        Integer numero1 = this.tryParseNumber(parts[2]);
        if(numero1 == null) {
            throw new ValidationServiceException("La tercera parte del número de expediente no es válida (Número 1-4 dígitos)");
        }
        expediente.setNumero1(numero1);

        if(parts[3].length() > 4) {
            throw new ValidationServiceException("La cuarta parte del número de expediente no es válida (Número 4 dígitos)");
        }

        Integer numero2 = this.tryParseNumber(parts[3]);
        if(numero2 == null) {
            throw new ValidationServiceException("La cuarta parte del número de expediente no es válida (Número 4 dígitos)");
        }
        expediente.setNumero2(numero2);

        if(parts[4].length() != 2) {
            throw new ValidationServiceException("La quinta parte del número de expediente no es válida (secuencia de 2 caracteres)");
        }
        expediente.setSecuencia2(parts[4]);

        if(parts[5].length() != 2) {
            throw new ValidationServiceException("La sexta parte del número de expediente no es válida (secuencia de 2 caracteres)");
        }
        expediente.setSecuencia3(parts[5]);

        if(parts[6].length() != 2) {
            throw new ValidationServiceException("La séptima parte del número de expediente no es válida (secuencia de 2 caracteres)");
        }
        expediente.setSecuencia4(parts[6]);
    }

    Integer tryParseNumber(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
