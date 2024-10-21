class Laptop {

    private String OS;
    private int RAM;
    private int SSD;
    private String colour;
    private int price;


    public Laptop (String OS, int RAM, int SSD, String colour, int price) {

        this.OS = OS;
        this.RAM = RAM;
        this.SSD = SSD;
        this.colour = colour;
        this.price = price;
    }


    public String getOS() {
        return OS;
    }

    public int getRAM() {
        return RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public void SetOS(String OS) {
        this.OS = OS;
    }

    public void SetRAM(int RAM) {
        this.RAM = RAM;
    }

    public void SetSSD(int SSD) {
        this.SSD = SSD;
    }

    public void SetColour(String Colour) {
        this.colour = colour;
    }

    public void SetPrice(int Price) {
        this.price = price;
    }

    
    @Override
    public String toString()     {
        StringBuilder laptop = new StringBuilder();
        laptop.append("\n\nLaptop Information: \n");
        laptop.append("Operational System: ");
        laptop.append(OS);
        laptop.append('\n');
        laptop.append("RAM: ");
        laptop.append(RAM);
        laptop.append('\n');
        laptop.append("Solid State Drive: ");
        laptop.append(SSD);
        laptop.append('\n');
        laptop.append("Colour: ");
        laptop.append(colour);
        laptop.append('\n');
        laptop.append("Price: ");
        laptop.append(price);
        return laptop.toString();

    } 

}

