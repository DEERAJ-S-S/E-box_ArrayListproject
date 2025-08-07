import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Hotel> list = new ArrayList<>();

      while (true) {
         System.out.println("\nMenu:\n1. Add Hotel\n2. Display All Hotels\n3. Search by Hotel Name\n4. Exit");
         int n = sc.nextInt();
         sc.nextLine(); // consume newline

         if (n == 1) {
            System.out.println("Enter hotelName hotelOwner serventCount product1 product2 profit loss");
            String[] a = sc.nextLine().split("\\s+");
            if (a.length < 7) {
               System.out.println("Invalid input! Please enter all 7 values.");
               continue;
            }
            try {
               list.add(new Hotel(
                       a[0], a[1], Integer.parseInt(a[2]),
                       a[3], a[4], Integer.parseInt(a[5]), Integer.parseInt(a[6])
               ));
               System.out.println("Hotel added successfully.");
            } catch (NumberFormatException e) {
               System.out.println("Error: ServentCount, Profit and Loss should be numbers.");
            }

         } else if (n == 2) {
            if (list.isEmpty()) {
               System.out.println("No hotels available.");
            } else {
               for (Hotel hotel : list) {
                  System.out.println(hotel);
               }
            }

         } else if (n == 3) {
            System.out.println("Enter hotel name to search:");
            String searchName = sc.nextLine().trim();
            boolean found = false;

            for (Hotel hotel : list) {
               if (hotel.hotelName.equalsIgnoreCase(searchName)) {
                  System.out.println(hotel);
                  found = true;
               }
            }

            if (!found) {
               System.out.println("Hotel not found with name: " + searchName);
            }

         } else if (n == 4) {
            System.out.println("Exiting...");
            break;

         } else {
            System.out.println("Invalid input. Please enter between 1 to 4.");
         }
      }
   }
}
