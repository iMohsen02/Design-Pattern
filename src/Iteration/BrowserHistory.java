package Iteration;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        this.urls.add(url);
    }

//    public String pop() {
//        return urls.remove(urls.size() - 1);
//    }
//
//    public List<String> getUrls() {
//        return urls;
//    }

    public Iterator createIterator() {
        return new Iterator();
    }
    public class Iterator implements IIterator<String> {

        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public void next() {
            index++;
        }

        @Override
        public String current() {
            return urls.get(index);
        }
    }
}
