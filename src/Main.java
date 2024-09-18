public class Main
{
    public static void main(String[] args)
    {
        int summerHMC = 20;
        int autumnHMC = 20;
        int winterHMC = 20;
        int springHMC = 20;
        int yearlyCost = 80;

        System.out.println("Enter your Home Maintenance Cost for Summer: ");
        System.out.println("You said your Summer Home Maintience Cost was: " + summerHMC);
        System.out.println("Enter your Home Maintenance Cost for Autumn: ");
        System.out.println("You said your Autumn Home Maintience Cost was: " + autumnHMC);
        System.out.println("Enter your Home Maintenance Cost for Winter: ");
        System.out.println("You said your Winter Home Maintience Cost was: " + winterHMC);
        System.out.println("Enter your Home Maintenance Cost for Spring: ");
        System.out.println("You said your Spring Home Maintience Cost was: " + springHMC);

        yearlyCost = summerHMC + autumnHMC + winterHMC + springHMC;
        System.out.println("Your Yearly Home Maintience Cost is: " + yearlyCost);
    }
}