package main;

import essentials.Pair;
import lexer.Lexer;
import lexer.essentials.ILexer;
import parser.essentials.IToken;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String TEXT = "12+ 22a7 (     ";

    public static void main(String[] args) {
        ILexer lexer = new Lexer();

        List<Character> chars = new ArrayList<>();
        for (char ch : TEXT.toCharArray())
            chars.add(ch);

        Pair<List<IToken>, List<Character>> tokens = lexer.eval(chars);

        List<Character> rest = tokens.y;
        if (! rest.isEmpty())
            System.out.println("REST: " + rest
                    .stream()
                    .map(String::valueOf)
                    .reduce(String::concat));

        System.out.println("TOKENS:");
        tokens.x.stream().forEach(System.out::println);
    }
}


// NOT READY:
//main.java.lexer.arithmetic.Arithmetic

//main.java.lexer.essentials
//and
//decorator
//decoratorMerged
//essential
//or
//single
//while


//main.java.lexer.factory.arithmetic
//main.java.lexer.factory.essential
//main.java.lexer.factory.Ifactory

//main.java.lexer.lexer
//main.java.lexer.simplelexer






