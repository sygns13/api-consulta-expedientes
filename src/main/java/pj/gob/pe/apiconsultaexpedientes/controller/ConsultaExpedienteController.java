package pj.gob.pe.apiconsultaexpedientes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pj.gob.pe.apiconsultaexpedientes.exception.ModeloNotFoundException;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.entities.Expediente;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteAlimentos;
import pj.gob.pe.apiconsultaexpedientes.model.entities.ExpedienteFull;
import pj.gob.pe.apiconsultaexpedientes.service.ConsultaExpedienteService;
import pj.gob.pe.apiconsultaexpedientes.service.ExpedienteService;

@RestController
@RequestMapping("/consultaExpediente")
public class ConsultaExpedienteController {

    @Autowired
    private ConsultaExpedienteService consultaExpedienteService;

    @Autowired
    private ExpedienteService expedienteService;

    @GetMapping("/{numeroExpediente}")
    public ResponseEntity<ExpedienteAlimentos> listarPorId(@PathVariable("numeroExpediente") String numeroExpediente) throws Exception{

        Expediente expediente = new Expediente();
        expediente.setNumeroExpediente(numeroExpediente);
        ExpedienteAlimentos obj = consultaExpedienteService.getExpedienteAlimentos(expediente);

        if(obj == null) {
            throw new ModeloNotFoundException("Expediente no encontrado: "+ numeroExpediente);
        }

        return new ResponseEntity<ExpedienteAlimentos>(obj, HttpStatus.OK);
    }

    @GetMapping("/buscarpornunico/{n_unico}")
    public ResponseEntity<ExpedienteFull> buscarPorNUnico(@PathVariable("n_unico") Long nUnico) throws Exception{

        ExpedienteFull expediente = expedienteService.getExpedienteFull(nUnico);
        if(expediente == null) {
            throw new ModeloNotFoundException("N UNICO NO ENCONTRADO "+ nUnico);
        }

        return new ResponseEntity<ExpedienteFull>(expediente, HttpStatus.OK);
    }

    @GetMapping("/buscarcabexpediente/{numeroExpediente}")
    public ResponseEntity<CabExpedienteDTO> buscarPorExpediente(@PathVariable("numeroExpediente") String numeroExpediente) throws Exception{

        CabExpedienteDTO expediente = expedienteService.findByNumeroExpediente(numeroExpediente);
        if(expediente == null) {
            throw new ModeloNotFoundException("EXPEDIENTE NO ENCONTRADO "+ numeroExpediente);
        }

        return new ResponseEntity<CabExpedienteDTO>(expediente, HttpStatus.OK);
    }
}
