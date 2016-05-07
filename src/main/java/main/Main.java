package main;

import javafx.util.Pair;
import lexer.Lexer;
import lexer.arithmetic.IntegerLexer;
import lexer.essentials.ILexer;
import parser.arithmetic.AddToken;
import parser.essentials.IToken;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static final String INCORRECT_NUMBER_OF_ARGUMENTS_MESSAGE = "Incorrect number of arguments";
    private static final String FILE_DO_NOT_EXISTS_MESSAGE = "File don't exists";

    public static void main(String[] args) {
        String text = "12+ 22a7 (     ";
        ILexer lexer = new Lexer();

        List<Character> chars = new ArrayList<>();
        for (char ch : text.toCharArray())
            chars.add(ch);

        essentials.Pair<List<IToken>, List<Character>> tokens = lexer.eval(chars);

        List<Character> rest = tokens.y;
        if (! rest.isEmpty())
            System.out.println("REST: " + rest
                    .stream()
                    .map(String::valueOf)
                    .reduce(String::concat));

        System.out.println("TOKENS:");
        tokens.x.stream().forEach(System.out::println);
    }

    private static void garbage() {
        //        if (args.length != 1)
//            exit(INCORRECT_NUMBER_OF_ARGUMENTS_MESSAGE);

//        String path = args[0];
//        StringBuilder programText = new StringBuilder();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = reader.readLine()) != null)
//                programText.append(line).append("\n");
//        } catch (FileNotFoundException e) {
//            exit(FILE_DO_NOT_EXISTS_MESSAGE);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(programText);

//        ILexer[] lexers_1_9 = new ILexer[9];
//        for (int i = 1; i <= lexers_1_9.length; i++)
//            lexers_1_9[i - 1] = new DecoratedLexer(new IntegerToken(i), String.valueOf(i));
//
//        ILexer lexer_0 = new DecoratedLexer(new IntegerToken(0), "0");
//        ILexer lexer_1_9 = new OrLexer(lexers_1_9);
//        ILexer lexer_0_9 = new OrLexer(lexer_0, lexer_1_9);
//        ILexer lexer_sequence_0_9 = new WhileLexer(lexer_0_9);
//        ILexer lexer_int = new OrLexer(lexer_0, new AndLexer(lexer_1_9, lexer_sequence_0_9));

//        ILexer lexer = lexer_int;

//        String text = "10";
//        ILexer lexer = new IntegerLexer();
//
//        Pair<List<IToken>, String> result = lexer.eval(text);
//
//        for (IToken token : result.getKey()) {
//            System.out.println("Token: " + token.getClass());
//            System.out.println("Value: " + token.getValue());
//        }
//        System.out.println("Rest of text: " + result.getValue());
//
//        Predicate<String> pred = (c) -> true;
//        F f = new F(pred);


//        List<Integer> list1 = new ArrayList<>();
//        list1.add(0);
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//
//        List<Integer> list2 = list1.subList(1, list1.size());
//
//        list1.remove(2);
//
//        list2.forEach(System.out::println);
    }

    private static void exit(String message) {
        System.err.println(message);
        System.exit(0);
    }
}

//class F {
//    public F(Predicate<Character> predicate) {
//        System.out.printl
//    }
//}





// zmniejszyc dlugosc intow
// div by 0
