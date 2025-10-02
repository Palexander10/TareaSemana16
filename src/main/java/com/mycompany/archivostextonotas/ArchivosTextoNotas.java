/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.archivostextonotas;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Pablo Alexander
 */
public class ArchivosTextoNotas {

    public static void main(String[] args) {
        
        // Realizamos la Escritura en el archivo
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            // Usamos las clases FileWriter y PrintWriter para  el archivo mis_notas.txt
            fileWriter = new FileWriter("mis_notas.txt");
            printWriter = new PrintWriter(fileWriter);

            // Escribimos tres notas
            printWriter.println("Esta seman aprendi acerca de Seguridad Informatica.");
            printWriter.println("El sol brilla para todos.");
            printWriter.println("La perseverenacia es la clave del exito.");

            System.out.println("Se ha escrito correctamente en mis_notas.txt");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir el archivo: " + e.getMessage());
        } finally {
            // Cerramos los archivos utilizando el método .close().
            if (printWriter != null) {
                printWriter.close();
            }
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el FileWriter: " + e.getMessage());
            }
        }

      // Se realiza la lectura del archivo
 
        BufferedReader bufferedReader = null;

        try {
            // Se Abre el archivo para lectura
            bufferedReader = new BufferedReader(new FileReader("mis_notas.txt"));

            String linea;
            // Se lee línea por línea usando readLine()
            while ((linea = bufferedReader.readLine()) != null) {
                // Mostrar en consola precedido de la palabra "Nota:"
                System.out.println("Nota: " + linea);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        } finally {
            // Cerramos el archivo
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el BufferedReader: " + e.getMessage());
            }
        }
    }
}
        