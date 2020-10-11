package main.java.com.algorithm.space;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  /**
   * Your MaxQueue object will be instantiated and called as such:
   * MaxQueue obj = new MaxQueue();
   * int param_1 = obj.max_value();
   * obj.push_back(value);
   * int param_3 = obj.pop_front();
   */
  public static void main(String[] args) throws IOException {
    System.out.println("hello world");
    MaxQueue maxQueue = new MaxQueue();
    BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(scanner.readLine());
    for(int i = 0; i < N; i++){
      String[] operate = scanner.readLine().split(" ");
      if(operate[0] == "push"){
        maxQueue.push_back(Integer.parseInt(operate[1]));
      }else if(operate[0] == "poll"){
        maxQueue.pop_front();
      }else if(operate[0] == "max"){
        System.out.println(maxQueue.max_value());
      }
    }
  }
}
