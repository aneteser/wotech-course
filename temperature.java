// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //winter, spring, summer, autumn
    //warm jacket, t-shirt, swimming suit, rain coat
    

    double temperature = -15;

    if (temperature <= 5){
      System.out.println("It is cold, wear something super warm!");
    }
    else if (temperature >5 & temperature <=15){
      System.out.println("Wear something warm!");
    }
    else if (temperature >15 & temperature <=30){
      System.out.println("Wear something normal!");
    }
    else if (temperature >30){
      System.out.println("Wear t-shirt!");
    } 
    else {
      System.out.println("What is that temperature!");
      }
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
