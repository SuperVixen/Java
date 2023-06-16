public class Task1 {
    public static void execute() 
    {
        int N = 15;
        char c1 = '-';
        char c2 = '=';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N / 2; i++) {
            result.append(c1);
            result.append(c2);
            // i++;
        }    
        if (N % 2 == 1)
        result.append(c1);
        System.out.println(result.toString());
        // return result.toString();
    }    
}
