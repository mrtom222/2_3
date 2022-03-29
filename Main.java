import java.util.Scanner;

class Main {
  
  
  
  public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    String datas = sca.nextLine();
    char[] data = datas.toCharArray();
    
    for(int i = 0;i<datas.length();i++){
      if((int)data[i]>64&&data[i]<97){
        data[i] = (char)((int)data[i]+32);
      }else if((int)data[i]>64&&data[i]>96){
        data[i] = (char)((int)data[i]-32);
      }
    }
    
    System.out.println(data);
  }
}