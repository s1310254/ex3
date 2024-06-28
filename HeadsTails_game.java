class HeadsTails_game{
  public static void main(String[] args){
    int head = 0;
    int tail = 0;

    System.out.println("Tossing a coin...");
    for(int i = 1 ; i <= 3 ; i++){
      int res = new java.util.Random().nextInt(2);
      System.out.print("Round " + i + ": ");
      if(res == 0){
        System.out.println("Heads");
        head++;
      }
      else if(res == 1){
        System.out.println("Tails");
        tail++;
      }
    }

  System.out.println("Heads: " + head + ", Tails: " + tail);
  }
}
