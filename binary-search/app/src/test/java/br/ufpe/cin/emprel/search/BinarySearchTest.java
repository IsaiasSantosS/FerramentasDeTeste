/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.ufpe.cin.emprel.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    SearchAlgorithm searchAlgorithm;
    int[] inputArray;
    int TAMANHO_ARRAY = 100;

    @BeforeEach
    void setup() {
        //preparando array de elementos aleatórios (pode usar nos testes se desejar)
        Random r = new Random(7513876);
        inputArray = new int[TAMANHO_ARRAY];
        for (int i=0; i<TAMANHO_ARRAY; i++) {
            inputArray[i] = r.nextInt();
        }
        Arrays.sort(inputArray);

        //Aqui vamos inicializar o algoritmo de busca.
        // Se quiser testar com algo rodando, pode implementar a busca linear (que não precisa do array ordenado)
        //searchAlgorithm = new BinarySearch();
    }

    @Test
    void findElement() {
        int element = 12;
        int position = searchAlgorithm.search(inputArray, element);
        int expected = 4;
        assertEquals(expected, position);
    }

    @Test
    void notFoundElement() {
        int element = 12;
        int position = searchAlgorithm.search(inputArray, element);
        int expected = -1;
        assertEquals(expected, position);
    }

    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void orderArray() {
        for (int i = 0; i < TAMANHO_ARRAY-1; i++) {
            assertTrue(inputArray[i] <= inputArray[i+1], "Elemento deveria ser menor que o próximo");
        }
    }

    @Test
    void ArrayNotNull(){
        assertNotNull(inputArray);
    }





}
