package com.example.assignment9;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try {
            WordProcessor wordProcessor1 = new WordProcessor();
            wordProcessor1.readFile("C:\\Users\\Зарина\\My works\\homeworks\\OOP\\Assignment-9\\src\\main\\java\\com\\example\\assignment9\\file1.txt");
            Set<String> set1 = wordProcessor1.getDistinctWords();

            WordProcessor wordProcessor2 = new WordProcessor();
            wordProcessor2.readFile("C:\\Users\\Зарина\\My works\\homeworks\\OOP\\Assignment-9\\src\\main\\java\\com\\example\\assignment9\\file2.txt");
            Set<String> set2 = wordProcessor2.getDistinctWords();

            SimilarityCalculator similarityCalculator = new SimilarityCalculator();
            double similarity = similarityCalculator.calculateSimilarity(set1, set2);

            System.out.println("Коэффициент Жаккара: " + similarity);

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}