class LoopsCommandLine {
    public static void main(String[] args) {
        
        int sum = 0;

        //Traditional for Loop
        // for(int i = 0; i < args.length; i++)
        // {
        //     sum += Integer.parseInt(args[i]); // sum = sum + Integer.parseInt(args[i]);
        // }

        // Enhanced For Loop
            for(String i : args)
            {
                sum += Integer.parseInt(i);
            }

        System.out.println("sum is: "+sum);
    }    
}
