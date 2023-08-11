package arrays.easy;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        pattern22(n);
    }

    private static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        /*
        [space,star,space]
        4   1   4
        3   3   3
        2   5   2
        1   7   1
        0   9   0

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern8(int n) {
        /*
        [space,star,space]
        0   9   0
        1   7   1
        2   5   2
        3   3   3
        4   1   4

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern9(int n) {
        // first half
         /*
        [space,star,space]
        4   1   4
        3   3   3
        2   5   2
        1   7   1
        0   9   0

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Second half
        /*
        [space,star,space]
        0   9   0
        1   7   1
        2   5   2
        3   3   3
        4   1   4

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < 2 * n - 2 * i - 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern9variation(int n) {
        // first half
         /*
        [space,star,space]
        2   1   2
        1   2   1
        0   3   0


        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Second half
        /*
        [space,star,space]
        0   3   0
        1   2   1
        2   1   2

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        /*
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < n-1; i++){
            for (int j = 0; j < n - i -1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // another way
        // Outer loop for number of rows
        for (int i = 1; i <= 2 * n - 1; i++) {

            // stars would be the equal to the row number, until first half
            int stars = i;

            // for the second half of the rotated triangle
            if (i > n) {
                stars = 2 * n - i;
            }

            // for printing the start in each row
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            //line break
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    private static void pattern12(int n) {
        /*
        [digit,space,digit]
         1  6   1
         2  4   2
         3  2   3
         4  0   4
        */
        for (int i = 0; i < n; i++) {
            // digit
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            // space
            for (int j = 0; j < 2 * (n - 1) - 2 * i; j++) {
                System.out.print(" ");
            }

            // digit
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

        // other way

        /*int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // digit
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            // space
            for (int j = 1;j <= space; j++) {
                System.out.print(" ");
            }

            // digit
            for (int j = i; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
            space -= 2;
        }*/
    }

    private static void pattern13(int n) {
        int stars = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(stars + " ");
                stars++;
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 'A'; j <= 'A' + i; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }

    private static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }

    private static void pattern16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i));
            }
            System.out.println();
        }
    }

    private static void pattern17(int n) {
        /*
        [space,char,space]
        3   1   3
        2   3   2
        1   5   1
        0   7   0

        */
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            // space
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 'E'; j <= 'E' + i; j++) {
                System.out.print((char) (j - i) + " ");
            }
            System.out.println();
        }
    }

    private static void pattern18Variation(int n) {
        char ch = (char) (65 + n - 1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ch - j) + " ");
            }
            System.out.println();
        }
    }

    private static void pattern19(int n) {
        // first half
        /*
            [star,space,star]
             5  0   5
             4  2   4
             3  4   3
             2  6   2
             1  8   1
        */
        for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second half
        /*
            [star,space,star]
            1  8   1
            2  6   2
            3  4   3
            4  2   4
            5  0   5




        */
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space -= 2;
        }
    }

    private static void pattern20(int n) {
        // second half
        /*
            [star,space,star]
            1  8   1
            2  6   2
            3  4   3
            4  2   4
            5  0   5
        */
        int space = 2 * n - 2;
        //Outer loop 2N-1
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;

            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) space -= 2;
            else space += 2;
        }

        // first half
        /*
            [star,space,star]
             5  0   5
             4  2   4
             3  4   3
             2  6   2
             1  8   1
        */
        /*for (int i = 0; i < n; i++) {
            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
    }

    private static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void pattern22(int n) {
        /*
        4444444
        4333334
        4322234
        4321234
        4322234
        4333334
        4444444
        */
        for (int i = 0; i < 2*n - 1; i++) {
            for (int j = 0; j < 2*n - 1; j++) {
               int top = i;
               int left = j;
               int right = (2*n - 2) - j;
               int down = (2*n - 2) - i;
               int result = (n - Math.min(Math.min(left,right), Math.min(top, down)));
                System.out.print(result);
            }
            System.out.println();
        }
    }
}
