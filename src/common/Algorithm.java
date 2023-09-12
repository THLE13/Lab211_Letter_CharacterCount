
package common;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author CongThanh
 */
public class Algorithm {

    private Map<Character, Integer> charCounter
            = new HashMap<Character, Integer>(); // Sử dụng Map để đếm số lần xuất hiện của mỗi ký tự.

    private Map<String, Integer> wordCounter
            = new HashMap<String, Integer>(); // Sử dụng Map để đếm số lần xuất hiện của mỗi từ.

    public void displayLetter() {
        System.out.println("\nNumber of occurrences of each word:" + wordCounter); // In ra số lần xuất hiện của từng từ.
    }

    public void displayChar() {
        System.out.println("\nNumber of occurrences of each character:" + charCounter); // In ra số lần xuất hiện của từng ký tự.
    }

    public void analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) {
                continue; // Bỏ qua khoảng trắng.
            }
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1); // Nếu ký tự chưa được đếm trước đó, thêm vào Map với giá trị ban đầu là 1.
            } else {
                charCounter.put(ch, charCounter.get(ch) + 1); // Nếu ký tự đã được đếm trước đó, tăng giá trị hiện tại lên 1.
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1); // Tương tự cho việc đếm từ.
            } else {
                wordCounter.put(token, wordCounter.get(token) + 1);
            }
        }
    }
}
