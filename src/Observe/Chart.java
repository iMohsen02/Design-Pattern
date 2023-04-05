package Observe;

public class Chart implements Observe{

    private DataSource dataSource;
    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("chart notified: " + dataSource.getValue());
    }
}
