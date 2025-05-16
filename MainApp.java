import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Member Code: ");
        int memberCode = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Member Name: ");
        String memberName = scanner.nextLine();

        Member member = new Member(memberCode, memberName);

      
        System.out.print("Enter Quantity (litres): ");
        double quantity = scanner.nextDouble();
        System.out.print("Enter FAT %: ");
        double fat = scanner.nextDouble();
        System.out.print("Enter SNF %: ");
        double snf = scanner.nextDouble();

        MilkEntry entry = new MilkEntry( quantity,fat, snf);
        entry.getQuantity();
        entry.getFat();
        System.out.println("Rate:");
        double rate = scanner.nextDouble();
        double total = BillingCalculator.calculateTotal(quantity,rate);
        

        System.out.println("\n---Tamil Nadu MILK BILL RECEIPT ---");
        System.out.println(new java.text.SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new java.util.Date()));
        System.out.println();
        System.out.println("Name : "+ member.getName() + " (Code: " + member.getMemberCode() + ")");
        System.out.printf("QTY   : %.2f L\n", quantity);
        System.out.printf("FAT   : %.2f \n", fat);
        System.out.printf("SNF   : %.2f \n",snf);
        System.out.printf("Rate  : %.2f \n", rate);
        System.out.printf("TOTAL : %.2f\n", total);
        System.out.println("-------------------------");
    }
}
