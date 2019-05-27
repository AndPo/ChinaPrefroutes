package MainFolder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Main\\Downloads\\China Preferred Routes - From China.csv";
        FileReader fr = new FileReader();
        ArrayList resultList = fr.readFromFile(filePath);
        ArrayList<Route> routes = new ArrayList<Route>();

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }
        for (int i = 0; i < resultList.size(); i++) {
            String[]str = resultList.get(i).toString().split(",");
            routes.add(new Route(str[0],str[1],str[2],str[1],str[14],str[15],str[16],str[17]));
        }
        //System.out.println(resultList.size());
    }
}
