import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       ifElseStatement();
       nestedIfStatement();
       switchCase();
       forLoops();
       whileLoops();
       doWhileLoops();
       tryCatchBlock();
       menu();

    }
    public static void menu(){
        while (true){

            System.out.println("\n");
            System.out.println("========================================================");
            //define menu in programs
            System.out.println("Input your choices:");
            System.out.println("1. If Else Statement");
            System.out.println("2. Nested If Statement");
            System.out.println("3. Switch Case");
            System.out.println("4. For Loops");
            System.out.println("5. While Loops");
            System.out.println("6. Do While Loops");
            System.out.println("7. Try Catch Block");

            //get user input choices
            System.out.println("Press Enter and input your choice");
            Scanner scanner = new Scanner(System.in);
            int menuOptions = scanner.nextInt();

            System.out.println(menuOptions);

            switch(menuOptions){
                case 1:
                    ifElseStatement();
                    break;
                case 2:
                    nestedIfStatement();
                    break;
                case 3:
                    switchCase();
                    break;
                case 4:
                    forLoops();
                    break;
                case 5:
                    whileLoops();
                    break;
                case 6:
                    doWhileLoops();
                    break;
                case 7:
                    tryCatchBlock();
                    break;
                default:
                    System.out.println("out of order");
            }
        }


    }
    public static void ifElseStatement(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("Welcome to the program which define even and odd number ");
        System.out.println("input any positive number:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if(inputNumber % 2 == 0){
            System.out.println("Your Number " + inputNumber + " is Even Number");
        }else{
            System.out.println("Result : Your number  "+ inputNumber+ " is Odd Number");
        }

    }

    public static void nestedIfStatement(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("Nested if statement");
        System.out.println("Define sneakers price based on Brands and Size");
        System.out.println("Choose your Brands :");
        System.out.println("1. Adidas Yeezy 350 V2 Beluga");
        System.out.println("2. Nike Air Jordan 1 Retro High OG SKYLINE");

        //using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //user input is stored to brandChoices variable (integer)
        Integer brandChoices = scanner.nextInt();

        System.out.println("Choose Available Size (EUR)");
        System.out.println("EUR 42");
        System.out.println("EUR 43");
        System.out.println("EUR 44");
        //using scanner to get user input
        Scanner inputSize = new Scanner(System.in);
        //user input is stored to sizeChoices variable (integer)
        Integer sizeChoices = inputSize.nextInt();

        //define condition that user brand is Adidas Yeeezy 350 V2 Beluga
        if(brandChoices == 1){
            //define condition that user size is 44
            if(sizeChoices == 44){
                //print sneaker brand, size and price
                System.out.println(" Brand : Adidas Yeezy 350 V2 Beluga" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.500.000" );
            //define condition that user size is 43
            } else if (sizeChoices == 43) {
                //print sneakers brand, size and price
                System.out.println(" Brand : Adidas Yeezy 350 V2 Beluga" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.300.000" );

            }else if(sizeChoices == 42){
                //print sneaker brand, size and price
                System.out.println(" Brand : Adidas Yeezy 350 V2 Beluga" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.600.000" );
            }else{
                //print message that user size is not on the list
                System.out.println("Product Sold Out");
            }
        //define condition that user brand is Nike Air Jordan 1 Retro High OG SKYLINE
        } else if (brandChoices == 2) {
            //define condition that user size is 44
            if(sizeChoices == 44){
                //print message that user size is not on the list
                System.out.println(" Brand : Nike Air Jordan 1 Retro High OG SKYLINE" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.500.000" );
            //define condition that user size is 43
            } else if (sizeChoices == 43) {
                //print message that user size is not on the list
                System.out.println(" Brand : Nike Air Jordan 1 Retro High OG SKYLINE" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.300.000" );
            //define condition that user size is 44
            }else if(sizeChoices == 42){
                //print message that user size is not on the list
                System.out.println(" Brand : Nike Air Jordan 1 Retro High OG SKYLINE" +"\n "+ "Size :" + sizeChoices + " " + "\n"+ "Price :Rp 7.600.000" );
            }else{
                //print message that user size is not on the list
                System.out.println("Product Sold Out");
            }
        }else{
            //print message that user brand is not on the list
            System.out.println("Product not Found");
        }


    }

    public static void switchCase(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("Switch Case");
        System.out.println("Define Discount price based on Promo Codes");
        System.out.println("Input your promo codes (1-5)");
        //using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //user input is stored to code variable (integer)
        Integer code = scanner.nextInt();

        //switch promotion code based on user input
        switch (code){
            //user input is 1
            case 1:
                //print the discount for user
                System.out.println("You Got 80% off");
                break;
            //user input is 2
            case 2:
                //print the discount for user
                System.out.println("You Got 65 % off");
                break;
            //user input is 3
            case 3:
                //print the discount for user
                System.out.println("You Got 50% off");
                break;
            //user input is 4
            case 4:
                //print the discount for user
                System.out.println("You Got 35% off");
                break;
            //user input is 5
            case 5:
                //print the discount for user
                System.out.println("You Got 25% off");
                break;
            default:
                //print default message if promotion code is not found on the list
                System.out.println("Promotion Code Expired");
        }
    }

    public static void forLoops(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("while Loops");
        System.out.println("input number 1 - 100");
        //using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //user input is stored to numberOfLoops variable
        Integer numberOfLoops = scanner.nextInt();
        //define iterator as i ;
        //define the maximum iterations i < numberOfLoops or equals numberOfLoops;
        //iteration will not stop until the maximum condition is reacehd
        for(int i = 0; i <= numberOfLoops; i++){
            //print the number of iterations
            System.out.println("Number" + i);
        }
    }

    public static void whileLoops(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("do while Loops");
        System.out.println("input number 1 - 100");
        //using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //user input is stored to numberOfLoops variable
        Integer numberOfLoops = scanner.nextInt();
        //define iterator as i
        int i = 0;
        //define maximum iteration condition
        //while condition is fulfilled then the iteration will stops
        while (i < numberOfLoops){
            //print the number of iterations
            System.out.println("Count" + i);
            //iterator value is gained
            i++;
        }

    }

    public static void doWhileLoops(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("For Loops");
        System.out.println("input number 1 - 100");

        //using scanner to get user input
        Scanner scanner = new Scanner(System.in);
        //user input is stored to numberOfLoops variable
        Integer numberOfLoops = scanner.nextInt();

        //declare iterator as i
        int i = 0;
        //do the iterations
        do{
            //print the number of iteration
            System.out.println("Count "+ i);
            //iterator is gained until the condition is fulfilled
            i++;
        //terminate iterator after max iteration condition is fulfilled
        }while (i < numberOfLoops);

    }
    public static void tryCatchBlock(){
        System.out.println("\n");
        System.out.println("========================================================");

        System.out.println("Count final price based on discount request");
        System.out.println("Try Catch block to validate that user input is integer");
        System.out.println("Input your discount 1 - 100 %");
        //define scannner to get user input
        Scanner scanner = new Scanner(System.in);
        //declare discount variable
        int discount;
        try {
            //validate user input is integer
            discount = scanner.nextInt();
        } catch (InputMismatchException e) {
            //catch error while user input is not integer
            System.out.println("Invalid input, please input number only");
            return;
        }
        //decalre price before discount
        int basePrice = 1000000;
        //count price after discount
        int finalPrice = basePrice - (basePrice * discount / 100);
        //print price after dicount
        System.out.println("Your final price: Rp " + finalPrice);


    }



}
