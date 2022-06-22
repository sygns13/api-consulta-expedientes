package pj.gob.pe.apiconsultaexpedientes.model.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonFormat;
import pj.gob.pe.apiconsultaexpedientes.model.dto.CabExpedienteDTO;
import pj.gob.pe.apiconsultaexpedientes.model.dto.PartesExpedienteDTO;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Schema(description = "Expediente de Response de Demandas de Alimentos Model")
public class ExpedienteAlimentos {

    private static final long serialVersionUID = 1L;

    private String numeroExpediente;

    private String secuencia1;
    private Integer anio;
    private Integer numero1;
    private Integer numero2;
    private String secuencia2;
    private String secuencia3;
    private String secuencia4;

    private CabExpedienteDTO datosExpediente;

    private List<PartesExpedienteDTO> partesExpediente;

    public ExpedienteAlimentos() {
    }


    public ExpedienteAlimentos(String numeroExpediente, String secuencia1, Integer anio, Integer numero1, Integer numero2, String secuencia2, String secuencia3, String secuencia4, CabExpedienteDTO datosExpediente, List<PartesExpedienteDTO> partesExpediente) {
        this.numeroExpediente = numeroExpediente;
        this.secuencia1 = secuencia1;
        this.anio = anio;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.secuencia2 = secuencia2;
        this.secuencia3 = secuencia3;
        this.secuencia4 = secuencia4;
        this.datosExpediente = datosExpediente;
        this.partesExpediente = partesExpediente;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getSecuencia1() {
        return secuencia1;
    }

    public void setSecuencia1(String secuencia1) {
        this.secuencia1 = secuencia1;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public String getSecuencia2() {
        return secuencia2;
    }

    public void setSecuencia2(String secuencia2) {
        this.secuencia2 = secuencia2;
    }

    public String getSecuencia3() {
        return secuencia3;
    }

    public void setSecuencia3(String secuencia3) {
        this.secuencia3 = secuencia3;
    }

    public String getSecuencia4() {
        return secuencia4;
    }

    public void setSecuencia4(String secuencia4) {
        this.secuencia4 = secuencia4;
    }

    public CabExpedienteDTO getDatosExpediente() {
        return datosExpediente;
    }

    public void setDatosExpediente(CabExpedienteDTO datosExpediente) {
        this.datosExpediente = datosExpediente;
    }

    public List<PartesExpedienteDTO> getPartesExpediente() {
        return partesExpediente;
    }

    public void setPartesExpediente(List<PartesExpedienteDTO> partesExpediente) {
        this.partesExpediente = partesExpediente;
    }
}
