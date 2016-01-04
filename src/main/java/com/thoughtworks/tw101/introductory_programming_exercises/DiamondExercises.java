package com.thoughtworks.tw101.introductory_programming_exercises;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {

        drawTriangleWithoutLastLine(n);
        drawLastLine(n);

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawUpsideDownTriangle(n);
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        drawTriangleWithoutLastLine(n);
        System.out.println("Tania");
        drawUpsideDownTriangle(n);
    }

    private static void triangleHelper(int n, int initialStarCount, int initialSpaceCount, int starCountIncrementor, int spaceCountIncrementor){
        int starCount = initialStarCount;
        int spaceCount = initialSpaceCount;
        for (int i = 0; i < n-1; i++) {

            System.out.print(new String(new char[spaceCount]).replace("\0", " "));
            System.out.print(new String(new char[starCount]).replace("\0", "*"));
            System.out.println();

            starCount += starCountIncrementor;
            spaceCount += spaceCountIncrementor;
        }
    }

    private static void drawTriangleWithoutLastLine(int n){
        triangleHelper(n, 1, n-1, 2, -1);
    }


    private static void drawUpsideDownTriangle(int n){
        triangleHelper(n, 2*n-3, 1, -2, 1);
    }

    private static void drawLastLine(int n){
        int starCount = 2*n-1;
        System.out.print(new String(new char[starCount]).replace("\0", "*"));
        System.out.println();
    }
}
