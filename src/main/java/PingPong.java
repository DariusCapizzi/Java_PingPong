import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    //
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String userInput = request.queryParams("number");
      Integer integerNum = Integer.parseInt(userInput);

      ArrayList<String> isPingArray = isPing(integerNum);
      model.put("isPingArray", isPingArray); //do we need this?
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static ArrayList<String> isPing(Integer num) {
    // // what does this return?
    // return year % 4 == 0;
    System.err.print(num);

    ArrayList<String> outList = new ArrayList<String>();




    //for loop
    for (Integer i=1; i <= num; i++) {

    //take num to String
    //put string in array
      if (i % 15 == 0) {

        outList.add("PingPong");
      } else if (i % 5 == 0) {

        outList.add("Ping");
      } else if(i % 3 == 0) {

        outList.add("Pong");
      } else {
        String stringNum = i.toString();
        outList.add(stringNum);
      }
    }

    return outList;
  }
}
