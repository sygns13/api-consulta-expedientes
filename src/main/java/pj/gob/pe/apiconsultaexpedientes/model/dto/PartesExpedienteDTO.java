package pj.gob.pe.apiconsultaexpedientes.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.io.Serializable;

@Schema(description = "Partes de Expediente Model")
@Entity
@SqlResultSetMapping(
        name = "PartesExpedienteMapping",
        classes = @ConstructorResult(
                targetClass  = PartesExpedienteDTO.class,
                columns  = {
                        @ColumnResult(name = "N_UNICO", type = Long.class),
                        @ColumnResult(name = "NRO_EXP"),
                        @ColumnResult(name = "TIPO_PARTE"),
                        @ColumnResult(name = "PATERNO"),
                        @ColumnResult(name = "MATERNO"),
                        @ColumnResult(name = "NOMBRES"),
                        @ColumnResult(name = "DNI"),
                })
)

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "PartesExpedienteQuery",
                query = " select " +
                        "          exp.n_unico AS N_UNICO," +
                        "          exp.x_formato AS NRO_EXP, " +
                        "          tp.x_desc_parte as TIPO_PARTE," +
                        "          par.x_ape_paterno as PATERNO, " +
                        "          par.x_ape_materno AS MATERNO, " +
                        "          par.x_nombres as NOMBRES, " +
                        "          par.x_doc_id as DNI " +
                        " from " +
                        "          expediente exp " +
                        " inner join " +
                        "          parte par on exp.n_unico=par.n_unico " +
                        " inner join " +
                        "          tipo_parte tp on par.l_tipo_parte=tp.l_tipo_parte and exp.c_especialidad=tp.c_especialidad " +
                        " where " +
                        "         (exp.x_formato=:numeroExpediente)",
                resultSetMapping = "PartesExpedienteMapping"
        )
}) // @formatter:on


public class PartesExpedienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name="N_UNICO")
    @Id
    private Long nUnico;

    @Column(name="NRO_EXP")
    private String numeroExpediente;

    @Column(name="TIPO_PARTE")
    private String tipoParte;

    @Column(name="PATERNO")
    private String paterno;

    @Column(name="MATERNO")
    private String materno;

    @Column(name="NOMBRES")
    private String nombres;

    @Column(name="DNI")
    private String dni;

    public PartesExpedienteDTO() {
    }

    public PartesExpedienteDTO(Long nUnico, String numeroExpediente, String tipoParte, String paterno, String materno, String nombres, String dni) {
        this.nUnico = nUnico;
        this.numeroExpediente = numeroExpediente;
        this.tipoParte = tipoParte;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.dni = dni;
    }

    public Long getnUnico() {
        return nUnico;
    }

    public void setnUnico(Long nUnico) {
        this.nUnico = nUnico;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getTipoParte() {
        return tipoParte;
    }

    public void setTipoParte(String tipoParte) {
        this.tipoParte = tipoParte;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
