package pj.gob.pe.apiconsultaexpedientes.model.entities;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Schema(description = "Expediente de Consulta Model")
//@Entity
//@Table(name = "almacens")
public class Expediente {

    private static final long serialVersionUID = 1L;

    @Schema(description = "Numero de expediente")
    @NotNull( message = "{expediente.numeroExpediente.notnull}")
    private String numeroExpediente;

    @Schema(description = "Secuencia de 2 digitos")
    @NotNull( message = "{expediente.secuencia1.notnull}")
    @Size(min = 5, max = 5, message = "{expediente.secuencia1.size}")
    private String secuencia1;

    @Schema(description = "Año del Expediente")
    @NotNull( message = "{expediente.anio.notnull}")
    @Min(value = 1000, message = "{expediente.anio.min}")
    @Max(value = 9999, message = "{expediente.anio.max}")
    private Integer anio;

    @Schema(description = "Número de 1 a 4 dígitos")
    @NotNull( message = "{expediente.numero1.notnull}")
    @Min(value = 1, message = "{expediente.numero1.min}")
    @Max(value = 9999, message = "{expediente.numero1.max}")
    private Integer numero1;

    @Schema(description = "Número de 4 dígitos")
    @NotNull( message = "{expediente.numero2.notnull}")
    @Min(value = 1000, message = "{expediente.numero2.min}")
    @Max(value = 9999, message = "{expediente.numero2.max}")
    private Integer numero2;

    @Schema(description = "Secuencia de 2 digitos")
    @NotNull( message = "{expediente.secuencia2.notnull}")
    @Size(min = 2, max =2, message = "{expediente.secuencia2.size}")
    private String secuencia2;

    @Schema(description = "Secuencia de 2 digitos")
    @NotNull( message = "{expediente.secuencia3.notnull}")
    @Size(min = 2, max =2, message = "{expediente.secuencia3.size}")
    private String secuencia3;

    @Schema(description = "Secuencia de 2 digitos")
    @NotNull( message = "{expediente.secuencia4.notnull}")
    @Size(min = 2, max =2, message = "{expediente.secuencia4.size}")
    private String secuencia4;

    public Expediente() {
    }

    public Expediente(String numeroExpediente, String secuencia1, Integer anio, Integer numero1, Integer numero2, String secuencia2, String secuencia3, String secuencia4) {
        this.numeroExpediente = numeroExpediente;
        this.secuencia1 = secuencia1;
        this.anio = anio;
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.secuencia2 = secuencia2;
        this.secuencia3 = secuencia3;
        this.secuencia4 = secuencia4;
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
}
