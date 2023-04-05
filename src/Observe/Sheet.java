package Observe;

public class Sheet implements Observe{

    private DataSource dataSource;

    public Sheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("sheet updated: " + dataSource.getValue());
    }
}
