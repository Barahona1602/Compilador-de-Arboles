/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author pbara
 */
public class AFD {
        private arbol expresiones;
        private int num=1;
        private static int contadorGlobal = 0;

        public AFD(arbol expresiones) {
        arbol raiz = new arbol (".");
        arbol aceptacion = new arbol ("\"#\"");
        aceptacion.setHoja(true);
        aceptacion.setAnulable(false);
        raiz.setHijoD(aceptacion);
        raiz.setHijoI(expresiones);
        this.expresiones = raiz;
        asignar(this.expresiones);
        num=0;
        metodo(this.expresiones);
        crear(this.expresiones, num);
        
    }
        public void asignar(arbol actual){
            if(actual==null){
                return;
            }
            if (actual.isHoja()){
                actual.setId(num);
                num++;
                return;
            }
            asignar(actual.getHijoI());
            asignar(actual.getHijoD());
    }
        public void metodo(arbol actual){
            if(actual==null){
                return;
            }
            
            
            if (actual.isHoja()){
                actual.getPrimeros().add(actual.getId());
                actual.getUltimos().add(actual.getId());
                return;
            }
            
            metodo(actual.getHijoI());
            metodo(actual.getHijoD());
            
            String datoActual = actual.getDato();
            switch (datoActual) {
                case "*" -> {
                    actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                    actual.getUltimos().addAll(actual.getHijoI().getUltimos());
                    actual.setAnulable(true);
                }
                case "+" -> {
                    actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                    actual.getUltimos().addAll(actual.getHijoI().getUltimos());
                    actual.setAnulable(actual.getHijoI().isAnulable());
                }
                case "?" -> {
                    actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                    actual.getUltimos().addAll(actual.getHijoI().getUltimos());
                    actual.setAnulable(true);
                }
                case "|" -> {
                    actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                    actual.getPrimeros().addAll(actual.getHijoD().getPrimeros());
                    actual.getUltimos().addAll(actual.getHijoI().getUltimos());
                    actual.getUltimos().addAll(actual.getHijoD().getUltimos());
                    actual.setAnulable(actual.getHijoI().isAnulable() || actual.getHijoD().isAnulable());
                }
                case "." -> {
                    actual.setAnulable(actual.getHijoI().isAnulable() && actual.getHijoD().isAnulable());
                    if (actual.getHijoI().isAnulable()){
                        actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                        actual.getPrimeros().addAll(actual.getHijoD().getPrimeros());
                    } else{
                        actual.getPrimeros().addAll(actual.getHijoI().getPrimeros());
                    }   if (actual.getHijoD().isAnulable()){
                        actual.getUltimos().addAll(actual.getHijoI().getUltimos());
                        actual.getUltimos().addAll(actual.getHijoD().getUltimos()); 
                    } else{
                        actual.getUltimos().addAll(actual.getHijoD().getUltimos());
                    }
                }
                default -> {
                }
            }
        }
    public String crear(arbol nodo, int padre) {
        String g = "";
        num += 1;
        int actual = num;
        if (nodo == null) {
            num -= 1;
            return g;
        }

        boolean esPrimeraLlamada = (num == 1);
        if (esPrimeraLlamada) {
            g += "digraph arbol {";
        }

        if (nodo.isHoja()) {
            String anulable = "Anulable";
            if (!nodo.isAnulable()) {
                anulable = "No Anulable";
            }

            g += "N_" + actual + "[shape = circle, label=<"
                + "<FONT POINT-SIZE=\"10\">"
                + "<I>" + anulable + "</I>"
                + "<BR/>"
                + "<B>" 
                + "<FONT POINT-SIZE=\"16\">" + nodo.getDato() + "</FONT>"
                + "</B><BR/>"
                + "<FONT COLOR=\"green\"><B>" + nodo.getPrimeros() + "</B></FONT>"
                + "    "
                + "<FONT COLOR=\"red\"><B>" + nodo.getUltimos() + "</B></FONT>"
                + "<BR/>"
                + nodo.getId()
                + "</FONT>"
                + ">]";
        } else {
            String anulable = "Anulable";
            if (!nodo.isAnulable()) {
                anulable = "No Anulable";
            }

            g += "N_" + actual + "[shape = circle, label=<"
                + "<FONT POINT-SIZE=\"12\">"
                + "<I>" + anulable + "</I>"
                + "<BR/>"
                + "<FONT POINT-SIZE=\"16\">" + nodo.getDato() + "</FONT>"
                + "<BR/>"
                + "<FONT COLOR=\"green\"><B>" + nodo.getPrimeros() + "</B></FONT>"
                + "    "
                + "<FONT COLOR=\"red\"><B>" + nodo.getUltimos() + "</B></FONT>"
                + "</FONT>"
                + ">]";
        }

        if (padre != 0) {
            g += "N_" + padre + " -> N_" + actual + ";\n";
        }

        g += crear(nodo.getHijoI(), actual);
        g += crear(nodo.getHijoD(), actual);

        if (esPrimeraLlamada) {
            contadorGlobal++;
            g += "}\n";
            
             try {
                System.out.println("Archivo generado");
                FileWriter writer = new FileWriter("src/ARBOLES_202109715/"+"arbol"+contadorGlobal+".dot");
                writer.write(g);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                }
            // Generar imagen PNG
            try {
                String[] cmd = {"dot", "-Tpng", "src/ARBOLES_202109715/"+"arbol"+contadorGlobal+".dot", "-o", "src/ARBOLES_202109715/"+"arbol"+contadorGlobal+".jpg"};
                Process p = Runtime.getRuntime().exec(cmd);
                p.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
                }
        
        }
        
        return g;
        
    }
}
