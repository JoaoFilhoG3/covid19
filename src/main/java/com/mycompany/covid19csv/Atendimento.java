package com.mycompany.covid19csv;

public class Atendimento {

    public String id;
    public String dataNotificacao;
    public String dataInicioSintomas;
    public String dataNascimento;
    public String sintomas;

    /**
     * * SINTOMAS **
     */
    public String sintDispneia;
    public String sintFebre;
    public String sintTosse;
    public String sintDorDeGarganta;
    public String sintCoriza;
    public String sintDorDeCabeca;
    public String sintDisturbiosOlfativos;
    public String sintDisturbiosGustativos;
    public String sintOutros;
    /**
     * * SINTOMAS **
     */

    public String profissionalSaude;
    public String cbo;
    public String condicoes;

    /**
     * * CONDIÇÕES **
     */
    public String condDoencasCardiacasCronicas;
    public String condDiabetes;
    public String condDoencasRespiratoriasCronicasDescompensadas;
    public String condImunossupressao;
    public String condDoencasCromossomicasFragilidadeImunologica;
    public String condGestante;
    public String condGestanteAltoRisco;
    public String condDoencasRenaisCronicasEstagioAvancado;
    /**
     * * CONDIÇÕES **
     */

    public String estadoTeste;
    public String dataTeste;
    public String tipoTeste;
    public String resultadoTeste;
    public String paisOrigem;
    public String sexo;
    public String estado;
    public String estadoIBGE;
    public String municipio;
    public String municipioIBGE;
    public String origem;
    public String cnes;
    public String estadoNotificacao;
    public String estadoNotificacaoIBGE;
    public String municipioNotificacao;
    public String municipioNotificacaoIBGE;
    public String excluido;
    public String validado;
    public String idade;
    public String dataEncerramento;
    public String evolucaoCaso;
    public String classificacaoFinal;

    @Override
    public String toString() {
        return "Atendimento{" + "id=" + id + ", dataNotificacao=" + dataNotificacao + ", dataInicioSintomas=" + dataInicioSintomas + ", dataNascimento=" + dataNascimento + ", sintomas=" + sintomas + ", sintDispneia=" + sintDispneia + ", sintFebre=" + sintFebre + ", sintTosse=" + sintTosse + ", sintDorDeGarganta=" + sintDorDeGarganta + ", sintCoriza=" + sintCoriza + ", sintDorDeCabeca=" + sintDorDeCabeca + ", sintDisturbiosOlfativos=" + sintDisturbiosOlfativos + ", sintDisturbiosGustativos=" + sintDisturbiosGustativos + ", sintOutros=" + sintOutros + ", profissionalSaude=" + profissionalSaude + ", cbo=" + cbo + ", condicoes=" + condicoes + ", condDoencasCardiacasCronicas=" + condDoencasCardiacasCronicas + ", condDiabetes=" + condDiabetes + ", condDoencasRespiratoriasCronicasDescompensadas=" + condDoencasRespiratoriasCronicasDescompensadas + ", condImunossupressao=" + condImunossupressao + ", condDoencasCromossomicasFragilidadeImunologica=" + condDoencasCromossomicasFragilidadeImunologica + ", condGestante=" + condGestante + ", condGestanteAltoRisco=" + condGestanteAltoRisco + ", condDoencasRenaisCronicasEstagioAvancado=" + condDoencasRenaisCronicasEstagioAvancado + ", estadoTeste=" + estadoTeste + ", dataTeste=" + dataTeste + ", tipoTeste=" + tipoTeste + ", resultadoTeste=" + resultadoTeste + ", paisOrigem=" + paisOrigem + ", sexo=" + sexo + ", estado=" + estado + ", estadoIBGE=" + estadoIBGE + ", municipio=" + municipio + ", municipioIBGE=" + municipioIBGE + ", origem=" + origem + ", cnes=" + cnes + ", estadoNotificacao=" + estadoNotificacao + ", estadoNotificacaoIBGE=" + estadoNotificacaoIBGE + ", municipioNotificacao=" + municipioNotificacao + ", municipioNotificacaoIBGE=" + municipioNotificacaoIBGE + ", excluido=" + excluido + ", validado=" + validado + ", idade=" + idade + ", dataEncerramento=" + dataEncerramento + ", evolucaoCaso=" + evolucaoCaso + ", classificacaoFinal=" + classificacaoFinal + '}';
    }

    public String showSintomasECondicoes() {
        return "Sintomas = " + sintomas + "\n"
                + "    sintDispneia = " + sintDispneia + "\n"
                + "    sintFebre = " + sintFebre + "\n"
                + "    sintTosse = " + sintTosse + "\n"
                + "    sintDorDeGarganta = " + sintDorDeGarganta + "\n"
                + "    sintCoriza = " + sintCoriza + "\n"
                + "    sintDorDeCabeca = " + sintDorDeCabeca + "\n"
                + "    sintDisturbiosOlfativos = " + sintDisturbiosOlfativos + "\n"
                + "    sintDisturbiosGustativos = " + sintDisturbiosGustativos + "\n"
                + "    sintOutros = " + sintOutros + "\n"
                + "Condições = " + condicoes + "\n"
                + "    condDoencasCardiacasCronicas = " + condDoencasCardiacasCronicas + "\n"
                + "    condDiabetes = " + condDiabetes + "\n"
                + "    condDoencasRespiratoriasCronicasDescompensadas = " + condDoencasRespiratoriasCronicasDescompensadas + "\n"
                + "    condImunossupressao = " + condImunossupressao + "\n"
                + "    condDoencasCromossomicasFragilidadeImunologica = " + condDoencasCromossomicasFragilidadeImunologica + "\n"
                + "    condGestante = " + condGestante + "\n"
                + "    condGestanteAltoRisco = " + condGestanteAltoRisco + "\n"
                + "    condDoencasRenaisCronicasEstagioAvancado = " + condDoencasRenaisCronicasEstagioAvancado;
    }

}
