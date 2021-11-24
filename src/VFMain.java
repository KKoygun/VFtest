public class VFMain {

    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }

    static void faktoriyel(int faktor){
    for(int i = 1; i<= 5; i++){
        faktor = faktor * i;
    }
    System.out.println(System.lineSeparator()+"5'in Faktöriyeli : "+faktor);

    }

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        int count=10;
        int faktor=1;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
        faktoriyel(faktor);
        String str = "Koray";
        if (isPalindrome(str))
            System.out.print(str+" Polindromdur");
        else
            System.out.print(str+" Polindrom değildir");


        }
}
