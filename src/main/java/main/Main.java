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

// TODO: 08.05.16 dodac potegowanie
// TODO: 08.05.16 dodac inkrementacje i dekrementacje
// TODO: 08.05.16 przeniesc variable i variableTest do statements i zatwierdzic zmiany dla fabryk arithmetic i statements
// TODO: 08.05.16 if then czy jeszcze if then else, czy if jest lewo czy prawostronny
// TODO: 08.05.16 czy dodawac instrukcje SKIP
// TODO: 08.05.16 czy double + int powinno sie interpretowac ? czyli czy rzutownie ma byc jawne (funkcje konwertujace dla uzytkownika) czy niejawne
// TODO: 08.05.16 typy a la curry i ten drugi, roznice, ktory wybrac
// TODO: 08.05.16 operatory o ustalonych typach argumentow, czyli kazde wyrazenie trzyma swoj typ
// TODO: 08.05.16 polimorfizm (czyli np + ma liste typow, a nie jeden typ) np. + dziala dla INT, DOUBLE, STRING
// TODO: 08.05.16 lewostronne i prawostronne operatory
// TODO: 08.05.16 wyrazenia wieloargumentowe np. 1+2+3+4
// TODO: 08.05.16 typy: string, int, double, bool
// TODO: 08.05.16 funkcje, stos funkcji
// TODO: 08.05.16 rekursja, stos funkcji
// TODO: 08.05.16 wejscie / wyjscie
// TODO: 08.05.16 pamietac o spacjach w parserze aby nie wyszlo cos takiego: INTzmienna = 12;
// TODO: 08.05.16 parser jako wyrazenie parametryzowany typami, co z roznymi liczbami argumentow ? uogolniacz ?
// TODO: 08.05.16 zasiegi zmiennych, lokalne, globalne, stos zmiennych, przypomniec sobie te chyba 4 rodzaje implementacji
// TODO: 08.05.16 rzucanie wyjatkow (throw)
// TODO: 08.05.16 lapanie wyjatkow
// TODO: 08.05.16 stale CONST (trzeba od razy przypisac)
// TODO: 08.05.16 try catch finally
// TODO: 08.05.16 while do, do while, repeat until, fori
// TODO: 08.05.16 for to do i ?: jako cukier
// TODO: 08.05.16 obowiazkowa deklaracja zmiennych przed uzyciem
// TODO: 08.05.16 argumenty funkcji przekazywane przez wartosc czy przez referencje ?
// TODO: 08.05.16 jaka jest struktura programu
// TODO: 08.05.16 czy read ma zwracac string i konwertujemy na np. INT (automatycznie?)
// TODO czy piszemy niepolimorficzne funkcje READINT, READSTRING  ? co gdy nie przypisujemy do wartosci (w sensie jaki wtedy ma typ)
// TODO: 08.05.16 wbudowane wyjatki np. DivBy0, NotParse
// TODO: 08.05.16 lapanie poszczegolnych wyjatkow osobno czyli osobny catch dla DivBy0 i osobny dla NotParse
// TODO: 08.05.16 refaktoryzacja
// TODO: 08.05.16 testowanie
// TODO: 08.05.16 dokumentacja
// TODO: 08.05.16 integracja z shellem czyli programy z konsoli
// TODO: 08.05.16 czy da sie zaimplementowac rekursje ogonowa ? trzeba jakos zmieniac stos funkcji w czasie wykonania
// TODO: 08.05.16 tablice i cukier []
// TODO: 08.05.16 zakaz uzywania nie zadeklarowanych tablic
// TODO: 08.05.16 wartosci domyslne dla typow
// TODO: 08.05.16 wyjatek IndexBoundException
// TODO: 08.05.16 foreach po tablicach
// TODO: 08.05.16 maksymalne rozmiary double, int, array


