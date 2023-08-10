package di_p;

public class Phone {
   
   String name;
   
   PBattery bat;
   PCrystal cry;
   PCamera ca;
   
   public Phone() {
      System.out.println("Phone 기본생성자");
   }

   public Phone(PBattery bat, PCrystal cry, PCamera ca) {
      super();
      this.bat = bat;
      this.cry = cry;
      this.ca = ca;
      System.out.println("Phone 생성자1");
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setBat(PBattery bat) {
      this.bat = bat;
   }

   public void setCry(PCrystal cry) {
      this.cry = cry;
   }

   public void setCa(PCamera ca) {
      this.ca = ca;
   }

   @Override
   public String toString() {
      return "Phone [name=" + name + ", bat=" + bat + ", cry=" + cry + ", ca=" + ca + "]";
   }
   
   
   
}

class PBattery{
   
   String name;
   int power;
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getPower() {
      return power;
   }
   public void setPower(int power) {
      this.power = power;
   }
   
   @Override
   public String toString() {
      return "PBattery [name=" + name + ", power=" + power + "]";
   }
   
   
   
   
}

class PCrystal{
   
   String name;
   int size;
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getSize() {
      return size;
   }
   public void setSize(int size) {
      this.size = size;
   }
   @Override
   public String toString() {
      return "PCrystal [name=" + name + ", size=" + size + "]";
   }
   
   
   
}

class PCamera{
   
   String name, size;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSize() {
      return size;
   }

   public void setSize(String size) {
      this.size = size;
   }

   @Override
   public String toString() {
      return "PCamera [name=" + name + ", size=" + size + "]";
   }

   
   
   
   
}