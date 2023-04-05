package Observe;

public class App {
    public static void main(String[] args) {

        DataSource dataSource = new DataSource(7);

        Chart chart = new Chart(dataSource);
        Sheet sheet = new Sheet(dataSource);

        dataSource.addObserve(chart);
        dataSource.addObserve(sheet);

        dataSource.setValue(8);
    }
}
