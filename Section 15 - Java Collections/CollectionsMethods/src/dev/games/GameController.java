package dev.games;

import dev.games.poker.PokerGame;

import java.util.Stack;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardDraw = new PokerGame(4, 5);
        fiveCardDraw.startPlay();

    }

    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        int unb = stack.size() / 2;
        return (unb + 1) / 2;
    }

    public int compress(char[] chars) {
        int ans = 0;
        for (int i = 0; i < chars.length;) {
            final char letter = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == letter) {
                ++count;
                ++i;
            }
            chars[ans++] = letter;
            if (count > 1) {
                for (final char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }















}
