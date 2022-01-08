class CommandLineInput {

    public static void main(String[] args) {
        //dynamic way of initialization(Command Line Input)    

        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            int result;

            // String firstNumber = args[0];
            // String secondNumber = args[1];
            // String result;

            result = firstNumber + secondNumber;

            System.out.println("Sum is: "+result);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
