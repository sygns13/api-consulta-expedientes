package pj.gob.pe.apiconsultaexpedientes.model.entities;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Schema(description = "Expediente Full Model")
@Entity
@Table(name = "expediente")
public class ExpedienteFull implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="n_unico")
    private Long nUnico;

    @Column(name="n_incidente", nullable = true)
    private Integer nIncidente;

    @Column(name="c_usuario", nullable = true)
    private String cUsuario;

    @Column(name="f_inicio", nullable = true)
    private LocalDateTime fInicio;

    @Column(name="f_termino", nullable = true)
    private LocalDateTime fTermino;

    @Column(name="c_distrito", nullable = true)
    private String cDistrito;

    @Column(name="c_provincia", nullable = true)
    private String cProvincia;

    @Column(name="c_instancia", nullable = true)
    private String cInstancia;

    @Column(name="c_especialidad", nullable = true)
    private String cEspecialidad;

    @Column(name="c_incidente", nullable = true)
    private String cIncidente;

    @Column(name="n_unico_relacion", nullable = true)
    private Long nUnicoRelacion;

    @Column(name="l_anulado", nullable = true)
    private String lAnulado;

    @Column(name="l_acumulado", nullable = true)
    private String lAcumulado;

    @Column(name="n_nro_exp_origen", nullable = true)
    private Integer nNroExpOrigen;

    @Column(name="n_ano_exp_origen", nullable = true)
    private Integer nAnoExpOrigen;

    @Column(name="f_auto_apertura", nullable = true)
    private LocalDateTime fAutoApertura;

    @Column(name="f_ing_origen", nullable = true)
    private LocalDateTime fIngOrigen;

    @Column(name="f_incidente", nullable = true)
    private LocalDateTime fIncidente;

    @Column(name="x_sumilla", nullable = true)
    private String xSumilla;

    @Column(name="f_denuncia", nullable = true)
    private LocalDateTime fDenuncia;

    @Column(name="n_denuncia", nullable = true)
    private String nDenuncia;

    @Column(name="n_atestado", nullable = true)
    private String nAtestado;

    @Column(name="f_anulado", nullable = true)
    private LocalDateTime fAnulado;

    @Column(name="x_anulado", nullable = true)
    private String xAnulado;

    @Column(name="l_parte_interpone", nullable = true)
    private String lParteInterpone;

    @Column(name="n_ventanilla", nullable = true)
    private Integer nVentanilla;

    @Column(name="n_sec_ingreso", nullable = true)
    private Integer nSecIngreso;

    @Column(name="n_ano_ingreso", nullable = true)
    private Integer nAnoIngreso;

    @Column(name="l_servidor", nullable = true)
    private String lServidor;

    @Column(name="l_exp_agrario", nullable = true)
    private String lExpAgricola;

    @Column(name="l_devolver_ejec", nullable = true)
    private String lDevolverEjec;

    @Column(name="c_instancia_ejec", nullable = true)
    private String cInstanciaEjec;

    @Column(name="f_devuelto_ejec", nullable = true)
    private LocalDateTime fDevueltoEjec;

    @Column(name="n_cedulas", nullable = true)
    private Integer nCedulas;

    @Column(name="x_tasa_judicial", nullable = true)
    private String xTasaJudicial;

    @Column(name="c_ind_modifica", nullable = true)
    private String cIndModifica;

    @Column(name="c_cod_archivo", nullable = true)
    private String cCodArchivo;

    @Column(name="c_cod_visualiza", nullable = true)
    private String cCodVisualiza;

    @Column(name="c_cod_medida_cautelar", nullable = true)
    private String cCodMedidaCautelar;

    @Column(name="l_archivo", nullable = true)
    private String lArchivo;

    @Column(name="x_observacion", nullable = true)
    private String xObservacion;

    @Column(name="x_nombre_fiscal", nullable = true)
    private String xNombreFiscal;

    @Column(name="x_fiscalia", nullable = true)
    private String xFiscalia;

    @Column(name="x_oficina_fiscal", nullable = true)
    private String xOficinaFiscal;

    @Column(name="f_hecho", nullable = true)
    private LocalDateTime fHecho;

    @Column(name="n_juz_exp_origen", nullable = true)
    private Integer nJuzExpOrigen;

    @Column(name="x_secretario", nullable = true)
    private String xSecretario;

    @Column(name="f_ult_modificacion", nullable = true)
    private LocalDateTime fUltModificacion;

    @Column(name="l_confrontado", nullable = true)
    private String lConfrontado;

    @Column(name="x_ape_secretario_antiguo", nullable = true)
    private String xApeSecretarioAntiguo;
    @Column(name="x_secretario_antiguo", nullable = true)
    private String xSecretarioAntiguo;

    @Column(name="l_cond", nullable = true)
    private String lCond;

    @Column(name="n_exp_sala", nullable = true)
    private Integer nExpSala;

    @Column(name="n_ano_sala", nullable = true)
    private String nAnoSala;

    @Column(name="c_c_codprovincia", nullable = true)
    private Integer cCCodProvincia;

    @Column(name="c_c_coddistrito", nullable = true)
    private Integer cCCodDistrito;

    @Column(name="c_etapa", nullable = true)
    private String cEtapa;

    @Column(name="c_estado", nullable = true)
    private String cEstado;

    @Column(name="c_materia", nullable = true)
    private String cMateria;

    @Column(name="c_ubicacion", nullable = true)
    private String cUbicacion;


    @Column(name="n_exp_sala_ant", nullable = true)
    private Integer nExpSalaAnt;

    @Column(name="n_ano_sala_ant", nullable = true)
    private String nAnoSalaAnt;

    @Column(name="c_secretario", nullable = true)
    private String cSecretario;

    @Column(name="n_unico_juz", nullable = true)
    private Integer nUnicoJuz;

    @Column(name="x_desc_cedula", nullable = true)
    private String xDescCedula;

    @Column(name="c_ubigeo_fiscalia", nullable = true)
    private String cUbigeoFiscalia;

    @Column(name="n_ano_exp_juz", nullable = true)
    private String nAnoExpJuz;

    @Column(name="n_procedencia_juz", nullable = true)
    private Integer nProcedenciaJuz;

    @Column(name="n_tip_procedencia_juz", nullable = true)
    private String nTipProcedenciaJuz;

    @Column(name="c_distrito_juz", nullable = true)
    private String cDistritoJuz;

    @Column(name="c_provincia_juz", nullable = true)
    private String cProvinciaJuz;

    @Column(name="n_cuantia", nullable = true)
    private BigDecimal nCuantia;

    @Column(name="moneda_cuantia", nullable = true)
    private String monedaCuantia;

    @Column(name="n_inc_exp_juz", nullable = true)
    private Integer nIncExpJuz;

    @Column(name="n_nro_exp_salas", nullable = true)
    private Integer nNroExpSalas;

    @Column(name="n_ano_exp_salas", nullable = true)
    private String nAnoExpSalas;

    @Column(name="x_juez", nullable = true)
    private String xJuez;

    @Column(name="n_nro_exp_juz", nullable = true)
    private Integer nNroExpJuz;

    @Column(name="n_nro_en_juzgado", nullable = true)
    private Integer nNroEnJuzgado;

    @Column(name="n_ano_en_juzgado", nullable = true)
    private Integer nAnoEnJuzgado;

    public ExpedienteFull() {
    }

    public ExpedienteFull(Long nUnico, Integer nIncidente, String cUsuario, LocalDateTime fInicio, LocalDateTime fTermino, String cDistrito, String cProvincia, String cInstancia, String cEspecialidad, String cIncidente, Long nUnicoRelacion, String lAnulado, String lAcumulado, Integer nNroExpOrigen, Integer nAnoExpOrigen, LocalDateTime fAutoApertura, LocalDateTime fIngOrigen, LocalDateTime fIncidente, String xSumilla, LocalDateTime fDenuncia, String nDenuncia, String nAtestado, LocalDateTime fAnulado, String xAnulado, String lParteInterpone, Integer nVentanilla, Integer nSecIngreso, Integer nAnoIngreso, String lServidor, String lExpAgricola, String lDevolverEjec, String cInstanciaEjec, LocalDateTime fDevueltoEjec, Integer nCedulas, String xTasaJudicial, String cIndModifica, String cCodArchivo, String cCodVisualiza, String cCodMedidaCautelar, String lArchivo, String xObservacion, String xNombreFiscal, String xFiscalia, String xOficinaFiscal, LocalDateTime fHecho, Integer nJuzExpOrigen, String xSecretario, LocalDateTime fUltModificacion, String lConfrontado, String xApeSecretarioAntiguo, String xSecretarioAntiguo, String lCond, Integer nExpSala, String nAnoSala, Integer cCCodProvincia, Integer cCCodDistrito, String cEtapa, String cEstado, String cMateria, String cUbicacion, Integer nExpSalaAnt, String nAnoSalaAnt, String cSecretario, Integer nUnicoJuz, String xDescCedula, String cUbigeoFiscalia, String nAnoExpJuz, Integer nProcedenciaJuz, String nTipProcedenciaJuz, String cDistritoJuz, String cProvinciaJuz, BigDecimal nCuantia, String monedaCuantia, Integer nIncExpJuz, Integer nNroExpSalas, String nAnoExpSalas, String xJuez, Integer nNroExpJuz, Integer nNroEnJuzgado, Integer nAnoEnJuzgado) {
        this.nUnico = nUnico;
        this.nIncidente = nIncidente;
        this.cUsuario = cUsuario;
        this.fInicio = fInicio;
        this.fTermino = fTermino;
        this.cDistrito = cDistrito;
        this.cProvincia = cProvincia;
        this.cInstancia = cInstancia;
        this.cEspecialidad = cEspecialidad;
        this.cIncidente = cIncidente;
        this.nUnicoRelacion = nUnicoRelacion;
        this.lAnulado = lAnulado;
        this.lAcumulado = lAcumulado;
        this.nNroExpOrigen = nNroExpOrigen;
        this.nAnoExpOrigen = nAnoExpOrigen;
        this.fAutoApertura = fAutoApertura;
        this.fIngOrigen = fIngOrigen;
        this.fIncidente = fIncidente;
        this.xSumilla = xSumilla;
        this.fDenuncia = fDenuncia;
        this.nDenuncia = nDenuncia;
        this.nAtestado = nAtestado;
        this.fAnulado = fAnulado;
        this.xAnulado = xAnulado;
        this.lParteInterpone = lParteInterpone;
        this.nVentanilla = nVentanilla;
        this.nSecIngreso = nSecIngreso;
        this.nAnoIngreso = nAnoIngreso;
        this.lServidor = lServidor;
        this.lExpAgricola = lExpAgricola;
        this.lDevolverEjec = lDevolverEjec;
        this.cInstanciaEjec = cInstanciaEjec;
        this.fDevueltoEjec = fDevueltoEjec;
        this.nCedulas = nCedulas;
        this.xTasaJudicial = xTasaJudicial;
        this.cIndModifica = cIndModifica;
        this.cCodArchivo = cCodArchivo;
        this.cCodVisualiza = cCodVisualiza;
        this.cCodMedidaCautelar = cCodMedidaCautelar;
        this.lArchivo = lArchivo;
        this.xObservacion = xObservacion;
        this.xNombreFiscal = xNombreFiscal;
        this.xFiscalia = xFiscalia;
        this.xOficinaFiscal = xOficinaFiscal;
        this.fHecho = fHecho;
        this.nJuzExpOrigen = nJuzExpOrigen;
        this.xSecretario = xSecretario;
        this.fUltModificacion = fUltModificacion;
        this.lConfrontado = lConfrontado;
        this.xApeSecretarioAntiguo = xApeSecretarioAntiguo;
        this.xSecretarioAntiguo = xSecretarioAntiguo;
        this.lCond = lCond;
        this.nExpSala = nExpSala;
        this.nAnoSala = nAnoSala;
        this.cCCodProvincia = cCCodProvincia;
        this.cCCodDistrito = cCCodDistrito;
        this.cEtapa = cEtapa;
        this.cEstado = cEstado;
        this.cMateria = cMateria;
        this.cUbicacion = cUbicacion;
        this.nExpSalaAnt = nExpSalaAnt;
        this.nAnoSalaAnt = nAnoSalaAnt;
        this.cSecretario = cSecretario;
        this.nUnicoJuz = nUnicoJuz;
        this.xDescCedula = xDescCedula;
        this.cUbigeoFiscalia = cUbigeoFiscalia;
        this.nAnoExpJuz = nAnoExpJuz;
        this.nProcedenciaJuz = nProcedenciaJuz;
        this.nTipProcedenciaJuz = nTipProcedenciaJuz;
        this.cDistritoJuz = cDistritoJuz;
        this.cProvinciaJuz = cProvinciaJuz;
        this.nCuantia = nCuantia;
        this.monedaCuantia = monedaCuantia;
        this.nIncExpJuz = nIncExpJuz;
        this.nNroExpSalas = nNroExpSalas;
        this.nAnoExpSalas = nAnoExpSalas;
        this.xJuez = xJuez;
        this.nNroExpJuz = nNroExpJuz;
        this.nNroEnJuzgado = nNroEnJuzgado;
        this.nAnoEnJuzgado = nAnoEnJuzgado;
    }

    public Long getnUnico() {
        return nUnico;
    }

    public void setnUnico(Long nUnico) {
        this.nUnico = nUnico;
    }

    public Integer getnIncidente() {
        return nIncidente;
    }

    public void setnIncidente(Integer nIncidente) {
        this.nIncidente = nIncidente;
    }

    public String getcUsuario() {
        return cUsuario;
    }

    public void setcUsuario(String cUsuario) {
        this.cUsuario = cUsuario;
    }

    public LocalDateTime getfInicio() {
        return fInicio;
    }

    public void setfInicio(LocalDateTime fInicio) {
        this.fInicio = fInicio;
    }

    public LocalDateTime getfTermino() {
        return fTermino;
    }

    public void setfTermino(LocalDateTime fTermino) {
        this.fTermino = fTermino;
    }

    public String getcDistrito() {
        return cDistrito;
    }

    public void setcDistrito(String cDistrito) {
        this.cDistrito = cDistrito;
    }

    public String getcProvincia() {
        return cProvincia;
    }

    public void setcProvincia(String cProvincia) {
        this.cProvincia = cProvincia;
    }

    public String getcInstancia() {
        return cInstancia;
    }

    public void setcInstancia(String cInstancia) {
        this.cInstancia = cInstancia;
    }

    public String getcEspecialidad() {
        return cEspecialidad;
    }

    public void setcEspecialidad(String cEspecialidad) {
        this.cEspecialidad = cEspecialidad;
    }

    public String getcIncidente() {
        return cIncidente;
    }

    public void setcIncidente(String cIncidente) {
        this.cIncidente = cIncidente;
    }

    public Long getnUnicoRelacion() {
        return nUnicoRelacion;
    }

    public void setnUnicoRelacion(Long nUnicoRelacion) {
        this.nUnicoRelacion = nUnicoRelacion;
    }

    public String getlAnulado() {
        return lAnulado;
    }

    public void setlAnulado(String lAnulado) {
        this.lAnulado = lAnulado;
    }

    public String getlAcumulado() {
        return lAcumulado;
    }

    public void setlAcumulado(String lAcumulado) {
        this.lAcumulado = lAcumulado;
    }

    public Integer getnNroExpOrigen() {
        return nNroExpOrigen;
    }

    public void setnNroExpOrigen(Integer nNroExpOrigen) {
        this.nNroExpOrigen = nNroExpOrigen;
    }

    public Integer getnAnoExpOrigen() {
        return nAnoExpOrigen;
    }

    public void setnAnoExpOrigen(Integer nAnoExpOrigen) {
        this.nAnoExpOrigen = nAnoExpOrigen;
    }

    public LocalDateTime getfAutoApertura() {
        return fAutoApertura;
    }

    public void setfAutoApertura(LocalDateTime fAutoApertura) {
        this.fAutoApertura = fAutoApertura;
    }

    public LocalDateTime getfIngOrigen() {
        return fIngOrigen;
    }

    public void setfIngOrigen(LocalDateTime fIngOrigen) {
        this.fIngOrigen = fIngOrigen;
    }

    public LocalDateTime getfIncidente() {
        return fIncidente;
    }

    public void setfIncidente(LocalDateTime fIncidente) {
        this.fIncidente = fIncidente;
    }

    public String getxSumilla() {
        return xSumilla;
    }

    public void setxSumilla(String xSumilla) {
        this.xSumilla = xSumilla;
    }

    public LocalDateTime getfDenuncia() {
        return fDenuncia;
    }

    public void setfDenuncia(LocalDateTime fDenuncia) {
        this.fDenuncia = fDenuncia;
    }

    public String getnDenuncia() {
        return nDenuncia;
    }

    public void setnDenuncia(String nDenuncia) {
        this.nDenuncia = nDenuncia;
    }

    public String getnAtestado() {
        return nAtestado;
    }

    public void setnAtestado(String nAtestado) {
        this.nAtestado = nAtestado;
    }

    public LocalDateTime getfAnulado() {
        return fAnulado;
    }

    public void setfAnulado(LocalDateTime fAnulado) {
        this.fAnulado = fAnulado;
    }

    public String getxAnulado() {
        return xAnulado;
    }

    public void setxAnulado(String xAnulado) {
        this.xAnulado = xAnulado;
    }

    public String getlParteInterpone() {
        return lParteInterpone;
    }

    public void setlParteInterpone(String lParteInterpone) {
        this.lParteInterpone = lParteInterpone;
    }

    public Integer getnVentanilla() {
        return nVentanilla;
    }

    public void setnVentanilla(Integer nVentanilla) {
        this.nVentanilla = nVentanilla;
    }

    public Integer getnSecIngreso() {
        return nSecIngreso;
    }

    public void setnSecIngreso(Integer nSecIngreso) {
        this.nSecIngreso = nSecIngreso;
    }

    public Integer getnAnoIngreso() {
        return nAnoIngreso;
    }

    public void setnAnoIngreso(Integer nAnoIngreso) {
        this.nAnoIngreso = nAnoIngreso;
    }

    public String getlServidor() {
        return lServidor;
    }

    public void setlServidor(String lServidor) {
        this.lServidor = lServidor;
    }

    public String getlExpAgricola() {
        return lExpAgricola;
    }

    public void setlExpAgricola(String lExpAgricola) {
        this.lExpAgricola = lExpAgricola;
    }

    public String getlDevolverEjec() {
        return lDevolverEjec;
    }

    public void setlDevolverEjec(String lDevolverEjec) {
        this.lDevolverEjec = lDevolverEjec;
    }

    public String getcInstanciaEjec() {
        return cInstanciaEjec;
    }

    public void setcInstanciaEjec(String cInstanciaEjec) {
        this.cInstanciaEjec = cInstanciaEjec;
    }

    public LocalDateTime getfDevueltoEjec() {
        return fDevueltoEjec;
    }

    public void setfDevueltoEjec(LocalDateTime fDevueltoEjec) {
        this.fDevueltoEjec = fDevueltoEjec;
    }

    public Integer getnCedulas() {
        return nCedulas;
    }

    public void setnCedulas(Integer nCedulas) {
        this.nCedulas = nCedulas;
    }

    public String getxTasaJudicial() {
        return xTasaJudicial;
    }

    public void setxTasaJudicial(String xTasaJudicial) {
        this.xTasaJudicial = xTasaJudicial;
    }

    public String getcIndModifica() {
        return cIndModifica;
    }

    public void setcIndModifica(String cIndModifica) {
        this.cIndModifica = cIndModifica;
    }

    public String getcCodArchivo() {
        return cCodArchivo;
    }

    public void setcCodArchivo(String cCodArchivo) {
        this.cCodArchivo = cCodArchivo;
    }

    public String getcCodVisualiza() {
        return cCodVisualiza;
    }

    public void setcCodVisualiza(String cCodVisualiza) {
        this.cCodVisualiza = cCodVisualiza;
    }

    public String getcCodMedidaCautelar() {
        return cCodMedidaCautelar;
    }

    public void setcCodMedidaCautelar(String cCodMedidaCautelar) {
        this.cCodMedidaCautelar = cCodMedidaCautelar;
    }

    public String getlArchivo() {
        return lArchivo;
    }

    public void setlArchivo(String lArchivo) {
        this.lArchivo = lArchivo;
    }

    public String getxObservacion() {
        return xObservacion;
    }

    public void setxObservacion(String xObservacion) {
        this.xObservacion = xObservacion;
    }

    public String getxNombreFiscal() {
        return xNombreFiscal;
    }

    public void setxNombreFiscal(String xNombreFiscal) {
        this.xNombreFiscal = xNombreFiscal;
    }

    public String getxFiscalia() {
        return xFiscalia;
    }

    public void setxFiscalia(String xFiscalia) {
        this.xFiscalia = xFiscalia;
    }

    public String getxOficinaFiscal() {
        return xOficinaFiscal;
    }

    public void setxOficinaFiscal(String xOficinaFiscal) {
        this.xOficinaFiscal = xOficinaFiscal;
    }

    public LocalDateTime getfHecho() {
        return fHecho;
    }

    public void setfHecho(LocalDateTime fHecho) {
        this.fHecho = fHecho;
    }

    public Integer getnJuzExpOrigen() {
        return nJuzExpOrigen;
    }

    public void setnJuzExpOrigen(Integer nJuzExpOrigen) {
        this.nJuzExpOrigen = nJuzExpOrigen;
    }

    public String getxSecretario() {
        return xSecretario;
    }

    public void setxSecretario(String xSecretario) {
        this.xSecretario = xSecretario;
    }

    public LocalDateTime getfUltModificacion() {
        return fUltModificacion;
    }

    public void setfUltModificacion(LocalDateTime fUltModificacion) {
        this.fUltModificacion = fUltModificacion;
    }

    public String getlConfrontado() {
        return lConfrontado;
    }

    public void setlConfrontado(String lConfrontado) {
        this.lConfrontado = lConfrontado;
    }

    public String getxApeSecretarioAntiguo() {
        return xApeSecretarioAntiguo;
    }

    public void setxApeSecretarioAntiguo(String xApeSecretarioAntiguo) {
        this.xApeSecretarioAntiguo = xApeSecretarioAntiguo;
    }

    public String getxSecretarioAntiguo() {
        return xSecretarioAntiguo;
    }

    public void setxSecretarioAntiguo(String xSecretarioAntiguo) {
        this.xSecretarioAntiguo = xSecretarioAntiguo;
    }

    public String getlCond() {
        return lCond;
    }

    public void setlCond(String lCond) {
        this.lCond = lCond;
    }

    public Integer getnExpSala() {
        return nExpSala;
    }

    public void setnExpSala(Integer nExpSala) {
        this.nExpSala = nExpSala;
    }

    public String getnAnoSala() {
        return nAnoSala;
    }

    public void setnAnoSala(String nAnoSala) {
        this.nAnoSala = nAnoSala;
    }

    public Integer getcCCodProvincia() {
        return cCCodProvincia;
    }

    public void setcCCodProvincia(Integer cCCodProvincia) {
        this.cCCodProvincia = cCCodProvincia;
    }

    public Integer getcCCodDistrito() {
        return cCCodDistrito;
    }

    public void setcCCodDistrito(Integer cCCodDistrito) {
        this.cCCodDistrito = cCCodDistrito;
    }

    public String getcEtapa() {
        return cEtapa;
    }

    public void setcEtapa(String cEtapa) {
        this.cEtapa = cEtapa;
    }

    public String getcEstado() {
        return cEstado;
    }

    public void setcEstado(String cEstado) {
        this.cEstado = cEstado;
    }

    public String getcMateria() {
        return cMateria;
    }

    public void setcMateria(String cMateria) {
        this.cMateria = cMateria;
    }

    public String getcUbicacion() {
        return cUbicacion;
    }

    public void setcUbicacion(String cUbicacion) {
        this.cUbicacion = cUbicacion;
    }

    public Integer getnExpSalaAnt() {
        return nExpSalaAnt;
    }

    public void setnExpSalaAnt(Integer nExpSalaAnt) {
        this.nExpSalaAnt = nExpSalaAnt;
    }

    public String getnAnoSalaAnt() {
        return nAnoSalaAnt;
    }

    public void setnAnoSalaAnt(String nAnoSalaAnt) {
        this.nAnoSalaAnt = nAnoSalaAnt;
    }

    public String getcSecretario() {
        return cSecretario;
    }

    public void setcSecretario(String cSecretario) {
        this.cSecretario = cSecretario;
    }

    public Integer getnUnicoJuz() {
        return nUnicoJuz;
    }

    public void setnUnicoJuz(Integer nUnicoJuz) {
        this.nUnicoJuz = nUnicoJuz;
    }

    public String getxDescCedula() {
        return xDescCedula;
    }

    public void setxDescCedula(String xDescCedula) {
        this.xDescCedula = xDescCedula;
    }

    public String getcUbigeoFiscalia() {
        return cUbigeoFiscalia;
    }

    public void setcUbigeoFiscalia(String cUbigeoFiscalia) {
        this.cUbigeoFiscalia = cUbigeoFiscalia;
    }

    public String getnAnoExpJuz() {
        return nAnoExpJuz;
    }

    public void setnAnoExpJuz(String nAnoExpJuz) {
        this.nAnoExpJuz = nAnoExpJuz;
    }

    public Integer getnProcedenciaJuz() {
        return nProcedenciaJuz;
    }

    public void setnProcedenciaJuz(Integer nProcedenciaJuz) {
        this.nProcedenciaJuz = nProcedenciaJuz;
    }

    public String getnTipProcedenciaJuz() {
        return nTipProcedenciaJuz;
    }

    public void setnTipProcedenciaJuz(String nTipProcedenciaJuz) {
        this.nTipProcedenciaJuz = nTipProcedenciaJuz;
    }

    public String getcDistritoJuz() {
        return cDistritoJuz;
    }

    public void setcDistritoJuz(String cDistritoJuz) {
        this.cDistritoJuz = cDistritoJuz;
    }

    public String getcProvinciaJuz() {
        return cProvinciaJuz;
    }

    public void setcProvinciaJuz(String cProvinciaJuz) {
        this.cProvinciaJuz = cProvinciaJuz;
    }

    public BigDecimal getnCuantia() {
        return nCuantia;
    }

    public void setnCuantia(BigDecimal nCuantia) {
        this.nCuantia = nCuantia;
    }

    public String getMonedaCuantia() {
        return monedaCuantia;
    }

    public void setMonedaCuantia(String monedaCuantia) {
        this.monedaCuantia = monedaCuantia;
    }

    public Integer getnIncExpJuz() {
        return nIncExpJuz;
    }

    public void setnIncExpJuz(Integer nIncExpJuz) {
        this.nIncExpJuz = nIncExpJuz;
    }

    public Integer getnNroExpSalas() {
        return nNroExpSalas;
    }

    public void setnNroExpSalas(Integer nNroExpSalas) {
        this.nNroExpSalas = nNroExpSalas;
    }

    public String getnAnoExpSalas() {
        return nAnoExpSalas;
    }

    public void setnAnoExpSalas(String nAnoExpSalas) {
        this.nAnoExpSalas = nAnoExpSalas;
    }

    public String getxJuez() {
        return xJuez;
    }

    public void setxJuez(String xJuez) {
        this.xJuez = xJuez;
    }

    public Integer getnNroExpJuz() {
        return nNroExpJuz;
    }

    public void setnNroExpJuz(Integer nNroExpJuz) {
        this.nNroExpJuz = nNroExpJuz;
    }

    public Integer getnNroEnJuzgado() {
        return nNroEnJuzgado;
    }

    public void setnNroEnJuzgado(Integer nNroEnJuzgado) {
        this.nNroEnJuzgado = nNroEnJuzgado;
    }

    public Integer getnAnoEnJuzgado() {
        return nAnoEnJuzgado;
    }

    public void setnAnoEnJuzgado(Integer nAnoEnJuzgado) {
        this.nAnoEnJuzgado = nAnoEnJuzgado;
    }
}
