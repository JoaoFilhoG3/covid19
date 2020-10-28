package com.mycompany.covid19csv;

import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Atendimento> lAtendimentos = new ArrayList<Atendimento>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("/home/joaof/NetBeansProjects/Covid19CSV/src/main/java/com/mycompany/covid19csv/tabuleiro-do-norte.csv")));
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            String[] dadosUsuario = linha.split(";");

            Atendimento at = new Atendimento();
            at.id = dadosUsuario[0];
            at.dataNotificacao = dadosUsuario[1];
            at.dataInicioSintomas = dadosUsuario[2];
            at.dataNascimento = dadosUsuario[3];

            //Preenchendo os sintomas
            at.sintomas = dadosUsuario[4];
            preencherSintomas(at, dadosUsuario[4]);

            at.profissionalSaude = dadosUsuario[5];
            at.cbo = dadosUsuario[6];

            //Preenchendo as condições
            at.condicoes = dadosUsuario[7];
            preencherCondicoes(at, dadosUsuario[7]);

            at.estadoTeste = dadosUsuario[8];
            at.dataTeste = dadosUsuario[9];
            at.tipoTeste = dadosUsuario[10];
            at.resultadoTeste = dadosUsuario[11];
            at.paisOrigem = dadosUsuario[12];
            at.sexo = dadosUsuario[13];
            at.estado = dadosUsuario[14];
            at.estadoIBGE = dadosUsuario[15];
            at.municipio = dadosUsuario[16];
            at.municipioIBGE = dadosUsuario[17];
            at.origem = dadosUsuario[18];
            at.cnes = dadosUsuario[19];
            at.estadoNotificacao = dadosUsuario[20];
            at.estadoNotificacaoIBGE = dadosUsuario[21];
            at.municipioNotificacao = dadosUsuario[22];
            at.municipioNotificacaoIBGE = dadosUsuario[23];
            at.excluido = dadosUsuario[24];
            at.validado = dadosUsuario[25];
            at.idade = dadosUsuario[26];
            at.dataEncerramento = dadosUsuario[27];
            at.evolucaoCaso = dadosUsuario[28];
            at.classificacaoFinal = dadosUsuario[29];
            lAtendimentos.add(at);
        }
        reader.close();

        criarCSV(lAtendimentos);

    }

    /**
     * * Método responsável por, de acordo com o campo sintomas, preencher os
     * campos específicos de cada sintoma separadamente **
     *
     * @param at - Objeto no qual os valores serão atualizados
     * @param sintomas - Campo contendo todos os sintomas
     */
    public static void preencherSintomas(Atendimento at, String sintomas) {
        String upperSintomas = sintomas.toUpperCase();

        at.sintDispneia = upperSintomas.contains("DISPNEIA") ? "1" : "0";
        at.sintFebre = upperSintomas.contains("FEBRE") ? "1" : "0";
        at.sintTosse = upperSintomas.contains("TOSSE") ? "1" : "0";
        at.sintDorDeGarganta = upperSintomas.contains("DOR DE GARGANTA") ? "1" : "0";
        at.sintCoriza = upperSintomas.contains("CORIZA") ? "1" : "0";
        at.sintDorDeCabeca = upperSintomas.contains("DOR DE CABECA") ? "1" : "0";
        at.sintDisturbiosOlfativos = upperSintomas.contains("DISTÚRBIOS OLFATIVOS") ? "1" : "0";
        at.sintDisturbiosGustativos = upperSintomas.contains("DISTÚRBIOS GUSTATIVOS") ? "1" : "0";
        at.sintOutros = upperSintomas.contains("OUTROS") ? "1" : "0";
    }

    /**
     * * Método responsável por, de acordo com o campo condições, preencher os
     * campos específicos de cada condição separadamente **
     *
     * @param at - Objeto no qual os valores serão atualizados
     * @param condicoes - Campo contendo todas as condições
     */
    public static void preencherCondicoes(Atendimento at, String condicoes) {
        String upperCondicoes = condicoes.toUpperCase();

        at.condDoencasCardiacasCronicas = upperCondicoes.contains("DOENÇAS CARDÍACAS CRÔNICAS") ? "1" : "0";
        at.condDiabetes = upperCondicoes.contains("DIABETES") ? "1" : "0";
        at.condDoencasRespiratoriasCronicasDescompensadas = upperCondicoes.contains("DOENÇAS RESPIRATÓRIAS CRÔNICAS DESCOMPENSADAS") ? "1" : "0";
        at.condImunossupressao = upperCondicoes.contains("IMUNOSSUPRESSÃO") ? "1" : "0";
        at.condDoencasCromossomicasFragilidadeImunologica = upperCondicoes.contains("PORTADOR DE DOENÇAS CROMOSSÔMICAS OU ESTADO DE FRAGILIDADE") ? "1" : "0";
        at.condGestante = upperCondicoes.contains("GESTANTE") ? "1" : "0";
        at.condGestanteAltoRisco = upperCondicoes.contains("GESTANTE DE ALTO RISCO") ? "1" : "0";
        at.condDoencasRenaisCronicasEstagioAvancado = upperCondicoes.contains("DOENÇAS RENAIS CRÔNICAS EM ESTÁGIO AVANÇADO (GRAUS 3, 4 OU 5)") ? "1" : "0";
    }

    /**
     * * Método responsável por criar um CSV a partir de uma lista de
     * atendimentos
     *
     * @param lAtendimentos - Lista de atendimentos que irão compor o CSV
     */
    public static void criarCSV(List<Atendimento> lAtendimentos) throws IOException {
        String[] cabecalho = {
            "id",
            "dataNotificacao",
            "dataInicioSintomas",
            "dataNascimento",
            "sintomas",
            "sintDispneia",
            "sintFebre",
            "sintTosse",
            "sintDorDeGarganta",
            "sintCoriza",
            "sintDorDeCabeca",
            "sintDisturbiosOlfativos",
            "sintDisturbiosGustativos",
            "sintOutros",
            "profissionalSaude",
            "cbo",
            "condicoes",
            "condDoencasCardiacasCronicas",
            "condDiabetes",
            "condDoencasRespiratoriasCronicasDescompensadas",
            "condImunossupressao",
            "condDoencasCromossomicasFragilidadeImunologica",
            "condGestante",
            "condGestanteAltoRisco",
            "condDoencasRenaisCronicasEstagioAvancado",
            "estadoTeste",
            "dataTeste",
            "tipoTeste",
            "resultadoTeste",
            "paisOrigem",
            "sexo",
            "estado",
            "estadoIBGE",
            "municipio",
            "municipioIBGE",
            "origem",
            "cnes",
            "estadoNotificacao",
            "estadoNotificacaoIBGE",
            "municipioNotificacao",
            "municipioNotificacaoIBGE",
            "excluido",
            "validado",
            "idade",
            "dataEncerramento",
            "evolucaoCaso",
            "classificacaoFinal"
        };

        List<String[]> linhas = new ArrayList<>();

        /**
         * * Começa do índice 1 para não pegar o cabeçalho que está no índice 0
         * **
         */
        for (int i = 1; i < lAtendimentos.size(); i++) {
            Atendimento a = lAtendimentos.get(i);

            linhas.add(new String[]{
                a.id,
                a.dataNotificacao,
                a.dataInicioSintomas,
                a.dataNascimento,
                a.sintomas,
                a.sintDispneia,
                a.sintFebre,
                a.sintTosse,
                a.sintDorDeGarganta,
                a.sintCoriza,
                a.sintDorDeCabeca,
                a.sintDisturbiosOlfativos,
                a.sintDisturbiosGustativos,
                a.sintOutros,
                a.profissionalSaude,
                a.cbo,
                a.condicoes,
                a.condDoencasCardiacasCronicas,
                a.condDiabetes,
                a.condDoencasRespiratoriasCronicasDescompensadas,
                a.condImunossupressao,
                a.condDoencasCromossomicasFragilidadeImunologica,
                a.condGestante,
                a.condGestanteAltoRisco,
                a.condDoencasRenaisCronicasEstagioAvancado,
                a.estadoTeste,
                a.dataTeste,
                a.tipoTeste,
                a.resultadoTeste,
                a.paisOrigem,
                a.sexo,
                a.estado,
                a.estadoIBGE,
                a.municipio,
                a.municipioIBGE,
                a.origem,
                a.cnes,
                a.estadoNotificacao,
                a.estadoNotificacaoIBGE,
                a.municipioNotificacao,
                a.municipioNotificacaoIBGE,
                a.excluido,
                a.validado,
                a.idade,
                a.dataEncerramento,
                a.evolucaoCaso,
                a.classificacaoFinal
            });
        }

        Writer writer = Files.newBufferedWriter(Paths.get("/home/joaof/NetBeansProjects/Covid19CSV/src/main/java/com/mycompany/covid19csv/saida.csv"));
        CSVWriter csvWriter = new CSVWriter(writer);

        csvWriter.writeNext(cabecalho);
        csvWriter.writeAll(linhas);

        csvWriter.flush();
        writer.close();
    }
}
