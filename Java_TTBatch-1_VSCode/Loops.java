class Loops {
    public static void main(String[] args) {
        int sum = 0;

        //traditional loop
        // for(int i = 0; i < args.length; i++)
        // {
        //     sum += Integer.parseInt(args[i]); // sum = sum + Integer.parseInt(args[i]);
        // }

        //Enhanced for Loop or foreach loop
        for(String i : args)
        {
            sum += Integer.parseInt(i);
        }

        System.out.println("Sum is: "+sum);
    }    
}
