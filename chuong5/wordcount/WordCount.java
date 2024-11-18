package wordcount;

import java.util.HashMap; 
/*
 * HashMap<type1,type2>
 * type1 : la key
 * type2 : la value dc noi cung voi key
 * them phan tu vao map : [MapName].put(type1Value, type2Value);
 * for (type1 [Type1Name] : HashMapName.keySet()) : duyet cac phan tu theo key
 * for (type2 [Type2Name] : HashMapName.valueSet()) : duyet cac phan tu theo value
 */
public class WordCount {

	public static void main(String[] args) {
        // Mảng chuỗi đầu vào
        String[] sentences = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // Tạo một HashMap để lưu số lần xuất hiện của từ
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Duyệt qua từng câu trong mảng String
        for (String s : sentences) {
            // Tách câu thành các từ
            String[] words = s.split("\\s+");

            // Đếm số lần xuất hiện của từng từ
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                /*
                 * getOrDefault(word, 0) : tra ve value cua key "word" neu khong co word trong map thi tra ve
                 *  defaultValue = 0
                 */
            }
        }

        // In kết quả
        int totalWords = 0;
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            // .get(key) ==> tra ve value ma key noi cung no 
            System.out.println(word + " : " + count);
            totalWords += count;
        }
        System.out.println("Total words: " + totalWords);
    }
}
