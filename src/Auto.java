public class Auto {
    private String producent;
    private String model;
    private int moc;
    public void setProducent(String x){
        this.producent = x;
        }
    public void setModel(String y){
        this.model = y;
    }
    public void setMoc(int x){
        this.moc = x;
    }

    public Auto(String prod, String mod, int mocc){
        setProducent(prod);
        setModel(mod);
        setMoc(mocc);
    }

    public String getProducent(){
        return this.producent;
    }
    public  String getModel(){
        return  this.model;
    }
    public int getMoc(){
        return this.moc;
    }

}
