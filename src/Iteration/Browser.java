package Iteration;

public class Browser {
    public static void main(String[] args) {

        var history = new BrowserHistory();

        history.push("https://iMohesn.com");
        history.push("https://iMohesn1.com");
        history.push("https://iMohesn2.com");

        // bug =>
//        for(int i = 0; i <= history.getUrls().size(); i++) {
//            System.out.println(history.pop());
//        }

//        for (int i = 0; i < history.getUrls().size(); i++) {
//            System.out.println(history.getUrls().get(i));
//        }


//         =============================================================================
            var iterator = history.createIterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.current());
                iterator.next();
            }
    }
}
