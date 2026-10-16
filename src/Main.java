import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);

//    Задание 1
//
//    int i = 1;
//    while (i <= 1000) {
//        System.out.println(i+ " - до операции цикла. ");
//        i *= 10;
//        System.out.println(i+ " - после операции цикла. ");
//
//    }
//
//    Задание 2
//
//    for (int i = 1; i <= 1000; i *= 10) {
//        System.out.println(i + " - до операции цикла; " + (i*=10) + " - после операции цикла");
//    }
//
//    Задание 3
//
//    int i = input.nextInt();
//    for (int j = 1; j <= i; j++) {
//        System.out.println(j);
//    }
//
//    int i = input.nextInt(), j = 0;
//    while (j < i) {
//        j++;
//        System.out.println(j);
//    }
//
//    int i = input.nextInt(), j = 0;
//    do {
//        j++;
//        System.out.println(j);
//    } while (j < i);
//
//
//    Задание 4
//
//    int j = 11;
//    while (j >= 10) {
//        j++;
//        System.out.println(j);
//    }
//
//    Задание 5
//
//    int i = input.nextInt();
//    for (int j = 1; j <= i; j++) {
//        if (j % 2 == 0) {
//            System.out.println(j);
//        }
//    }
//
//    int i = input.nextInt();
//    int j = 0;
//    while (j < i) {
//        j++;
//        if (j % 2 == 0) {
//            System.out.println(j);
//        }
//    }
//
//    int i = input.nextInt();
//    int j = 1;
//    do{
//        j++;
//        if(j % 2 ==0){
//            System.out.println(j);
//        }
//
//    }while(j < i);
//
//    Задание 6
//
//        int i = input.nextInt();
//    for(int j = 1; j <= i; j++) {
//        if (j % 2 != 0) {
//            System.out.println(j);
//        }
//    }
//
//    int i = input.nextInt();
//    int j = 0;
//    while (j < i) {
//        j++;
//        if (j % 2 != 0) {
//            System.out.println(j);
//        }
//    }
//
//    int i = input.nextInt();
//    int j = 0;
//    do {
//        j++;
//        if (j % 2 != 0) {
//            System.out.println(j);
//        }
//    } while (j < i);
//
//     Задание 7
//
//    int i = 1;
//    while (i <= 20) {
//        if (i % 3 == 0 && i % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (i % 5 == 0) {
//            System.out.println("Buzz");
//        } else if (i % 3 == 0) {
//            System.out.println("Fizz");
//        } else {
//            System.out.println(i);
//        }
//        i++;
//    }




    // ЗАДАЧА 1

//    int CORRECT = 1234;
//    for (int attempts = 3; attempts > 0; attempts--) {
//        System.out.print("Enter a pin: ");
//        int pin = input.nextInt();
//        if (pin == CORRECT) {
//            System.out.println("Access granted!");
//            break;
//        } else if (pin != CORRECT) {
//            System.out.println("Incorrect PIN");
//            System.out.println("Attempts left: " + (attempts - 1));
//            System.out.println("\n");
//            if (attempts >= 0 && attempts <= 1) {
//                System.out.println("Card blocked");
//            }
//        }
//    }

    // ЗАДАЧА 2


//    for (int attempts = 0; attempts < 5; attempts++){
//        System.out.print("Enter your guess: ");
//        int secret = 67;
//        int guess = input.nextInt();
//        if (guess == secret){
//            System.out.println("Congratulations! You guessed it!");
//            System.out.println("You needed " + (attempts + 1)+ " attempts.");
//            break;
//        } else if (guess < secret){
//            System.out.println("You too low!\n");
//        } else if (guess > secret){
//            System.out.println("You too high!\n");
//        }
//        if (attempts == 4) {
//                System.out.println("Game over!");
//            }
//    }

    // ЗАДАЧА 3

//    int Positive = 0, Negative = 0, Zero = 0, Even = 0, Odd = 0;
//    for (int numbers = 1; numbers <= 10; numbers++) {
//        System.out.print("Enter number " + numbers + ": ");
//        int number = input.nextInt();
//        if (number > 0) {
//            Positive++;
//        } else if (number < 0) {
//            Negative++;
//        }
//        if (number == 0) {
//            Zero++;
//        }
//        if (number % 2 == 0) {
//            Even++;
//        } else {
//            Odd++;
//        }
//    }
//    System.out.println("\n");
//    System.out.println("===== STATISTICS =====");
//    System.out.println("Positive Numbers: "+ Positive);
//    System.out.println("Negative Numbers: "+ Negative);
//    System.out.println("Zero Numbers: "+ Zero);
//    System.out.println("Even Numbers: "+ Even);
//    System.out.println("Odd Numbers: "+ Odd);


    // ITM

//    System.out.println("===== SIMPLE ATM =====");
//    int CORRECT = 1234;
//    for (int attempts = 3; attempts > 0; attempts--) {
//        System.out.print("Enter a pin: ");
//        int pin = input.nextInt();
//        if (pin == CORRECT) {
//            System.out.println("Login Successful!");
//            System.out.println("");
//            break;
//        } else if (pin != CORRECT) {
//            System.out.println("Incorrect PIN");
//            System.out.println("Attempts left: " + (attempts - 1));
//            System.out.println("");
//            if (attempts >= 0 && attempts <= 1) {
//                System.out.println("Your account has been blocked!");
//                return;
//            }
//        }
//    }
//    int balance = 1000;
//    int nextaction = 0;
//    while (nextaction != 4) {
//        System.out.println("===== ATM MENU =====");
//        System.out.println("1.Check balance");
//        System.out.println("2.Deposit money");
//        System.out.println("3.Withdraw money");
//        System.out.println("4.Exit");
//        System.out.println("");
//
//        System.out.print("Choose an option: ");
//        nextaction = input.nextInt();
//        if (nextaction == 1) {
//            System.out.println("Your current balance: " + balance);
//            System.out.println("");
//        } else if (nextaction == 2) {
//            System.out.print("Please enter the amount you want to deposit (the amount must be greater than zero): ");
//            int deposit = input.nextInt();
//            balance = balance + deposit;
//            if (deposit > 0 && deposit < balance) {
//                System.out.println("Deposit successful!");
//                System.out.println("Your current balance: " + (balance));
//                System.out.println("");
//            } else {
//                System.out.println("Incorrect amount");
//                System.out.println("");
//            }
//        }
//        if (nextaction == 3) {
//            System.out.print("Please enter the amount you want to withdraw (the amount must be greater than zero): ");
//            int withdraw = input.nextInt();
//            if (withdraw > 0 && withdraw < balance) {
//                balance = balance - withdraw;
//                System.out.println("Your current balance: " + (balance));
//                System.out.println("");
//            } else {
//                System.out.println("Incorrect amount");
//                System.out.println("");
//            }
//        }
//        if (nextaction == 4) {
//            System.out.println("Thank you for using Simple ATM!");
//        }
//    }

}


