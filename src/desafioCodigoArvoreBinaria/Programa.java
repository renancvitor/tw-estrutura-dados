package desafioCodigoArvoreBinaria;

import estruturaDadosArvoreBinaria.Arvore;
import estruturaDadosArvoreBinaria.NoArvore;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

public class Programa {

    public static void main(String args[]) {

        if(Arvore.class.getSuperclass() != null && !Arvore.class.getSuperclass().getName().contains("java.lang.Object"))
            System.out.println("A classe Arvore não pode implementar nenhuma superclasse");

        Field[] allFields = Arvore.class.getDeclaredFields();

        for (Field field : allFields) {
            if (!field.getType().getName().contains("NoArvore")) {
                System.out.println("A classe deve definir uma propriedade do tipo NoArvore");
            }
        }

        allFields = NoArvore.class.getDeclaredFields();

        for (Field field : allFields) {
            if (field.getType().getName().contains("java.util"))
                System.out.println("A classe NoArvore não pode utilizar nenhum objeto do pacote java.util.*");
        }

        Arvore arvore = processaArvore();

        arvore.emOrdem();
    }

    //Complete o código teste método
    public static Arvore processaArvore()
    {
        Arvore arvore = new Arvore();

        Scanner in = new Scanner(System.in);

        while(in.hasNext())
        {
            int valor = in.nextInt();
            //....
        }

        return arvore;
    }
}

//Defina as suas classes neste ponto

