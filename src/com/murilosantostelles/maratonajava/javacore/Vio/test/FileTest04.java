package com.murilosantostelles.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest04 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta2"); // diretotorio criado
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada: "+isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio , "arquivo.txt"); // file criada dentro do diretorio
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("arquivo.txt criado: "+isFileCreated);

        File fileRenamed = new File(fileDiretorio , "arquivo_renomeado.txt"); // file renomeada
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomeado: "+isRenamed);

        File diretorioRenamed = new File("pasta");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("diretorio renomeado: "+isDiretorioRenamed);

    }
}
