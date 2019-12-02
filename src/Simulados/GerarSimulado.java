/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simulados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Questao;

/**
 *
 * @author pedro
 */
public class GerarSimulado {
    
    public static void GerarSimulado(String nomeArquivo, List<Questao> questoes){
        File escrever = new File(".");
        File arquivo;
        try {
            arquivo = new File(escrever.getCanonicalPath()+"/src/Simulados/"+nomeArquivo+".txt");
            FileWriter Escrever = new FileWriter(arquivo, true);
            BufferedWriter BffEscreve = new BufferedWriter(Escrever);
            for (int i = 0; i < questoes.size(); i++) {
                BffEscreve.write((i+1)+". "+questoes.get(i).getTexto());
                BffEscreve.newLine();
                BffEscreve.newLine();
            }
            BffEscreve.close();
            Escrever.close();
        } catch (IOException ex) {
            Logger.getLogger(GerarSimulado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
