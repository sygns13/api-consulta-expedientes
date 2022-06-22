package pj.gob.pe.apiconsultaexpedientes.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.io.Serializable;

@Schema(description = "Cabecera de Expediente Model")
@Entity
@SqlResultSetMapping(
        name = "ExpedienteFullMapping",
        entities = @EntityResult(
                entityClass = CabExpedienteDTO.class,
                fields = {
                        @FieldResult(name = "nUnico", column = "N_UNICO"),
                        @FieldResult(name = "numeroExpediente", column = "NUM_EXP"),
                        @FieldResult(name = "sede", column = "SEDE"),
                        @FieldResult(name = "organo", column = "ORGANO"),
                        @FieldResult(name = "especialidad", column = "ESPECIALIDAD"),
                        @FieldResult(name = "instancia", column = "INSTANCIA"),
                        @FieldResult(name = "juez", column = "JUEZ"),
                        @FieldResult(name = "secretario", column = "SECRETARIO")
                })
)

@NamedNativeQueries({
        @NamedNativeQuery(
                name = "ExpedienteFullQuery",
                query = " select exp.n_unico as N_UNICO, " +
                        "       exp.x_formato AS NUM_EXP, " +
                        "       sed.x_desc_sede AS SEDE, " +
                        "       org.x_nom_org_jurisd AS ORGANO, " +
                        "       esp.x_desc_especialidad AS ESPECIALIDAD, " +
                        "       inst.x_nom_instancia AS INSTANCIA, " +
                        "       usu1.x_nom_usuario as JUEZ, " +
                        "       ususec.x_nom_usuario as SECRETARIO  " +
                        " from " +
                        "       expediente exp " +
                        " inner join " +
                        "       instancia inst on exp.c_instancia=inst.c_instancia" +
                        " inner join " +
                        "        sede sed on inst.c_sede=sed.c_sede " +
                        " inner join " +
                        "         organo_jurisdiccional org on inst.c_org_jurisd=org.c_org_jurisd " +
                        " inner join " +
                        "         especialidad esp on exp.c_especialidad=esp.c_especialidad " +
                        " inner join " +
                        "         usuario_instancia usu on inst.c_instancia=usu.c_instancia and sed.c_sede=usu.c_sede and " +
                        "         usu.c_usuario in (select c_usuario from usuario where c_perfil in('01')) and usu.l_activo='S' and usu.l_titular='S' " +
                        " inner join " +
                        "         usuario usu1 on usu.c_usuario=usu1.c_usuario " +
                        " inner join " +
                        "         asignado_a ag on exp.n_unico=ag.n_unico " +
                        " inner join " +
                        "         usuario ususec on ag.c_usuario=ususec.c_usuario " +
                        " where " +
                        "         (exp.x_formato=:numeroExpediente)",
                resultSetMapping = "ExpedienteFullMapping"
        )
}) // @formatter:on


public class CabExpedienteDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name="N_UNICO")
    @Id
    private Long nUnico;

    @Column(name="NUM_EXP")
    private String numeroExpediente;

    @Column(name="SEDE")
    private String sede;

    @Column(name="ORGANO")
    private String organo;

    @Column(name="ESPECIALIDAD")
    private String especialidad;

    @Column(name="INSTANCIA")
    private String instancia;

    @Column(name="JUEZ")
    private String juez;

    @Column(name="SECRETARIO")
    private String secretario;

    public CabExpedienteDTO() {
    }

    public CabExpedienteDTO(Long nUnico, String numeroExpediente, String sede, String organo, String especialidad, String instancia, String juez, String secretario) {
        this.nUnico = nUnico;
        this.numeroExpediente = numeroExpediente;
        this.sede = sede;
        this.organo = organo;
        this.especialidad = especialidad;
        this.instancia = instancia;
        this.juez = juez;
        this.secretario = secretario;
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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getOrgano() {
        return organo;
    }

    public void setOrgano(String organo) {
        this.organo = organo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getInstancia() {
        return instancia;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public String getJuez() {
        return juez;
    }

    public void setJuez(String juez) {
        this.juez = juez;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }
}
