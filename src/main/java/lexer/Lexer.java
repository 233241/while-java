package lexer;

import essentials.Functions;
import essentials.Pair;
import lexer.essentials.*;
import main.TokenType;
import parser.essentials.IToken;

import java.util.List;

/**
 * Created on 01.05.16.
 *
 * @author m
 */
public class Lexer {
    private ILexer lexer;
    private String[] texts = {"IF", "THEN", "ELSE", "WHILE", "DO", "{", "}", ";", "SKIP", "INT", "BOOL", "=", "INT",
            "BOOL", "(", ")", "<=", "<", ">=", ">", "==", "!", "!=", "=", "-", "+", "*", "/", "%", "^", "||", "&&"};
    private TokenType[] tokenTypes = {TokenType.IF, TokenType.THEN, TokenType.ELSE, TokenType.WHILE, TokenType.DO,
            TokenType.LEFT_BRACE, TokenType.RIGHT_BRACE, TokenType.SEMICOLON, TokenType.SKIP, TokenType.INT,
            TokenType.BOOL, TokenType.ASSIGN, TokenType.INT_TYPE, TokenType.BOOL_TYPE, TokenType.LEFT_PARENTHESIS,
            TokenType.RIGHT_PARENTHESIS, TokenType.LESS_EQUAL, TokenType.LESS, TokenType.GREATER_EQUAL,
            TokenType.GREATER, TokenType.EQUAL, TokenType.NOT, TokenType.NOT_EQUAL, TokenType.ASSIGN,
            TokenType.SUB, TokenType.ADD, TokenType.MUL, TokenType.DIV, TokenType.MOD, TokenType.POW, TokenType.OR,
            TokenType.AND};

    public Lexer() {
        ILexer[] lexers = getLexers();
        initLexer(lexers);

    }

    private ILexer[] getLexers() {
        int N = texts.length;
        ILexer[] lexers = new ILexer[N];

        for (int i = 0; i < N; i++)
            lexers[i] = new CharsSequenceLexer(texts[i], tokenTypes[i]);

        return lexers;
    }

    private void initLexer(ILexer[] lexers) {
        lexer = new WhileLexer(
                new OrLexer(
                        new OrLexer(lexers),
                        new WhiteSpacesLexer(),
                        new IntegerLexer(),
                        new BoolLexer(),
                        new VariableLexer()));
    }

    public List<IToken> eval(String text) {
        Pair<List<IToken>, List<Character>> value = lexer.eval(Functions.convert(text));

        if (value == null || !value.y.isEmpty())
            return null;

        return value.x;

    }
}
