import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Filter {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Windows 10",  4, 256, "red", 4900));
        laptops.add(new Laptop("Windows 11",  64, 512, "black", 18000));
        laptops.add(new Laptop("Windows 8",  16, 256, "green", 7500));
        laptops.add(new Laptop("Windows 10",  32, 512, "white", 12100));
        laptops.add(new Laptop("Mac 16",  32, 256, "white", 16400));
        laptops.add(new Laptop("Mac 16",  16, 512, "black", 10000));
        laptops.add(new Laptop("Mac 12",  8, 128, "grey", 7900));
        laptops.add(new Laptop("Windows 10",  8, 128, "silver", 5900));
        laptops.add(new Laptop("Windows 11",  32, 256, "black", 13400));
        laptops.add(new Laptop("Windows 10",  16, 512, "white", 7800));
        laptops.add(new Laptop("Mac 12",  4, 128, "white", 6700));

            Scanner reader = new Scanner(System.in);
            Map <String, String> param = new HashMap<>();
            int choise;

            while (true) {
                System.out.println("Choose laptop parameters for filter: ");
                System.out.println("1 - Operational System");
                System.out.println("2 - RAM");
                System.out.println("3 - Solid State Drive");
                System.out.println("4 - Colour");
                System.out.println("5 - Price");
                System.out.println("0 - Finish filter input and print results");
                    choise = reader.nextInt();
                        if (choise == 0) {
                            break;
                        }
                        switch(choise) {
                            case 1:
                            System.out.println("Operational System:\n Please type: Windows or Mac");
                            param.put("OS", reader.next());
                        break;
                            case 2:
                            System.out.println("RAM:\n Please type: 4, 8, 16, 32 or 64");
                            param.put("RAM", reader.next());
                        break;
                            case 3:
                            System.out.println("Solid State Drive:\n Please type: 128, 256 or 512");
                            param.put("SSD", reader.next());
                        break;
                            case 4:
                            System.out.println("Color:\n Please type: red, black, green, white, grey or silver");
                            param.put("Colour", reader.next());
                        break;
                            case 5:
                            System.out.println("Price:\n Please type the highest price to pay for a laptop");
                            param.put("Price", reader.next());
                        break;
                            default:
                            System.out.println("Something went wrong, please try again");
                        break;
                        }
                    }

    reader.close ();
    Set <Laptop> filtered = new HashSet<>(laptops);
    for(Map.Entry <String, String> par : param.entrySet()) {
        String key = par.getKey();
        String value = par.getValue();
        switch (key) {
        case "RAM":
            int RAM = Integer.parseInt(value);
            filtered.removeIf(laptop -> laptop.getRAM() <= RAM);
            break;
        case "OS":        
            filtered.removeIf(laptop -> !laptop.getOS().equalsIgnoreCase(value));
            break;
        case "SSD":
            int SSD = Integer.parseInt(value);
            filtered.removeIf(laptop -> laptop.getSSD() <= SSD);
            break;
        case "colour":
            filtered.removeIf(laptop -> !laptop.getColour().equalsIgnoreCase(value));
            break;
        case "price":
            int price = Integer.parseInt(value);
            filtered.removeIf(laptop -> laptop.getPrice() >= price);
            break;
        }
    }
if (filtered.isEmpty()) {
    System.out.println("Sorry, there are no laptops that fit your parameters");
}
else {
    System.out.println("Laptops that fit you parameters: " + filtered);
}
}    
}


